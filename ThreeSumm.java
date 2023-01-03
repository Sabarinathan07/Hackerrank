class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2 && nums[i] <= 0;) {
            int left = i + 1, right = nums.length - 1;
            int sum = 0;
            if (0 - nums[i] - nums[left] < 0) {
                break;
            }
            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else {
                    if (sum == 0) {
                        resultSet.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        right--;
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }
                    ++left;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }
            i++;
            while (i < nums.length - 2 && nums[i] == nums[i - 1]) {
                i++;
            }
        }
        return new ArrayList<>(resultSet);
    }
}
