class Solution {
    public int splitArray(int[] nums, int k) {
      int start = 0;
      int end = 0;
      for(int e : nums) {
          start = Math.max(start,e);
          end += e;
      }
      while(start < end) {
          int mid = start + (end - start) / 2;
          if(isFeasible(nums,mid, k))
              end = mid;
          else
              start = mid + 1;
      }
      return start;

    }
    public boolean isFeasible(int[] nums, int n, int k) {
        int pices = 1;
        int sum =0;
        for(int e : nums) {
            sum += e;
            if(sum > n) {
                pices++;
                sum = e;
            }
        }
        return pices <= k;
    }
  
}
