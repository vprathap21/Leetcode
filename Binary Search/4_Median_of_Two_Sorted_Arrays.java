class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
     if(n > m)
        return findMedianSortedArrays(nums2, nums1);

     int start = 0;
     int end = n;
     int left = (n + m + 1) / 2;
     while(start <= end) {
         int mid1 = (start + end) / 2;
         int mid2 = left - mid1;
         int l1 = (mid1 == 0) ? Integer.MIN_VALUE:nums1[mid1 - 1];
         int r1 = (mid1 == n) ? Integer.MAX_VALUE:nums1[mid1];

         int l2 = (mid2 == 0) ? Integer.MIN_VALUE:nums2[mid2 - 1];
         int r2 = (mid2 == m) ? Integer.MAX_VALUE:nums2[mid2];
         if(l1 <= r2  && l2 <= r1){
             if((n + m) % 2 == 1)
             return (double)Math.max(l1,l2);
             else
             return ((double)Math.max(l1,l2)+Math.min(r1,r2))/2;
          }
         else if(l1 > r2)
           end = mid1 - 1;
         else
          start = mid1 + 1;
     }
     throw new IllegalArgumentException();
    }
    
    
} 
