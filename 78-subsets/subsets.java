class Solution {
    public void subsets(int idx,ArrayList<Integer> ds,int[] nums,int n, List<List<Integer>> ans){
        if(idx==n){
            ans.add(new ArrayList<>(ds));
            return ;
        }
            ds.add(nums[idx]);
            subsets(idx+1,ds,nums,n,ans);
            ds.remove(ds.size()-1);
            subsets(idx+1,ds,nums,n,ans);
          

            
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        subsets(0,ds,nums,n,ans);

        
        return ans;
    }
}