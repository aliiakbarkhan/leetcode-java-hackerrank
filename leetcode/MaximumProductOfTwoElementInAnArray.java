class Solution {
    public int maxProduct(int[] n) {
        int ie = 0;
        int je = 0;
        for(int i = 0; i<n.length; i++){
            if(ie <= n[i]){
                ie = n[i];
            }
        }

        for(int i = 0; i<n.length; i++){
            if(ie == n[i]){
                n[i] = 0;
                break;
            }
        }

        for(int i = 0; i<n.length; i++){
            if(je <= n[i]){
                je = n[i];
            }
        }
        int ans = (ie-1)*(je-1);
        return ans;

    }
}