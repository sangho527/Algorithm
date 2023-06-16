class Solution {
    public String solution(String[] seoul) {
        int i = 0;
        String answer = "";
        
        
        for(i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 "+i+"에 있다";
            }
        }
        
        return answer;
    }
}