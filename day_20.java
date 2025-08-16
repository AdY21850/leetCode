class Solution {
    public boolean isPowerOfFour(int a) {
        if (a<1){
            return false;
        }
        while (a % 4 == 0) {
            a /= 4;
        }
        return a == 1;
    }
}