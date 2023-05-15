package Level0.모음제거;

public class deleteVowel {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        String my_string = "bus";
        String my_string = "nice to meet you";

        System.out.println(sol.solution(my_string));
    }
}

class Solution {
    public String solution(String my_string) {
//        String answer = my_string.replaceAll("[aeiou]", "");  // 모범답안
        String answer = my_string                               // 내 답안
                .replace("a", "")
                .replace("e", "")
                .replace("i", "")
                .replace("o", "")
                .replace("u", "");
        return answer;
    }
}