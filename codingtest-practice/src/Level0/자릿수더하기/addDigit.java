package Level0.자릿수더하기;

public class addDigit {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 1234;

        System.out.print(sol.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        String[] num_list = Integer.toString(n).split("");

        for(String j:num_list){
            answer += Integer.parseInt(j);
        }
        return answer;
    }
}
