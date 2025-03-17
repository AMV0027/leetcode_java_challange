class Solution {
    public boolean divideArray(int[] nums) {
        if (nums.length % 2 != 0) {
            return false;
        }
        
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        
        return set.size() == 0;
    }
}