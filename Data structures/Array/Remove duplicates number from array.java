//Remove duplicates from array| keep only one instance of number in array only

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int cnt = 1;
        int curr = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != curr) {
                
                curr = nums[i];
                nums[cnt] = nums[i];
                cnt++;
                
            }
        }
        return cnt;
        
    }
}

