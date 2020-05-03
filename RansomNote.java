public boolean canConstruct(String ransomNote, String magazine) {
    if(ransomNote.length() > magazine.length()) {
        return false;
    }

    HashMap<Character, Integer> magazineMap = new HashMap<>();
    for(char m : magazine.toCharArray()) {
        if(magazineMap.containsKey(m)){
            magazineMap.put(m, magazineMap.get(m) + 1);
        } else {
            magazineMap.put(m, 1);
        }
    }

   for (char r : ransomNote.toCharArray()) {
       int getMCount = magazineMap.getOrDefault(r, 0);
       if(getMCount == 0) {
           return false;
       }
       magazineMap.put(r, magazineMap.get(r) - 1);
   }

    return true;
}

/*
 1. Check if ransomNote is more than magazine : if yes then false (definitely can't construct a note)
 2. Create a hashmap to store the the key (character) and value (count of the character in the string) for magazine string
 3. For each character of ransomNote --> we check if character exists in magazine map --> if yes then we obtain the value and -1;
 4. In between we can check if ransomNote is 0 in magazineMap then return false; 
*/
