public String frequencySort(String s) {
    HashMap<Character, Integer> map = new HashMap<>();

    for(char c : s.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    List<Character> characters = new ArrayList<>(map.keySet());
    Collections.sort(characters, (a,b) -> map.get(b) - map.get(a));

    StringBuilder sb = new StringBuilder();

    for(char c : characters) {
        int total = map.get(c);
        for(int i = 0; i < total; i++) {
            sb.append(c);
        } 
    }

    return sb.toString();
}

/*
 * Use HashMap, Arraylist and Collections.sort()
 * Store the char and frequency occured in String S into HashMap.
 * Use a list to hold the map.keySet() of map in arraylist. 
 * Collections.sort(list, (a,b) -> map.get(b) - map.get(a));
 * Use a string builder to append the string through for every C in collection.
 * Append based on the total frequency in map. 
 * Time Complexity: O(nlogn)
 * Space Complexity: O(n)
 */
