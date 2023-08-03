class Solution {
    public int[] solution(int[] array) {
        int maxValue = 0;
        int maxIndex = 0;
        
        for(int i = 0; i < array.length; i++){
            if(maxValue < array[i]){
                maxValue = array[i];
            }
            //System.out.println(maxValue);
        }
        
        for(int i = 0; i < array.length; i++){
            if(array[maxIndex] < array[i]){
                maxIndex = i;
            }
            //System.out.println(maxValue);
        }
        
        int[] answer = {maxValue, maxIndex};
        
        return answer;
    }
}