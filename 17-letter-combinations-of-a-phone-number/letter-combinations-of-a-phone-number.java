class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res= new ArrayList<>();

        if(digits== null || digits.length()==0)
        {
            return res;
        }
        Map<Character, String> dl= new HashMap<>();
        dl.put('2', "abc");
        dl.put('3', "def");
        dl.put('4', "ghi");
        dl.put('5', "jkl");
        dl.put('6', "mno");
        dl.put('7', "pqrs");
        dl.put('8', "tuv");
        dl.put('9', "wxyz");

        backtrack(digits, 0, new StringBuilder(), res, dl);
        return res;
    }
    public void backtrack(String digits, int idx, StringBuilder comb,
    List<String> res, Map<Character, String> len)
    {
        if(idx== digits.length())
        {
            res.add(comb.toString());
            return;
        }
        String letters= len.get(digits.charAt(idx));
        for(char letter: letters.toCharArray())
        {
            comb.append(letter);
            backtrack(digits, idx+1, comb, res, len);
            comb.deleteCharAt(comb.length()-1);
        }
    }
}