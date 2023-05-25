package Level0.유한소수판별하기;

public class uhanSosu {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        int a = 7; int b = 20;  // 1
//        int a = 11; int b = 22;  // 1
        int a = 12; int b = 21;  // 2

        System.out.println(sol.solution(a, b));
    }
}

class Solution {
    public int solution(int a, int b) {
//        int answer = 0;
        while(is_Irr(a, b)[0] == 0){
            int yaksu = is_Irr(a, b)[1];
            a /= yaksu;
            b /= yaksu;
        }

        while(b%2 == 0)b /= 2;
        while(b%5 == 0)b /= 5;
//        answer = (b==1) ? 2 : 1;

        return (b==1) ? 1 : 2;
    }
    int[] is_Irr(int num1, int num2){
        int[] result = {1, 0};
        int len = Math.min(num1, num2);
        for(int i=2;i<=len;i++){
            if(num1%i == 0 && num2%i == 0){
                result[0] = 0; result[1] = i;
                return result;
            }
        }
        return result;
    }
//    boolean is_Irr(int num){
//        if(num<2) return false;
//        for(int i=2;i<num;i++){
//            if(num%i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
}