class Solution {
    public int countCommas(int n) {
        int st=String.valueOf(n).length();
        int c=0;
        if(n>999)
        {
        for(int i=1000;i<=n;i++)
        {
        c=c+((st-1)/3);
        }
        return c;
        }
        return 0;
    }
}