class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 2;
        
        while(x < n){
            if( n % x == 1 ){
                answer = x;
                break;
            }
            x++;
        }
        
        
        return answer;
    }
}