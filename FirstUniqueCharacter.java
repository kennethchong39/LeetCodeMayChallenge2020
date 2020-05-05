public int firstUniqChar(String s) {
    HashMap<Character, Integer> map = new HashMap<>();

    for(char c : s.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for(int i = 0; i < s.length(); i++) {
        if(map.get(s.charAt(i)) == 1) {
            return i;
        }
    }

    return -1;
}

/*
 * 1. To store all characters in HashMap where key is the character, and value is the total char in string s.
 * 2. Then loop through by index from 0 -> n : whichever character touches 1 first then that is the unique first character.
 * 3. else return -1;
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
