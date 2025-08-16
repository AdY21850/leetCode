class Solution {
    public int minEatingSpeed(int[] piles, long h) {
        long left = 1;
        long right = 0;
        for (int p : piles) right = Math.max(right, p); 

        

        while (left <= right) {
            long mid = (left + right) / 2;

            long hours = 0;
            for (int p : piles) {
                hours += (p + mid - 1) / mid;
            }

            if (hours <= h) {
               
                right = mid -1;  
            } else {
                left = mid + 1;  
            }
        }

        return (int) (right+1);
    }
}