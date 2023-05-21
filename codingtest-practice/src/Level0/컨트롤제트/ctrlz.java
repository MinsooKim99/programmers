package Level0.컨트롤제트;

public class ctrlz {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "1 2 Z 3";       // 4
//        String s = "10 20 30 40"; // 100
//        String s = "10 Z 20 Z 1"; // 1
//        String s = "10 Z 20 Z";   // 0
//        String s = "-1 -2 -3 Z";  //-3

        System.out.println(sol.solution(s));
    }
}

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] stringList = s.split(" ");
        for(int i=0;i<stringList.length;i++){
            if(stringList[i].equals("Z")){
                answer -= Integer.parseInt(stringList[i-1]);
            }
            else{
                answer += Integer.parseInt(stringList[i]);
            }
        }

        return answer;
    }
}
