package Level0.팩토리얼;

public class factorial {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3628800;  // 10
//        int n = 7;        // 3
//        int n = 2;          // 2
//        int n = 1;          // 1

        System.out.println(sol.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=0;i<=n;i++){
            int j = factorial(i);
            if(j>n) break;
//            System.out.println("j: " + j);
            answer = i;
        }
        return answer;
    }
    int factorial(int n){
        if(n==0 || n==1)return 1;
        return n * factorial(n-1);
    }
}