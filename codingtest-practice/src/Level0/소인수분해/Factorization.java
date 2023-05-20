package Level0.소인수분해;

import java.util.*;

public class Factorization {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 12;     // [2, 3]
//        int n = 17;   // [17]
//        int n = 420;  // [2, 3, 5, 7]

        System.out.println(Arrays.toString(sol.solution(n)));
    }
}

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        if(is_irr(n)){
            answer=new int[1];
            answer[0] = n;
            return answer;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=2;i<n;i++){
            if((n%i == 0) && is_irr(i)){
                arr.add(i);
            }
        }

        answer = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
    boolean is_irr(int n){
        for(int i=2;i<n;i++){
            if(n%i == 0)return false;
        }
        return true;
    }
}