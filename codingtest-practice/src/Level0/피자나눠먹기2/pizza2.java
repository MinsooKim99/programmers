package Level0.피자나눠먹기2;

public class pizza2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 6;      // result: 1
//        int n = 10;   // result: 5
//        int n = 4;    // result: 2
        System.out.println(sol.solution(n));
    }
}

class Solution {
    public int solution(int n) {
//        int answer = 0;
        int piece = 6;

        while(true){
            if (piece % n == 0){return piece/6;}
            piece += 6;
        }
        // return answer;
    }
}