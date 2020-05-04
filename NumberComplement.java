public int findComplement(int num) {
    int getHighestBit = Integer.highestOneBit(num);
    int shiftLeftByOne = getHighestBit << 1; 
    int minusOne = shiftLeftByOne - 1;
    return minusOne ^ num;
}

/*
 * We can always get the highest bit, ex: 5 = 101 will return 4 = 100
 * then shift left by one 100 --> 1000 return 8 in int
 * then minus 1 --> will get you 111 which return 7 in int
 * OR operator to convert 7 OR 5 into 2; 
 */
