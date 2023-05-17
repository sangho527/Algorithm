class Solution {
    public int solution(int price) {
        int answer = 0;
        
        if(price <= 99990){
            answer = price;
        }
        if(100000 <= price){
            answer = (int)(price * 0.95);
        }
        if(300000 <= price){
            answer = (int)(price * 0.9);
        }
        if(500000 <= price){
            answer = (int)(price * 0.8);
            
        }
        return answer;
    }
}