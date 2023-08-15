class Solution {
    public int findKthNumber(int m, int n, int k) {
        int start = 1;
        int end = n*m;
        while(start < end) {
            int mid = start +(end - start) / 2;
            if(isEnough(mid,m,n,k))
               end = mid;
            else
               start  = mid + 1;
        }
        return start;
    }
    public static boolean isEnough(int num, int m,int n, int k) {
        int count = 0;
        for(int i= 1;i<=m;i++) {
            count  += Math.min(num/i , n);
            if(count == 0)
            return count >=k;
        }
        return count >= k;
    }
}
