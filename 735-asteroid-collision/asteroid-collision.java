class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer> s= new Stack<>();
        int n= ast.length;

        for(int a: ast)
        {
            if(a>0)
            {
                s.push(a);
            }
            else
            {
                while(!s.isEmpty() && s.peek()>0 && s.peek()<-a)
                {
                    s.pop();
                }
                if(s.isEmpty() || s.peek()<0)
                {
                    s.push(a);
                }
                if(s.peek()== -a)
                {
                    s.pop();
                }
            }
        }
        int res[]= new int[s.size()];
        int i= s.size()-1;

        while(!s.isEmpty())
        {
            res[i--]= s.pop();
        }
        return res;
    }
}