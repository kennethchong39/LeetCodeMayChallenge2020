public int findJudge(int N, int[][] trust) {
    if(trust.length == 0 && N == 1) {
        return N;
    }

    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i = 0; i < trust.length; i++) {
        int current = trust[i][0];
        int currentTrust = trust[i][1];
        map.putIfAbsent(current, 0);
        map.putIfAbsent(currentTrust, 0);
        map.put(current, map.get(current) - 1);
        map.put(currentTrust, map.get(currentTrust) + 1);

    }

    for(int j = 1; j <= N; j++) {
        if(map.containsKey(j) && map.get(j) == N-1) {
            return j;
        }
    }

    return -1;
}

/*
 * Note: this is not the faster solution, slow but if use one array to monitor is faster
 * 1. using hashmap to store the number of trust as value and key is the person. 
 * 2. First check if in HashMap, if no add it to the map, then -1 to current and +1 to currentTrust;
 * This help to identify who is the town judge by knowing the fact that N-1 will identify the town judge. 
 * Time Complexity: O(N);
 * Space Complexity: O(N);
 */
