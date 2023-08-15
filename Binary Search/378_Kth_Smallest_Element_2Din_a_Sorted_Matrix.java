class Solution {
    int n, m;
    public int kthSmallest(int[][] matrix, int k) {
        n = matrix.length; m = matrix[0].length;
        int start = matrix[0][0], end = matrix[n-1][m-1];
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(isfeasible(matrix,mid,k))
             end = mid;
            else
             start = mid + 1;
        }
        return start;
    }
    public boolean isfeasible(int[][] matrix, int x, int k) {
        int cnt = 0, c = m-1;
       for(int i =0;i<n;i++) {
           while(c >= 0 && matrix[i][c] > x) c--;
           cnt += (c + 1);
       }
       return cnt >= k;
    }
}
