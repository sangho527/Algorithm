import java.util.*;

class Solution {
    public long solution(long n) {
        String answer = "";
        String str = Long.toString(n);
        int[] arr = new int[str.length()];
        
        for(int i = 0; i < str.length(); i++){
            String s = str.substring(i, i+1);
            arr[i] = Integer.parseInt(s);
        }
        
        Arrays.sort(arr);
        
        for(int i = str.length()-1; 0 <= i ; i--){
            answer += arr[i];
        }
        
        return Long.parseLong(answer);
    }
}