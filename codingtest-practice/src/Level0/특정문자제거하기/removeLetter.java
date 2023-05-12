package Level0.특정문자제거하기;

public class removeLetter {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        String my_string = "abcdef";
//        String letter = "f";
        String my_string = "BCBdbe";
        String letter = "B";

        System.out.println(sol.solution(my_string, letter));
    }
}
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        if (my_string.contains(letter)){// letter가 존재하면, 이 문제에선 안써도 됨
            answer = my_string.replace(letter, "");
            return answer;
        }
        return my_string;
    }
}