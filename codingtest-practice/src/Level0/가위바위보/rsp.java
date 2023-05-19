package Level0.가위바위보;

public class rsp {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        String rsp = "2";
        String rsp = "205";

        System.out.print(sol.solution(rsp));
    }
}

class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        String[] rsp_list = rsp.split("");

        for(String s:rsp_list){
            // System.out.println(s);
            if(s.equals("2")){
                answer.append("0");
            }
            else if(s.equals("0")){
                answer.append("5");
            }
            else{
                answer.append("2");
            }
        }
        return answer.toString();
    }
}