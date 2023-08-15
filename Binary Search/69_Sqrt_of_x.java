class Solution {
    public int mySqrt(int x) {
        if(x < 2)
          return x;
        int start = 1, end = x;
        while (start < end) {
            int mid = start + (end - start + 1) / 2;
            if((long)mid * mid > x)
                end = mid - 1;
            else
                start = mid;
        }
        return start;
    }
}
