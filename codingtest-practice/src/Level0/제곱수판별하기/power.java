package Level0.제곱수판별하기;

public class power {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        int n = 144;
        int n = 976;

        System.out.print(sol.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

//        Math 함수 사용
//        System.out.println(Math.sqrt((double)n));
//        System.out.println(Math.round(Math.sqrt((double)n)));
//        제곱근값이 정수면 1 아니면 2 리턴
//        System.out.println(Math.round(Math.sqrt((double)n)) == Math.sqrt((double)n));

        answer = Math.round(Math.sqrt((double)n)) == Math.sqrt((double)n) ? 1 : 2;


        return answer;
    }
}