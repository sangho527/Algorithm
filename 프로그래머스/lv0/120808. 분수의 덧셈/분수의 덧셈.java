class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num = (numer1 * denom2) + (numer2 * denom1); // 분자값 더한것
        int den = denom1 * denom2; // 분모
        
        for(int i = num-1; i > 1; i --) { // 기약분수
            if(num % i == 0 && den % i == 0){
                num /= i;
                den /= i;
            }
        }
        int[] answer = {num , den};
        return answer;
    }
}