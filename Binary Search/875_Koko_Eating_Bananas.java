class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        for(int e: piles) {
            end += e;
        }
        while(start < end) {
            int mid = start + (end - start) / 2;
            if( isFeasible(piles, mid, h))
                end = mid;
            else
                start = mid + 1;
        }
       return start;
    }
    public boolean isFeasible(int[] piles, int b, int h) {
        int H = 0;
        for(int e: piles) {
            H += Math.ceil((double)e/b);
        }
        return H <= h;
    }
}
