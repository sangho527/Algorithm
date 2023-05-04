class Solution {
    public String solution(String my_string) {
        String str = my_string;
        String answer = "";
        
        for (int i = str.length() -1 ; i >= 0; i--){
            answer += str.charAt(i);
        }
        
        
        return answer;
    }
}