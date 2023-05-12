package Level0.최빈값구하기;

import java.util.Arrays;
import java.util.HashMap;

public class mode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {1, 2, 3, 3, 3, 4};
//        int[] array = {1, 1, 2, 2};
//        int[] array = {1};
//        int[] array = {3};

        System.out.println(sol.solution(array));
    }
}
class Solution {
    public int solution(int[] array) {
        int answer;
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        int max = 0, max_key = 0;
        int max_count = 0;

        // 숫자세는 해시맵 생성
        for (int j : array) {
            if (count.get(j) == null) {
                count.put(j, 1);
            } else {
                int temp = count.get(j);
                count.put(j, temp + 1);
            }
        }

        // 나온 횟수의 최대값 구하기
        for(int j : count.values()){
            max = Math.max(max, j);
        }
        // 최대값의 위치 구하기, 최대값 중복개수 세기
        for(int j : count.keySet()){
            if (count.get(j) == max){
                max_key = j;
                max_count++;
            }
        }

        // 최대값이 한개가 아니면 -1, 아니면 나온 횟수가 최대값인 키값
        if(max_count != 1) answer = -1;
        else answer = max_key;

        return answer;
    }
}