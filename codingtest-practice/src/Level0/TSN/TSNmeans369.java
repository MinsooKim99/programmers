package Level0.TSN;

public class TSNmeans369 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int order = 3;
//        int order = 29423;

        System.out.println(sol.solution(order));
    }
}

class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] order_list = Integer.toString(order).split("");

        for(String s:order_list){
            int i = Integer.parseInt(s);
            if((i%3 == 0) && (i != 0)){
                answer++;
            }
        }

        return answer;
    }
}