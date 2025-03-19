class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int maxL = 1;
        int left = 0;
        int usedBits = 0;

        for(int right = 0; right < n; right++){
            while((usedBits & nums[right]) != 0){
                usedBits ^= nums[left];
                left++;
            }
            usedBits |= nums[right];
            maxL = Math.max(maxL, right - left + 1);
        }
        return maxL;
    }
}