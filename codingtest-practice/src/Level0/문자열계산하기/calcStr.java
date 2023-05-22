package Level0.문자열계산하기;

public class calcStr {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        String my_string = "3 + 4"; // 7
        String my_string = "3 + 4 + 5 - 7 + 2 + 3"; // 10

        System.out.println(sol.solution(my_string));
    }
}

class Solution {
    public int solution(String my_string) {
        String[] str_list = my_string.split(" ");
        int result = Integer.parseInt(str_list[0]);

        for(int i=1 ; i<str_list.length ; i+=2){
            int n1 = result;
            String ch = str_list[i];
            int n2 = Integer.parseInt(str_list[i+1]);
            result = calculator(n1, n2, ch);
        }

        return result;
    }
    int calculator(int n1, int n2, String ch){
        int result = 0;
        switch(ch){
            case "+":
                result = n1+n2;
                break;
            case "-":
                result = n1-n2;
                break;
        }
        // 향상된 switch문
//        int result = switch (ch) {
//            case "+" -> n1 + n2;
//            case "-" -> n1 - n2;
//            default -> 0;
//        };
        return result;
    }
}