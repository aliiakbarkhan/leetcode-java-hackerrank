class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }
        for(int i = nums.length-1; i>=0; i--){
            if(target > nums[i]){
                return i+1;
            }
        }
        // for(int i = 0; i<nums.length; i++){
        //     if(max == nums[i]){
        //         Agreee = 1;
        //         return i+1;
        //     }

        // }
        
        return 0;
    }
}