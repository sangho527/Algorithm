class Solution {
    public int solution(int num1, int num2){
        int result = 0;
        if ((0 < num1 && num1 <= 100) && (0 < num2 && num2 <= 100)){
        result = num1 / num2;
        }
        return result;
    }
}