class Solution {
    public int maxArea(int[] height) {
        int maxwater=0;
        int i=0;
        int j=height.length-1;
        while(j>i){
            int width=j-i;
            int level=Math.min(height[i],height[j]);
            maxwater=Math.max(maxwater,width*level);

            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return maxwater;

    }
}
