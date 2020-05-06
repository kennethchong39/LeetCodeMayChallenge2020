public int majorityElement(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int max = -1;
    for(int i : nums){
        map.put(i, map.getOrDefault(i, 0) + 1);
        int checkValue = map.get(i);
        max = Math.max(max, checkValue);
    }

    for(int i : nums) {
        if(map.get(i) == max){
            return i;
        }
    }

    return 0;
}

/*
 * Using HashMap to store nums[i] as keys and total nums[i]'s in array as values;
 *  at the same time keeping track the max value in hand. 
 * Then loop through to find out which number to matches the max value; 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
