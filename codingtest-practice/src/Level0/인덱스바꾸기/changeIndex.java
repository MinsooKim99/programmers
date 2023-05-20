package Level0.인덱스바꾸기;

public class changeIndex {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "hello"; // "hlelo"
        int num1 = 1;
        int num2 = 2;
//        String my_string = "I love you"; // "I l veoyou"
//        int num1 = 3;
//        int num2 = 6;

        System.out.println(sol.solution(my_string, num1, num2));
    }
}

class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        String[] my_string_list = my_string.split("");

        for(int i=0;i<my_string_list.length;i++){
            if(i==num1){
                sb.append(my_string_list[num2]);
            }
            else if(i==num2){
                sb.append(my_string_list[num1]);
            }
            else{
                sb.append(my_string_list[i]);
            }
        }

        return sb.toString();
    }
}