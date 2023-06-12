class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 1;
        
        // n 을 나눴을때 나머지가 0인 값을 answer에 누적셈
        
        while(cnt <= n){
            if(n % cnt == 0){
            answer += cnt;
            }   
            cnt++;
        }
        return answer;
    }
}