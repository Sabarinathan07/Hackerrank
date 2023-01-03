
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                int temp = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - temp) < minDiff) {
                    ans = temp;
                    minDiff = Math.abs(target - temp);
                }
                if (temp == target) {
                    return target;
                } else if (temp > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return ans;

    }
}