package Level0.숨어있는숫자의덧셈2;
import java.util.Arrays;

public class hideNumAdd2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "aAb1B2cC34oOp";     // 37
//        String my_string = "1a2b3c4d123Z";   // 133

        System.out.println(sol.solution(my_string));
    }
}

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] num = my_string.replaceAll("[a-zA-Z]", "/").split("/");
//        System.out.print(Arrays.toString(num));

        for(String j:num){
            if(j.length() != 0){
                answer += Integer.parseInt(j);
            }
        }
        return answer;
    }
}