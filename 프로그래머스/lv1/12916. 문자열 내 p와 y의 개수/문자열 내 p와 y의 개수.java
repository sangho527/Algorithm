class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] str = s.toLowerCase().split("");
        int cnt1 = 0;
        int cnt2 = 0;
        
        for(int i = 0; i < str.length; i++){
            if("p".equals(str[i])){
                cnt1++;
            }
            if("y".equals(str[i])){
                cnt2++;
            }
        }
        
        if (cnt1 != cnt2){
            return false;
        }
        
        return answer;
    }
}