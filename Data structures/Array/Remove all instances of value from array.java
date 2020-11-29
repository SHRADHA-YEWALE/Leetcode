/* Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length. 

Example 1:

Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.

It doesn't matter what you leave beyond the returned length. */

class Solution {
    /** Logic is to remove all the instances of the value to be removed at the end of array
     * by swapping it with ending elements and delete it's instances from the end of an array
    **/
    public int removeElement(int[] nums, int val) {
        int swap = nums.length - 1;
        int n = nums.length -1;
        int cnt = 0;
        if(nums.length == 1 && nums[0] == val) return 0;
        
        for(int i: nums) {
            if(i == val) cnt++;
        }
        for(int i = 0; i <= (n - cnt); i++) {
            if(nums[i] == val) {
                while(nums[swap] == val) {
                    swap--;
                }
                int t = nums[i];
                nums[i] = nums[swap];
                nums[swap] = t;
                swap--;
                
            }
        } 
        
        int l = (nums.length - cnt);
        return l;
        
    }
}