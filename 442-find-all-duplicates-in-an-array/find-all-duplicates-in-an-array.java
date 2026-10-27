class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            while (nums[i] != nums[nums[i] - 1]) {
                int correct = nums[i] - 1;

                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                ans.add(nums[i]);
            }
        }

        return ans;
    }
}