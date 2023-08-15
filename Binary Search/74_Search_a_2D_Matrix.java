class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int n= matrix.length;
        int m = matrix[0].length;
    
      int start = 0,end = (n*m) -1;
      while(start <= end) {
          int mid = start + (end - start)/2;
          int cur = matrix[mid/m][mid%m];
          if(cur  == target)
          return true;
          else if(cur < target)
          start = mid + 1;
          else
          end  = mid - 1;
      }
      return false;
    
    }
}
