package Level0.숫자찾기;
//import java.util.*;

public class findNum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 29183;    // 3
        int k = 1;
//        int num = 232443; // 4
//        int k = 4;
//        int num = 123456; // -1
//        int k = 7;

        System.out.println(sol.solution(num, k));
    }
}

class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String[] str_list = Integer.toString(num).split("");

        // 1. Arrays의 indexOf 사용
//        for(String s:str_list){
//            if(Integer.parseInt(s) == k){
//                answer = Arrays.asList(str_list).indexOf(s) + 1;
//                break;
//            }
//        }

        // 2. 단순 반복문 사용
        for(int i=0;i< str_list.length;i++){
            if(Integer.parseInt(str_list[i]) == k){
                answer = i + 1;
                break;
            }
        }
        
        // 3. 모범답안: String.indexOf 사용(없을시 -1리턴, 맨앞에 문자 추가로 인덱스를 표현)
//        answer = ("a"+ num).indexOf(Integer.toString(k));

        return answer;
    }
}