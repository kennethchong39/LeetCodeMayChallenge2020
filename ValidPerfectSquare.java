public boolean isPerfectSquare(int num) {
    if(num <= 0) return false;
    if(num == 1) return true;

    long start = 2;
    long end = num/2; // 1 < x < num/2

    while (start <= end) {
        long mid = (start + end) / 2;
        long sq = mid * mid;
        if(sq == num) return true;
        if(sq > num) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
    return false;
}

/*
 * Here to get perfect square : 1 < x < num/2 where x * x = Math.sq(x * x)
 * Using binary search:
 *    1. we first start from 2 to num/2
 *    2. each time we create a mid to find out if matches num then return true
 *    3. if mid * mid > num then end = mid - 1; else start = mid + 1;
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
