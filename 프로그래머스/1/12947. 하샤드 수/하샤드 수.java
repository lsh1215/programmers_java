class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int count = 0;
        int hasyard = x;
        while(x>0){
            count = count + (x % 10);
            System.out.println(count);
            x /= 10;
        }
        
        if(hasyard%count >0)
            answer = false;
        return answer;
    }
}