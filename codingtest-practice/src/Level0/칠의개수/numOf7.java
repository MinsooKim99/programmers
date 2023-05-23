package Level0.칠의개수;

public class numOf7 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {7, 77, 17};  // 4
//        int[] array = {10, 29};   // 0

        System.out.println(sol.solution(array));
    }
}

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for(int s:array){
            while(s>0){
                if(s%10 == 7)answer++;
                s /= 10;
            }
        }
        return answer;
    }
}