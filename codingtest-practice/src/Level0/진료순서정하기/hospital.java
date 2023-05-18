package Level0.진료순서정하기;

import java.util.Arrays;
import java.util.HashMap;

public class hospital {
    public static void main(String[] args) {
    Solution sol = new Solution();
    int[] emergency = {3, 76, 24};              // [3, 1, 2]
//    int[] emergency = {1, 2, 3, 4, 5, 6, 7};  // [7, 6, 5, 4, 3, 2, 1]
//    int[] emergency = {30, 10, 23, 6, 100};   // [2, 4, 3, 5, 1]

        System.out.println(Arrays.toString(sol.solution(emergency)));
    }
}

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = Arrays.copyOf(emergency, emergency.length);
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        Arrays.sort(emergency);
        for(int i=0;i< emergency.length;i++){
            hash.put(emergency[i], emergency.length-i);
        }
        for(int i=0;i< answer.length;i++){
            answer[i] = hash.get(answer[i]);
        }

        return answer;
    }
}
