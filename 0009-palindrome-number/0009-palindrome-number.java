class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }
        int a = 0;
        
        while (a < x) {
            a = (a * 10) + (x % 10);
            x = x / 10;
        }
        if (a == x || a/10 == x) {
            return true;
        }
        return false;
    }
}