import java.util.*;

class Solution {
    public int solution(int[] abs, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < abs.length; i++){
                if(signs[i] == true){
                    answer += abs[i];
            }
            else{
                answer -= abs[i];
            }
            
        }
        
        return answer;
    }
}