import java.util.*;

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int cup = 0;
        Arrays.sort(number);
        
        for(int i = 0; i < number.length-2; i++){
            
            for(int j = i+1; j < number.length-1; j++){
                 
                    for(int z = j+1; z < number.length; z++){
                        
                        cup = number[i] + number[j] + number[z];
                        
                        if(cup == 0){
                            answer++;
                        }
                    }
                }
            }
        return answer;
        }
}