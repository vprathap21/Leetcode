class Solution {
    public int shipWithinDays(int[] weights, int days) {
         int start = Integer.MIN_VALUE;
         int end = 0;
         for(int e : weights) {
             start = Math.max(start,e);
             end += e;
         }
         while(start < end) {
             int mid = start + (end - start) / 2;
             if(isFeasible(weights,mid,days))
                 end = mid;
             else
                 start = mid + 1;
         }
         return start;

    }

    public boolean isFeasible(int[] weight,int n,int days) {
        int D = 1;
        int sum =0;
       for(int e : weight) {
           sum += e;
           if(sum > n) {
               D++;
               sum = e;
           }
       }
        return D <= days;
     }
}
