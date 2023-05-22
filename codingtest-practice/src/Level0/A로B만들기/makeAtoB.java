package Level0.A로B만들기;
import java.util.Arrays;
public class makeAtoB {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String before = "olleh";    // 1
        String after = "hello";
//        String before = "allpe";  // 0
//        String after = "apple";

        System.out.println(sol.solution(before, after));
    }
}

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] before_list = before.split("");
        String[] after_list = after.split("");

        Arrays.sort(before_list);
        Arrays.sort(after_list);

        if(Arrays.equals(before_list, after_list)){
            answer = 1;
        }

        return answer;
    }
}