package Level0.영어가싫어요;

public class iHateEnglish {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String numbers = "onetwothreefourfivesixseveneightnine";    // 123456789
//        String numbers = "onefourzerosixseven";                   // 14067

        System.out.println(sol.solution(numbers));
    }
}

class Solution {
    public long solution(String numbers) {
        long answer = 0;
//        answer = Integer.parseInt(numbers
        answer = Long.parseLong(numbers
                .replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five", "5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9")
                .replace("zero", "0")
        );

        return answer;
    }
}