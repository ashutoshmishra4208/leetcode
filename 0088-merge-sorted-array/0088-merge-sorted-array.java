class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;  // Point to last element of nums1 (excluding extra space)
        n--;  // Point to last element of nums2
        int i = m + n + 1; // Start filling from the end

        while (n >= 0) {  // Ensure nums2 elements are placed correctly
            int a = m >= 0 ? nums1[m] : Integer.MIN_VALUE;
            int b = nums2[n];

            if (a > b) {
                nums1[i] = a;
                m--;
            } else {
                nums1[i] = b;
                n--;
            }
            i--;
        }
    }
}
