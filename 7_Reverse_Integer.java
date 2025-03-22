class Solution {
    public int reverse(int x) {
        int sign = (x < 0) ? -1 : 1;
        try{
            x = Math.abs(x);
            return Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString()) * sign;
        }catch(Exception e){
            return 0;
        }
    }
}