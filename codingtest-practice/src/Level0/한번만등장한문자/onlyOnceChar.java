package Level0.한번만등장한문자;
import java.util.Arrays;

public class onlyOnceChar {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abcabcadc"; // d
//        String s = "abdc";    // abdc
//        String s = "hello";   // eho

        System.out.println(sol.solution(s));
    }
}

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s);

        for(String str:s.split("")){
            if(sb.indexOf(str) != sb.lastIndexOf(str)){
                while(sb.indexOf(str) != -1){
                    int i = sb.indexOf(str);
                    sb.deleteCharAt(i);
                }
            }
        }
        String[] answer = sb.toString().split("");
        Arrays.sort(answer);

        return String.join("", answer);
    }
}