class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
      int start = 1;
      int end = Integer.MIN_VALUE;
      for(int e : nums)
          end = Math.max(end,e);
      while(start < end) {
          int mid = start + (end - start) / 2;
          if(isFeasible(nums, mid, threshold))
              end = mid;
          else
              start = mid + 1;
      }
      return start;

    }
    public boolean isFeasible(int[] nums, int d, int threshold) {
        int sum = 0;
        for(int e : nums) 
             sum += Math.ceil((double)e / d);
        
        return sum <= threshold;
    }
}
