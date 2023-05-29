package Level0.옹알이1;

public class bababoo {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
//        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};

        System.out.println(sol.solution(babbling));
    }
}

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for(String s:babbling){
//            System.out.println("before: "+s);
                s = s.replaceAll("aya|ye|woo|ma","");
//            System.out.println("after: "+s);
            if(s.equals("")){
                answer++;
            }
        }
        return answer;
    }
}