package Level0.다항식더하기;

import java.util.*;

public class addPolynomial {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        String polynomial = "3x + 7 + x";   // "4x + 7"
//        String polynomial = "x + x + x";   // "3x"
        String polynomial = "x";   // "x"

        System.out.println(sol.solution(polynomial));
    }
}

class Solution {
    public String solution(String polynomial) {
        String[] poly_list = polynomial.split(" ");
        List<String> lt_list = new ArrayList<>();
        List<String> co_list = new ArrayList<>();

        for(String s:poly_list){
            if(s.contains("x")){
                lt_list.add(s);
            }
            else if(s.contains("+")){
                continue;
            }
            else{
                co_list.add(s);
            }
        }

        int lt_num = 0;
        for(String l:lt_list){
//            System.out.println("l: " + l);
            l = l.replace("x", "");
            int num = (l.equals("")) ? 1 : Integer.parseInt(l);
                lt_num += num;
            }
        int co_num = 0;
        for(String c:co_list){
            co_num += Integer.parseInt(c);
        }


        String answer = lt_num + "x + " + co_num;
        if(lt_num == 0 && co_num == 0) answer = "";
        else if(lt_num == 0) answer = Integer.toString(co_num);
        else if(co_num == 0) answer = lt_num + "x";

        if(lt_num == 1) answer = answer.replaceFirst("1", "");
        return answer;
    }
}