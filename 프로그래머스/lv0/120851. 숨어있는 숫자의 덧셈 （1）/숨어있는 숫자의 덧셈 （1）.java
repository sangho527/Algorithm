class Solution {
    public int solution(String str) {
        int answer = 0;
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                int num = Character.getNumericValue(ch);
                answer += num;
            }
        }
        
        return answer;
    }
}