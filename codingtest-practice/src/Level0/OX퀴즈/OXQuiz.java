package Level0.OX퀴즈;
import java.util.Arrays;

public class OXQuiz {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // ["X", "O"]
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        // ["O", "O", "X", "O"]
//        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};

        System.out.println(Arrays.toString(sol.solution(quiz)));
    }
}

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int i=0;
        for(String s:quiz){
            String[] quiz_list = s.split(" ");
            int result = Integer.parseInt(quiz_list[0]);
            for(int j=1;j < quiz_list.length;j+=2){
                int n1 = result;
                String ch = quiz_list[j];
                int n2 = Integer.parseInt(quiz_list[j+1]);
                if(ch.equals("=")){
                    answer[i++] = (n1==n2) ? "O" : "X";
                    break;
                }
                result = calculator(n1, n2, ch);
            }
        }

        return answer;
    }
    public int calculator(int n1, int n2, String ch){
        switch(ch){
            case "+":
                return n1+n2;
            case "-":
                return n1-n2;
            default:
                return 0;
        }
        // 향상된 switch문
//        return switch (ch) {
//            case "+" -> n1 + n2;
//            case "-" -> n1 - n2;
//            default -> 0;
//        };
    }
}