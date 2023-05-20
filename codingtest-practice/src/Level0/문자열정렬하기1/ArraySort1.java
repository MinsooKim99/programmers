package Level0.문자열정렬하기1;

import java.util.Arrays;

public class ArraySort1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "hi12392"; // [1, 2, 2, 3, 9]
//        String my_string = "p2o4i8gj2"; // [2, 2, 4, 8]
//        String my_string = "abcde0"; // [0]

        System.out.println(Arrays.toString(sol.solution(my_string)));
    }
}

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] my_string_list = my_string.split("");
        Arrays.sort(my_string_list);

        int[] answer = new int[my_string_list.length];
        for(int i=0;i<my_string_list.length;i++){
            answer[i] = Integer.parseInt(my_string_list[i]);
        }
//        System.out.println(Arrays.toString(my_string_list));
        return answer;
    }
}