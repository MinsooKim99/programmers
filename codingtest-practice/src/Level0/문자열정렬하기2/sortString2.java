package Level0.문자열정렬하기2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class sortString2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "Bcad";      // abcd
//        String my_string = "heLLo";   // ehllo
//        String my_string = "Python";  // "hnopty"

        System.out.println(sol.solution(my_string));
    }
}

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        String[] answer = my_string.split("");

        Arrays.sort(answer);
//        return Arrays.stream(answer).collect(Collectors.joining());
        return String.join("", answer);
    }
}