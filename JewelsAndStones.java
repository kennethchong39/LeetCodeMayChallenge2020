public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        for(char j : J.toCharArray()){
            set.add(j);
        }
        int totalStones = 0;
        for(char s : S.toCharArray()) {
            if(set.contains(s)){
                totalStones++;
            }
        }
        
        return totalStones;
}

/*
Using hashset to speed up the process
Algorithm:
1. Create a hashset
2. Initialize totalStonesFound
3. Store every Jewels in hashset
4. In every Stones: find if current stone is in hashset
  4a. If yes --> increment totalStonesFound
*/
