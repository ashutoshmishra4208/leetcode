class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int max=0;
        int n = satisfaction.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            int time = 1;
            for(int j=i; j<n; j++){
                sum += time*satisfaction[j];
                time++;
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}