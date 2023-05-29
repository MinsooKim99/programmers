package Level0.문자열밀기;

//import java.util.Arrays;

public class pushString {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String A = "hello"; // 1
        String B = "ohell";
//        String A = "apple"; // -1
//        String B = "elppa";
//        String A = "atat"; // 1
//        String B = "tata";
//        String A = "abc"; // 0
//        String B = "abc";

        System.out.println(sol.solution(A, B));
    }
}

class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String[] my_str = A.split("");
        for(int i=0;i< my_str.length;i++){
            if(String.join("", my_str).equals(B)){
                answer = i;
                break;
            }
            my_str = push_str(my_str);
        }

        return answer;
    }
    String[] push_str(String[] my_str){
        String s = my_str[my_str.length-1];
//        System.out.println("before: " + Arrays.toString(my_str));
        for(int i=my_str.length-1;i>0;i--){
            my_str[i] = my_str[i-1];
        }
        my_str[0] = s;
//        System.out.println("after: " + Arrays.toString(my_str));
        return my_str;
    }
}