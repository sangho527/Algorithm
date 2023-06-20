import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] clothes = new int[n +2];
        Arrays.fill(clothes, 1);
        
        for(int student : lost){
            clothes[student]--;
        }
        
        for(int student: reserve){
            clothes[student]++;
        }
        
        for(int student = 1; student <= n; student++){
            if(clothes[student] == 0){
                if(clothes[student - 1] == 2){ // 왼쪽에 있는 학생이 여분의 체육복을 가지고 있다면
                   clothes[student] = 1; // 본인은 체육복을 빌리고
                    clothes[student - 1] = 1; // 왼쪽에 있는 친구의 체육복도 한개로 만들어준다.
                }
                else if(clothes[student + 1] == 2){ // 오른쪽에 있는 학생이 여분의 체육복을 가지고 있다면
                    clothes[student] = 1; // 본인은 체육복을 빌리고
                    clothes[student + 1] = 1; // 오른쪽에 있는 친구의 체육복도 한개로 만들어준다.
                }
            }
        }
        
        for(int student = 1; student <= n; student++){
            
            if(clothes[student] > 0){
                answer++;
            }
            
        }
        
        return answer;
    }
}