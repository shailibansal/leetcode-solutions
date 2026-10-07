class Solution {
    public int maxVowels(String s, int k) {
        int left= 0;
        int count= 0;
        int ans= 0;

        for(int r=0; r<s.length(); r++)
        {
            char c= s.charAt(r);
            if(vowel(c))
            {
                count++;
            }
            if(r-left+1 > k)
            {
                if(vowel(s.charAt(left)))
                {
                    count--;
                }
                left++;
            }
            ans= Math.max(ans, count);
        }
        return ans;
    }
    public boolean vowel(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u')
        {
            return true;
        }
        return false;
    }
}