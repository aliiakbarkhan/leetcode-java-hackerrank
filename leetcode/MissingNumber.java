class Solution {
    public int missingNumber(int[] nums) {
        int missing = 0;
        for(int i = 0; i<=nums.length; i++){
        int check = 0;
            for(int j = 0; j<nums.length; j++){
                if(i != nums[j]){
                   missing = i;
                   check++;
                   if(check == nums.length){
                    return missing;
                   }
                }
                else{
                    break;
                }
            }
        }
        return 0;

        
    }
}