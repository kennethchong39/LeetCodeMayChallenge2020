public List<Integer> findAnagrams(String s, String p) {
   List<Integer> result = new ArrayList<>();

   int[] arrayP = new int[26];
   int[] arrayS = new int[26];

   for(char pC : p.toCharArray()) {
       arrayP[(int) (pC - 'a')]++;
   }

   for(int i = 0; i < s.length(); i++) {
       arrayS[(int) (s.charAt(i) - 'a')]++;

       if(i >= p.length()) {
           arrayS[(int) (s.charAt(i-p.length()) - 'a')]--;
       }

       if(Arrays.equals(arrayP, arrayS)) {
           result.add(i-p.length()+1);
       }
   }

   return result;
}

/*
 * In order to find all anagrams we can construct a sliding window with 2 arrays
 * First, construct the P array with whichever character consists in the String P with ++; 
 * Second, loop through the string S 
 *  -> increment by 1 of that character in array S
 *  -> if i is more than equals p.length then we minus one char away (sliding window)
 *  -> compare arrayS with arrayP if both matches then it's a permutation of the string p then add it to the list result.
 * Finally, return the list of result
 * Time Complexity: O(n) = O(n(s) + n(p))
 * Space Complexity: O(1)
 */
