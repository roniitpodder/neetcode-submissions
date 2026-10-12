class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 0;
        for(int pile : piles){
            r = Math.max(r,pile);
        }
        while(l < r){
            int mid = (l + r) / 2;
            int hrs = 0;
            for(int pile : piles){
                hrs += (int) Math.ceil((double) pile / mid);
            }
            if(hrs <= h){
                r = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
    }
}
