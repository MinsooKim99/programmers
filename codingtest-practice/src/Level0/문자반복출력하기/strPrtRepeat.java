package Level0.문자반복출력하기;

public class strPrtRepeat {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "hello";
        int n = 3;

        System.out.println(sol.solution(my_string, n));
    }
}

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<my_string.length();i++){
            for(int j=0;j<n;j++){
                // 1.string concat
//                answer = answer.concat(String.valueOf(my_string.charAt(i)));
                // 2. string buffer append
                sb.append(my_string.charAt(i));
            }
        }
        answer = sb.toString();
        return answer;
    }
}
