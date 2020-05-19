public int maxSubarraySumCircular(int[] A) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int current1 = 0;
    int current2 = 0;
    int total = 0;

    for(int i = 0; i < A.length; i++) {
        current1 = current1 + A[i];
        max = Math.max(max, current1);
        current1 = Math.max(current1, 0);

        current2 = current2 + A[i];
        min = Math.min(min, current2);
        current2 = Math.min(current2, 0);

        total = total + A[i];
    }

    return max < 0 ? max : Math.max(max, total - min);
}

/*
 * Kadane Algorithm.
 * Understanding Kadane Algorithm allows you to do O(n). 
 * Kadane state that :
 *  1. Going through the array 
 *      --> we can first count the current += A[i] //adding up the potential max contiguously
 *      --> Compare the max value with the current and see which is max
 *      --> No point to keep current negative therefore, check if current is bigger than 0 if so keep current else 0
 * Based on Kadene solution we can also determine min 
 * 2. Therefore, since is circular array, we can go through the circular array by using total - min 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
