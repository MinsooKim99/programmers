package Level0.대문자와소문자;

public class UpperLower {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "cccCCC";        // "CCCccc"
//        String my_string = "abCdEfghIJ";  // "ABcDeFGHij"

        System.out.println(sol.solution(my_string));
    }
}

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char[] my_string_list = my_string.toCharArray();

//        System.out.println("a: "+(int)'a'); // 97
//        System.out.println("A: "+(int)'A'); // 65
        for(char c:my_string_list){
            if((int)c>96){
                answer.append((char)(c-32));
            }
            else{
                answer.append((char)(c+32));
            }
        }
        return answer.toString();
    }
}