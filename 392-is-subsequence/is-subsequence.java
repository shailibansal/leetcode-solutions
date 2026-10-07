class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp= 0;
        int tp= 0;
        int n= s.length();
        int m= t.length();

        while(sp<n && tp<m)
        {
            if(s.charAt(sp)== t.charAt(tp))
            {
                sp++;
            }
            tp++;
        }
        return sp==n;
    }
}