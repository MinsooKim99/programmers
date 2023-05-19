package Level0.모스부호1;

import java.util.HashMap;
import java.util.Map;

public class mos1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String letter = ".... . .-.. .-.. ---";         // "hello"
//        String letter = ".--. -.-- - .... --- -.";    // "python"

        System.out.print(sol.solution(letter));
    }
}

class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-",
                "-.--","--.."};
        StringBuilder answer = new StringBuilder();

        String[] my_str = letter.split(" ");

        for(String s:my_str){
//            System.out.println("s: " + s);
            for(int i=0;i<morse.length;i++){
                if(s.equals(morse[i])){
                    char ch = (char)(i+97);
//                    System.out.println("ch: " + ch);
                    answer.append(Character.toString(ch));
                    i=morse.length;
                }
            }
        }
        return answer.toString();
    }
}