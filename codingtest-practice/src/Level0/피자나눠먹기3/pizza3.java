package Level0.피자나눠먹기3;

public class pizza3 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int slice = 7;
        int n = 10;     // result: 2
//        int slice = 4;
//        int n = 12;   // result: 3

        System.out.println(sol.solution(slice, n));
    }
}

class Solution {
    public int solution(int slice, int n) {
        int answer = 1;

        while(true){
            if(n<=answer*slice){return answer;}
            answer++;
        }

//        return answer;
    }
}
