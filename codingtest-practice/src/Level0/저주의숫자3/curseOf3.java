package Level0.저주의숫자3;

public class curseOf3 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 15; // 25
//        int n = 40; // 76

        System.out.println(sol.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=0;i<n;i++){
            answer++;
//            System.out.println("answer: " + answer);
//            System.out.println(Integer.toString(answer).contains("3"));

            while(answer%3==0 || Integer.toString(answer).contains("3")){
                answer++;
            }
        }
        return answer;
    }
}