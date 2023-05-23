class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int Length1 = arr1.length;
        int[][] answer = new int[Length1][];
        
        for(int i = 0; i < arr1.length; i++){
            int Length2 = arr1[i].length;
            answer[i] = new int[Length2];
            
            for(int j = 0; j < arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}