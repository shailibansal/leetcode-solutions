class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int ext) {
        int n= candies.length;
        int arr[]= new int[candies.length];
        for(int i=0; i<candies.length; i++)
        {
            arr[i]= candies[i];
        }
        Arrays.sort(arr);
        int max= arr[n-1];
        Boolean ans[]= new Boolean[n];
        for(int i=0; i<n; i++)
        {
            int temp= candies[i]+ ext;
            if(temp>= max)
            {
                ans[i]= true;
            }
            else
            {
                ans[i]= false;
            }
        }
        List<Boolean> list= Arrays.asList(ans);
        return list;
    }
}