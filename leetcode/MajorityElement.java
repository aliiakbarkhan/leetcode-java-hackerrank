class Solution {
    public int majorityElement(int[] nums) {
     int most = 0;
     int max = 0;

     for(int i = 0; i<nums.length; i++){
        int count = 0;
        for(int j = i+1; j<nums.length; j++){
            if(nums[i] == nums[j]){
                count++;
            }
        }
        if(most <= count){
            most  = count;
            max = nums[i];
        }
     }
     return max;  
    }
}