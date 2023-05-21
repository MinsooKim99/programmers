package Level0.가까운수;
import java.util.Arrays;

public class nearNum {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        int[] array = {3, 10, 28};      // 28
//        int n = 20;
//        int[] array = {3, 10, 28};    // 12
//        int n = 13;
        int[] array = {7, 3, 10, 28, 29, 4, 5};    //
        int n = 6;

        System.out.println(sol.solution(array, n));
    }
}

class Solution {
    public int solution(int[] array, int n) {
        int answer = -1;
        int min = 100;
         Arrays.sort(array);
//         System.out.println(Arrays.toString(array));
        for(int j:array){
            min = Math.min(min, Math.abs(n-j));
        }
        for(int i:array){
            if(Math.abs(n-i) == min){
                return i;
            }
        }
        return answer;
    }
}