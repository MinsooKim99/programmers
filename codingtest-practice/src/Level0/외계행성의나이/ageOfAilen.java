package Level0.외계행성의나이;

import java.util.HashMap;

public class ageOfAilen {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int age = 23;   // cd
//        int age = 52; // fc

        System.out.println(sol.solution(age));
    }
}

class Solution {
    public String solution(int age) {
        String answer = "";
        String[] answer_list = "abcdefghij".split("");
        String[] age_list = Integer.toString(age).split("");
        StringBuilder sb = new StringBuilder(answer);

        for(String s:age_list){
            sb.append(answer_list[Integer.parseInt(s)]);
        }

        answer = sb.toString();

        return answer;
    }
}
