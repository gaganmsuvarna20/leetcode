class Solution {
    public long flowerGame(int n, int m) {
        long evenX =(n/2);
        long oddX = (n + 1) / 2;

        long evenY =(m/2);
        long oddY = (m + 1) / 2;

        return evenX*oddY + evenY*oddX ;
    }
}