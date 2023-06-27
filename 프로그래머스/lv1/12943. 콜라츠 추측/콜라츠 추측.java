class Solution {
    public int solution(int num) {
        int answer = num;
        int cnt = 0;
        
        do{
            if(answer % 2 == 0){ // 짝수일때
                answer = answer / 2;
                cnt++;
            }
            else{ // 홀수일때
                answer = answer * 3 + 1;
                cnt++;
            }
        }while(answer != 1 && answer > 0 && cnt < 500);
        
        if(answer != 1){ // 500번이상 반복일때
            return -1;
        }
        if(num == 1){
            return 0;
        }
            return cnt;
    }
}