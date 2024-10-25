class Solution {
    public int findMaxConsecutiveOnes(int[] num) {
        int most = 0;
        int most2 = 0;
        for(int i = 0; i<num.length; i++){
            if(num[i] == 1){
                most++;
                if(most2 < most){
                    most2 = most;
                }
            }
            else if(num[i] != 1 || num[i] == num.length-1){
                if(most2 < most){
                    most2 = most;
                }
                most = 0;
            }
        }
        return most2;
    }
}