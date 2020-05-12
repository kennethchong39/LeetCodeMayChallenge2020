public int singleNonDuplicate(int[] nums) {
    for(int i = 0; i < nums.length - 1; i++) {
        if(nums[i] != nums[i+1]) {
            return nums[i];
        }
        i++;
    }
    return nums[nums.length-1];
}

/*
 * Simple two pointer question. Given sorted array and there's definitely one non duplicate element. 
 * Loop through the array, increment by 2, check if current and next is same, else return current. 
 * The loop only check until nums.length-1; if non duplicate is last element return last element.  
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
