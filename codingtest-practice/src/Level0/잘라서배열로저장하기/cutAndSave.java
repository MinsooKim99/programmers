package Level0.잘라서배열로저장하기;
import java.util.*;
import java.util.stream.Collectors;

public class cutAndSave {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        String my_str = "abc1Addfggg4556b";
//        int n = 6;  // ["abc1Ad", "dfggg4", "556b"]
        String my_str = "abcdef123";
        int n = 3;  // ["abc", "def", "123"]

        System.out.println(Arrays.toString(sol.solution(my_str, n)));
    }
}

class Solution {
    public String[] solution(String my_str, int n) {

        List<String> str_arr = new ArrayList<>();
        String[] str_list = my_str.split("");
        for(int i=0;i<my_str.length()/n+1;i++){
            // temp를 StringBuilder로 선언했더니 String으로 할때보다 3배 빠름
            StringBuilder temp = new StringBuilder();
            for(String s:Arrays.copyOfRange(str_list, n*i, n*(i+1))){
                if(s==null)break;
                temp.append(s);
            }
            if(temp.toString().equals(""))break;
            str_arr.add(temp.toString());
        }
        String[] answer = new String[str_arr.size()];
        for(int i=0;i<str_arr.size();i++){
            answer[i] = str_arr.get(i);
        }
        return answer;
    }
}