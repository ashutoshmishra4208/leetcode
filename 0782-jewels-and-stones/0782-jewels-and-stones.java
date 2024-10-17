class Solution {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        for (char s : S.toCharArray()) {
            if (J.indexOf(s) != -1) {
                res++;
            }
        }
        return res; 
    }
}
