import java.util.ArrayList;

class Solution {
    public int reverse(int y) {
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        String c = Integer.toString(y);
        String r = s.append(c).reverse().toString();
        for (char x : r.toCharArray()) 
        {
            if (x == '-') 
            {
                list1.add(x);
            } 
            else if (x == '0' && list2.isEmpty()) 
            {
                continue; 
            } 
            else if (Character.isDigit(x))
            {
                list2.add(x); 
            }
        }
        list1.addAll(list2);
        StringBuilder finalBuilder = new StringBuilder();
        for (char ch : list1) {
            finalBuilder.append(ch);
        }
        
        try {
            return Integer.parseInt(finalBuilder.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
