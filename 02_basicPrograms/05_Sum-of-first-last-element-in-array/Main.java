class Solution {
    public int sumOfFirstAndLast(int[] nums) {
        int n = nums.length;

        if(n == 0) return 0;

        return nums[0] + nums[n - 1];
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // int[] nums = {};

        int[] nums = {2, 3, 4, 5, 6};
        
        System.out.println(sol.sumOfFirstAndLast(nums)); 
    }
}
