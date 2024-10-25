class Solution {
    public boolean isPalindrome(int x) {
        int x2=x;
        int remain = 0;
        int count = 0;
        int i =0;
        while (x2 != 0) {
            x2 = x2/10;
            count++;
        }
        int[] a = new int[count];
        x2 = x;
        while(x2!=0){
            remain = x2%10;
            a[i] = remain;
            x2 = x2/10;
            i++;
        }
        int first = 0;
        int last = count-1;
        while (first<count) {
            if (x<=0) {
                return false;
            }
            else if (a[first] != a[last]) {
                return false;
            }
            else if (x%10 == 0) {
                return false;
            }
            first++;
            last--;
        }   
            return true;
        }
    }
