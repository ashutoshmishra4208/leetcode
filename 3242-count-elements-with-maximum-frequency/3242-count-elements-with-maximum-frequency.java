class Solution {
    public int maxFrequencyElements(int[] arr) {
        int n = arr.length;
        int max = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }

        int[] freq = new int[max + 1];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        int maxFreq = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
            }
        }

        int count = 0;
        for (int j = 0; j < freq.length; j++) {
            if (freq[j] == maxFreq) {
                count++;
            }
        }

        int max2 = 0;
        while (count > 0) {
            max2 += maxFreq;
            count--;
        }

        return max2;
    }
}