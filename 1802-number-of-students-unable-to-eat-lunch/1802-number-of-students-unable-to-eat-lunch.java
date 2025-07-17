class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer>a1=new LinkedList<>();
        for(int i:students)
        a1.offer(i);
        int j=0,count=0;
        while(!a1.isEmpty() && count <a1.size()){
            if(a1.peek() == sandwiches[j])
            {
                a1.poll();
                j++;
                count = 0;
            }
            else{
                a1.offer(a1.poll());
                count++;
            }

        }
        return a1.size();
        
    }
}