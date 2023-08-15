class Solution {
     public int minDays(int[] bloomDay, int m, int k) {
        if((bloomDay.length - 1) /k < m)
            return -1;
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        for(int e : bloomDay) {
            start = Math.min(start, e);
            end = Math.max(end, e);
        }

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(isFesible(bloomDay,mid,m,k))
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
    public boolean isFesible(int[] bloomDay, int day, int m, int k) {
        int bonquets = 0;
        int flowers = 0;
        for(int e: bloomDay) {
                 if(e > day)
                     flowers = 0;
                 else {
                     bonquets += (flowers + 1) / k;
                     flowers = (flowers + 1) % k;
                 }
        }
        return bonquets >= m;
    }
   
}
