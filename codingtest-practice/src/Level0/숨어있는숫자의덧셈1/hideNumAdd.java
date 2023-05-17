package Level0.숨어있는숫자의덧셈1;

public class hideNumAdd {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "aAb1B2cC34oOp"; // result: 10
//        String my_string = "1a2b3c4d123"; // result: 16

        System.out.print(sol.solution(my_string));
    }
}

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", "");
//        System.out.print(my_string);
        String[] num = my_string.split("");

        for(String j:num){
            answer += Integer.parseInt(j);
        }
        return answer;
    }
}