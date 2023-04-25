class Solution {
    public double solution(double num1, double num2) {
        double result = 0;
        if((0< num1 && num1 <= 100) && (0< num2 && num2 <= 100)){
            result = (int)((num1 / num2) * 1000);
        }
        return result;
    }
}