class Solution {
    public int maxProduct(int[] nums) {
        int maxsum = nums[0];
        int maxProduct = nums[0]; 
        int minProduct = nums[0]; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            maxsum = Math.max(maxsum, maxProduct);
        }
        return maxsum;
    }
}
