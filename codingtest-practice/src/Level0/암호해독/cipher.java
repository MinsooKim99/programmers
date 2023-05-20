package Level0.암호해독;

public class cipher {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
//        String cipher = "pfqallllabwaoclk";
//        int code = 2;

        System.out.println(sol.solution(cipher, code));
    }
}

class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        String[] my_string = cipher.split("");

        for(int i=code-1;i<my_string.length;i+=code){
            answer.append(my_string[i]);
        }
        return answer.toString();
    }
}