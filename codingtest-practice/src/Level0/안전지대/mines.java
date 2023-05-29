package Level0.안전지대;

public class mines {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // 16
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        // 13
//        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        // 0
//        int[][] board = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};

        System.out.println(sol.solution(board));
    }
}

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int dangerous = 0;
        int width = board[0].length;
        int height = board.length;

        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                for(int k=i-1;k<=i+1;k++){
                    for(int l=j-1;l<=j+1;l++){
                        if(is_area(k, l, width, height) && board[k][l] == 1){
                            dangerous = 1;
                        }
                    }
                }
                if(dangerous == 0)answer++;
                dangerous = 0;
            }
        }


        return answer;
    }
    boolean is_area(int n, int m, int width, int height){
        if(width>n && n>=0 && height>m && m>=0){
            return true;
        }
        return false;
        // 간단한 표현
        // return width > n && n >= 0 && height > m && m >= 0;
    }
}