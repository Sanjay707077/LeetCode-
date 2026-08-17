import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> arr = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) 
                {
                    arr.add(1);
                } 
                else
                {
                    List<Integer> prev = triangle.get(i - 1);
                    int num = prev.get(j - 1) + prev.get(j);
                    arr.add(num);
                }
            }
            triangle.add(arr);
        }
        return triangle.get(rowIndex);
    }
}
