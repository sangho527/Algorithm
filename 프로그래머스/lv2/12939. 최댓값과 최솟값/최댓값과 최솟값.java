import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        Arrays.sort(str, (a, b) -> Integer.parseInt(a) - Integer.parseInt(b));
        
            answer = str[0] + " " + str[str.length-1];
        
        return answer;
    }
}