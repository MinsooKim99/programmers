package Level0.잘라서배열로저장하기;
import java.util.*;
import java.util.stream.Collectors;

public class cutAndSave {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_str = "abc1Addfggg4556b";
        int n = 6;  // ["abc1Ad", "dfggg4", "556b"]
//        String my_str = "abc1Addfggg4556b";
//        int n = 3;

        System.out.println(Arrays.toString(sol.solution(my_str, n)));
    }
}

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        String[] str_list = my_str.split("");
        for(int i=0;i<my_str.length()/n+1;i++){
            String temp = "";
            for(String s:Arrays.copyOfRange(str_list, n*i, n*(i+1))){
                if(s==null)break;
                temp += s;
            }
            answer.add(temp);
        }
        System.out.println(Arrays.toString(answer.toArray()));
        return (String[])answer.toArray();
    }
}