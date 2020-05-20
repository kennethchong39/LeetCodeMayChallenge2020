public boolean checkInclusion(String s1, String s2) {
    int[] arrayS1 = new int[26];
    int[] arrayS2 = new int[26];

    for(char a : s1.toCharArray()) {
        arrayS1[(int) (a - 'a')]++;
    }

    for(int i = 0; i < s2.length(); i++) {
        arrayS2[(int) (s2.charAt(i) - 'a')]++;

        if(i >= s1.length()) {
            arrayS2[(int) (s2.charAt(i-s1.length()) - 'a')]--;
        }

        if(Arrays.equals(arrayS1, arrayS2)) {
            return true;
        }
    }
    return false;
}

/*
 * Same as Find all the anagrams
 * Time Complexity:  O(n);
 * Space Complexity: O(1);
 */
