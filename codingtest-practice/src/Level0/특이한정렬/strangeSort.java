package Level0.특이한정렬;
import java.util.*;

public class strangeSort {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numlist = {1, 2, 3, 4, 5, 6}; // [4, 5, 3, 6, 2, 1]
        int n = 4;
//        int[] numlist = {10000,20,36,47,40,6,10,7000}; // [36, 40, 20, 47, 10, 6, 7000, 10000]
//        int n = 30;


        System.out.println(Arrays.toString(sol.solution(numlist, n)));
    }
}

class Solution {
    public int[] solution(int[] numlist, int n) {
        int len = numlist.length;
        int[] index = new int[len];
        Arrays.fill(index, 1);
        Map<Integer, Integer> hs = new HashMap<>();

        // numlist원소:차이값 으로 해시맵 구성
        for(int i:numlist){
            hs.put(i, i-n);
        }
//        System.out.println(hs);

        // index배열 구성
        for(int i=0;i<len;i++){
            for(int j:hs.keySet()){
                // i번째 원소의 차이값이 j원소의 차이값보다 크면 index값 추가
                if(Math.abs(hs.get(numlist[i])) > Math.abs(hs.get(j))){
                    index[i]++;
                }
                // i번째 원소의 차이값과 j번째 원소의 차이값이 같을시 더 작으면 index값 추가
                else if(Math.abs(hs.get(numlist[i])) == Math.abs(hs.get(j))){
                    int num = hs.get(numlist[i]) < hs.get(j) ? 1 : 0;
                    index[i] += num;
                }
            }
        }

        int[] answer = new int[len];
        // index배열대로 정렬
        for(int i=0;i<len;i++){
            answer[index[i]-1] = numlist[i];
        }

        return answer;
    }
}