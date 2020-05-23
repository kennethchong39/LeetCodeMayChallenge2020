public int[][] intervalIntersection(int[][] A, int[][] B) {
    int i = 0;
    int j = 0;
    List<int[]> resultList = new ArrayList<>();

    while ( i <= A.length-1 && j <= B.length-1) {
        int maxLow = Math.max(A[i][0], B[j][0]);
        int minHigh = Math.min(A[i][1], B[j][1]);
        if(maxLow <= minHigh) {
            resultList.add(new int[]{maxLow, minHigh});
        }

        if(A[i][1] < B[j][1]) {
            i++;
        } else {
            j++;
        }
    }

    int[][] result = new int[resultList.size()][2];
    resultList.toArray(result);

    return result;
}

/*
 * Here we need to understand how to obtain the answer. 
 * We can use maxLow to get he lowest maximum it will intersect and minHigh to get which A/B will end first. 
 * If maxLow is less than minHigh then there's an intersection 
 * Using two pointer, if A[i][1] < A[j][1] then increment the i pointer else increment the j pointer. 
 * Time Complexity: O(m+n)
 * Space Complexity: O(m+n)
 */
