package Level0.이진수더하기;

public class addBinary {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String bin1 = "10"; // "101"
        String bin2 = "11";
//        String bin1 = "1001"; // "11000"
//        String bin2 = "1111";

        System.out.println(sol.solution(bin1, bin2));
    }
}

class Solution {
    public String solution(String bin1, String bin2) {
        int n1 = Integer.parseInt(bin1, 2);
        int n2 = Integer.parseInt(bin2, 2);

//        System.out.println(Integer.toBinaryString(n1+n2));

        return Integer.toBinaryString(n1+n2);
    }
}