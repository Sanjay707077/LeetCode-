import java.util.*;

class Solution {

public List<Boolean> palindromePath(int n, int[][] edges, String s, String[] queries) {

    List<Integer>[] adj = new ArrayList[n];

    for (int i = 0; i < n; i++) {
        adj[i] = new ArrayList<>();
    }

    for (int[] edge : edges) {
        adj[edge[0]].add(edge[1]);
        adj[edge[1]].add(edge[0]);
    }

    char[] chars = s.toCharArray();

    int[] parent = new int[n];
    int[] depth = new int[n];
    int[] tin = new int[n];
    int[] tout = new int[n];
    int[] prefixMask = new int[n];
    int[] next = new int[n];
    int[] stack = new int[n];

    int timer = 0;
    int top = 0;

    parent[0] = 0;
    prefixMask[0] = 1 << (chars[0] - 'a');
    tin[0] = ++timer;
    stack[top] = 0;

    while (top >= 0) {

        int u = stack[top];

        if (next[u] < adj[u].size()) {

            int v = adj[u].get(next[u]++);

            if (v == parent[u]) {
                continue;
            }

            parent[v] = u;
            depth[v] = depth[u] + 1;

            prefixMask[v] = prefixMask[u]
                    ^ (1 << (chars[v] - 'a'));

            tin[v] = ++timer;
            stack[++top] = v;

        } else {

            tout[u] = timer;
            top--;
        }
    }

    int LOG = 1;

    while ((1L << LOG) <= n) {
        LOG++;
    }

    int[][] up = new int[LOG][n];

    for (int i = 0; i < n; i++) {
        up[0][i] = parent[i];
    }

    for (int k = 1; k < LOG; k++) {
        for (int i = 0; i < n; i++) {
            up[k][i] = up[k - 1][up[k - 1][i]];
        }
    }

    Fenwick fenwick = new Fenwick(n);

    List<Boolean> result = new ArrayList<>();

    for (String query : queries) {

        String[] parts = query.split(" ");

        if (parts[0].equals("update")) {

            int u = Integer.parseInt(parts[1]);
            char c = parts[2].charAt(0);

            if (chars[u] != c) {

                int change = (1 << (chars[u] - 'a'))
                        ^ (1 << (c - 'a'));

                chars[u] = c;

                fenwick.rangeXor(tin[u], tout[u], change);
            }

        } else {

            int u = Integer.parseInt(parts[1]);
            int v = Integer.parseInt(parts[2]);

            int lca = findLCA(u, v, depth, up);

            int maskU = prefixMask[u] ^ fenwick.query(tin[u]);
            int maskV = prefixMask[v] ^ fenwick.query(tin[v]);

            int pathMask = maskU ^ maskV
                    ^ (1 << (chars[lca] - 'a'));

            result.add((pathMask & (pathMask - 1)) == 0);
        }
    }

    return result;
}

private int findLCA(int a, int b, int[] depth, int[][] up) {

    if (depth[a] < depth[b]) {
        int temp = a;
        a = b;
        b = temp;
    }

    int diff = depth[a] - depth[b];

    for (int k = up.length - 1; k >= 0; k--) {
        if ((diff & (1 << k)) != 0) {
            a = up[k][a];
        }
    }

    if (a == b) {
        return a;
    }

    for (int k = up.length - 1; k >= 0; k--) {
        if (up[k][a] != up[k][b]) {
            a = up[k][a];
            b = up[k][b];
        }
    }

    return up[0][a];
}

class Fenwick {

    int[] bit;

    Fenwick(int n) {
        bit = new int[n + 2];
    }

    void add(int index, int value) {
        while (index < bit.length) {
            bit[index] ^= value;
            index += index & -index;
        }
    }

    int query(int index) {

        int result = 0;

        while (index > 0) {
            result ^= bit[index];
            index -= index & -index;
        }

        return result;
    }

    void rangeXor(int left, int right, int value) {
        add(left, value);
        add(right + 1, value);
    }
}


}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna