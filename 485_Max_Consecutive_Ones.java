class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, cnt = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                cnt++;
            }else{
                max = (max >  cnt) ? max : cnt;
                cnt = 0;
            }
        }
        max = (max >  cnt) ? max : cnt;
        return max;
    }
}