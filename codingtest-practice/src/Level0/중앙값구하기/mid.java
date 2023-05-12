package Level0.중앙값구하기;
import java.util.Arrays;

public class mid {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        int[] array = {1, 2, 7, 10, 11};
        int[] array = {9, -1, 0};
        System.out.println(sol.solution(array));
    }
}
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length/2];
        return answer;
    }
}