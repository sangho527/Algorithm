class Solution {
    public int solution(int n) {
        int result = 0;
        int i = 0;
        
        if (0 < n && n <= 1000){
         for(i = 0; i <= n; i++){
            if(i%2 == 0)
                result += i;
            }   
        }
        
        return result;
    }
}