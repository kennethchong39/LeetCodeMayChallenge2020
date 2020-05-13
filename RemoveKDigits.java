public String removeKdigits(String num, int k) {
    if(num.length() == k) {
        return "0";
    }

    StringBuilder sb = new StringBuilder(num);

    for(int i = 0; i < k; i++) {
        int j = 0;
        while(j < sb.length()-1 && sb.charAt(j) <= sb.charAt(j+1)) {
            j++;
        }
        sb.delete(j, j+1);
    }

    while(sb.length() > 1 && sb.charAt(0) == '0') {
        sb.delete(0, 1);
    }

    return sb.toString();
}

/*
 * So the fact that this works is because when going through left to right if the number is small to big is always the smallest,
 * It's also important to know if 12345 the smallest is 1234 is remove 1 digit. 
 * 1. we check if length of nums is same as k then return 0;
 * 2. Using StringBuilder, we go through the string from left to right.
 * 3. Go through each 1 -> k, delete the current number if the next is smaller. 
 * 4. delete 0 in front if there's 0.
 * 5. return toString
 * Time complexity: O(kn)
 * Space Complexity: O(1) - didn't use any space 
 */
