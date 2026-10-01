class Solution {
    public int[] rearrangeArray(int[] nums) {
     int[] arr = new int[101];
        for(int x : nums){
            arr[x]++;
            
        }
        int[] answer= new int[nums.length];
        int index = 0;

        while(index < nums.length){
            for(int i =1;i<=100;i++){
                if(arr[i]>0){
                    answer[index]=i;
                    index++;
                    arr[i]--;
                }
            }
        }
        return answer;
    }
}