import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        // 각 배열에서 하나의 숫자를 뽑아 두수를 곱함
        // 배열의 길이만큼 반복
        // 두수 곱한 값을 누적덧셈
        
        for(int i = 0; i < A.length; i++){
            answer += (A[i]*B[A.length-i-1]);
        }
        
        System.out.println(answer);

        return answer;
    }
}