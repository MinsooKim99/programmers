package Level0.중복된문자제거;

import java.util.*;
import java.util.stream.Collectors;

public class deDuplication {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "people";                // "peol"
//        String my_string = "We are the world";    // "We arthwold"

        System.out.println(sol.solution(my_string));
    }
}

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String[] strList = my_string.split("");
        List<String> arrList = new ArrayList<>();

        for (String s : strList) {
            if (arrList.contains(s)) {
                continue;
            }
            arrList.add(s);
        }
        for (String s : arrList) {
            answer.append(s);
        }

        // 1. String.join 사용
//        System.out.println(String.join("", strList));
        // 2. Collectors 사용
//        System.out.println(Arrays.stream(strList).collect(Collectors.joining()));

        // 3. StringBuilder를 통한 변환
        return answer.toString();
    }
}
