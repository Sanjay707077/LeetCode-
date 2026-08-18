import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        String u = s.toUpperCase();
        
        StringBuilder sb = new StringBuilder();
        for (int i = u.length() - 1; i >= 0; i--) {
            char p = u.charAt(i);
            if (!Character.isLetterOrDigit(p)) {
                continue;
            }
            sb.append(p);
        }
        String reversedResult = sb.toString();

        StringBuilder forwardSb = new StringBuilder();
        for (int i = 0; i < u.length(); i++) {
            char p = u.charAt(i);
            if (!Character.isLetterOrDigit(p)) {
                continue;
            }
            forwardSb.append(p);
        }
        String forwardResult = forwardSb.toString();

        return forwardResult.equals(reversedResult);
    }
}
