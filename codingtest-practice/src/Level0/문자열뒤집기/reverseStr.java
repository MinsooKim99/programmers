package Level0.문자열뒤집기;

import java.util.Arrays;

public class reverseStr {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        String my_string = "jaron";
        String my_string = "bread";

        System.out.println(sol.solution(my_string));
    }
}

class Solution {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer(my_string);
        String answer = sb.reverse().toString();

        return answer;
    }
}