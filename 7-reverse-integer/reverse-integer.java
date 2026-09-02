class Solution {
    public int reverse(int x) {
        int result=0;
        int digit;
        while(x != 0){
            digit = x % 10;
            x = x / 10;
            if(result>Integer.MAX_VALUE/10||result<Integer.MIN_VALUE/10){
                return 0;
            }
            result = result * 10 + digit;
        }
        return result;
    }  
}