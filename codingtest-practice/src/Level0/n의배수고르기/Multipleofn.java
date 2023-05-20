package Level0.n의배수고르기;

import java.util.ArrayList;
import java.util.Arrays;

public class Multipleofn {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12}; // [6, 9, 12]
//        int n = 5;
//        int[] numlist = {1, 9, 3, 10, 13, 5}; // [10, 5]
//        int n = 12;
//        int[] numlist = {2, 100, 120, 600, 12, 12}; // [120, 600, 12, 12]

        System.out.println(Arrays.toString(sol.solution(n, numlist)));
    }
}

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> arrnumlist = new ArrayList<>();

        for(int j:numlist){
            if(j%n == 0){
                arrnumlist.add(j);
            }
        }
        answer = new int[arrnumlist.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = arrnumlist.get(i);
        }
        return answer;
        // 모범답안
        // return Arrays.stream(numlist).filter(value -> value % n == 0).toArray();
    }
}