package Level0.외계어사전;

import java.util.Arrays;

public class dictAlien {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // 2
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        // 1
//        String[] spell = {"z", "d", "x"};
//        String[] dic = {"def", "dww", "dzx", "loveaw"};
        // 2
//        String[] spell = {"s", "o", "m", "d"};
//        String[] dic = {"moos", "dzx", "smm", "sunmmo", "som"};

        System.out.println(sol.solution(spell, dic));
    }
}

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        String sorted_spell = String.join("", spell);
        for(String s:dic){
            String[] s_list = s.split("");
            Arrays.sort(s_list);
            s = String.join("", s_list);
            if(s.equals(sorted_spell)){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}