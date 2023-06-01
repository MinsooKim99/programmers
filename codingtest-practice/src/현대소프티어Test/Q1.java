package 현대소프티어Test;
import java.util.*;
// 다트게임
// 1. 초기점수 40점
// 2. 라운드당 3번씩
// 3. 전체라운드는 9번까지
// 4. 라운드별 조건 미달성시 점수 절반 깎음(홀수 반올림)
// 5. 1또는 0점에서 미달성시 0점
// 6. 조건:표 참조
// 보드 수제는 쫌;


public class Q1 {
    public static void main(String[] args) {
        Main m = new Main();
//        int[] param = {11,2,12,2,13,3};
        int[] param = {1,0,1,1,1,2,1,0,1,1,1,2,1,0,1,1,1,2,1,0,1,1,1,2,1,0,1,1,1,2,1,0,1,1,1,2,1,0,1,1,1,2};
        System.out.println(m.solution(param));
    }
}
class Main {
    public int solution(int[] param) {
        int[][] field = new int[16][16];
        int[][] score_area = new int[param.length/2][2];
        for(int i=0;i<field[0].length;i++){
            Arrays.fill(field[i], 0);
        }

        // 1
        field[10][1] = 1;
        field[9][6] = 1;
        for(int i=9;i<11;i++){
            field[i][2] = 1;
            field[i][3] = 1;
            field[i][4] = 1;
            field[i][5] = 1;
        }
        // 2
        field[9][9] = 2;
        field[10][14] = 2;
        for(int i=9;i<11;i++){
            field[i][10] = 2;
            field[i][11] = 2;
            field[i][12] = 2;
            field[i][13] = 2;
        }
        // 3
        field[6][9] = 3;
        field[5][14] = 3;
        for(int i=5;i<7;i++){
            field[i][10] = 3;
            field[i][11] = 3;
            field[i][12] = 3;
            field[i][13] = 3;
        }
        // 4
        field[5][1] = 4;
        field[6][6] = 4;
        for(int i=5;i<7;i++){
            field[i][2] = 4;
            field[i][3] = 4;
            field[i][4] = 4;
            field[i][5] = 4;
        }
        // 5
        field[11][2] = 5;
        field[12][2] = 5;
        for(int i=11;i<14;i++){
            field[i][3] = 5;
            field[i][4] = 5;
        }
        // 6
        field[3][13] = 6;
        field[4][13] = 6;
        for(int i=2;i<5;i++){
            field[i][11] = 6;
            field[i][12] = 6;
        }
        // 7
        field[3][2] = 7;
        field[4][2] = 7;
        for(int i=2;i<5;i++){
            field[i][3] = 7;
            field[i][4] = 7;
        }
        // 8
        field[11][13] = 8;
        field[12][13] = 8;
        for(int i=11;i<14;i++){
            field[i][11] = 8;
            field[i][12] = 8;
        }
        // 9
        for(int i=9;i<14;i++){
            field[i][7] = 9;
            field[i][8] = 9;
        }
        // 10
        for(int i=2;i<7;i++){
            field[i][7] = 10;
            field[i][8] = 10;
        }
        // 13
        field[10][6] = 13;
        field[14][5] = 13;
        for(int i=11;i<14;i++){
            field[i][5] = 13;
            field[i][6] = 13;
        }
        // 14
        field[10][9] = 14;
        field[14][10] = 14;
        for(int i=11;i<14;i++){
            field[i][9] = 14;
            field[i][10] = 14;
        }
        // 15
        field[5][9] = 15;
        field[1][10] = 15;
        for(int i=2;i<5;i++){
            field[i][9] = 15;
            field[i][10] = 15;
        }
        // 16
        field[5][6] = 16;
        field[1][5] = 16;
        for(int i=2;i<5;i++){
            field[i][5] = 16;
            field[i][6] = 16;
        }
        // 17
        for(int i=6;i<10;i++){
            field[i][0] = 17;
            field[i][1] = 17;
        }
        // 18
        for(int i=6;i<10;i++){
            field[i][14] = 18;
            field[i][15] = 18;
        }
        // 19
        for(int i=0;i<2;i++){
            field[i][6] = 19;
            field[i][7] = 19;
            field[i][8] = 19;
            field[i][9] = 19;
        }
        // 20
        for(int i=14;i<16;i++){
            field[i][6] = 20;
            field[i][7] = 20;
            field[i][8] = 20;
            field[i][9] = 20;
        }
        // 25
        field[7][7] = 25;
        field[7][8] = 25;
        field[8][7] = 25;
        field[8][8] = 25;


        for(int i=0;i<param.length;i+=2){
            score_area[i/2][0] = param[i];
        }
        for(int i=1;i<param.length;i+=2){
            score_area[i/2][1] = param[i];
        }
//        System.out.println(Arrays.deepToString(score));

        int score=40;
        int non_score=0;
        for(int i=0;i<score_area.length;i++){
            // 라운드가 바뀌면 페널티 초기화
            if(i%3==0){
                non_score = 0;
            }
            // 라운드 선언
            int round = i/3+1;
            // 점수 계산
            if(round==1 && field[score_area[i][0]][score_area[i][1]] == 5){
                score+=5;
            }
            else if(round==2 && field[score_area[i][0]][score_area[i][1]] == 6){
                score+=6;
            }
            else if(round==3 && field[score_area[i][0]][score_area[i][1]] == 7){
                score+=7;
            }
            else if(round==4 && field[score_area[i][0]][score_area[i][1]] == 8){
                score+=8;
            }
            else if(round==5 && field[score_area[i][0]][score_area[i][1]] == 17){
                score+=17;
            }
            else if(round==5 && field[score_area[i][0]][score_area[i][1]] == 18){
                score+=18;
            }else if(round==6 && field[score_area[i][0]][score_area[i][1]] == 9){
                score+=9;
            }else if(round==6 && field[score_area[i][0]][score_area[i][1]] == 10){
                score+=10;
            }else if(round==7 && field[score_area[i][0]][score_area[i][1]] == 11){
                score+=11;
            }
            else if(round==7 && field[score_area[i][0]][score_area[i][1]] == 12){
                score+=12;
            }
            else if(round==8 && field[score_area[i][0]][score_area[i][1]] == 19){
                score+=19;
            }
            else if(round==8 && field[score_area[i][0]][score_area[i][1]] == 20){
                score+=20;
            }
            else if(round==9 && field[score_area[i][0]][score_area[i][1]] == 25){
                score+=25;
            }

            // 조건에 해당 안하면
            else{
                non_score++;
            }

            // 라운드별 조건 페널티 계산
            if(round==1 && non_score==3){
                score /= 2;
            }
            else if(round==2 && non_score==3){
                score /= 2;
            }else if(round==3 && non_score==3){
                score /= 2;
            }else if(round==4 && non_score==3){
                score /= 2;
            }
            else if(round==5 && non_score==3){
                score /= 2;
            }
            else if(round==6 && non_score==3){
                score /= 2;
            }
            else if(round==7 && non_score==3){
                score /= 2;
            }
            else if(round==8 && non_score==3){
                score /= 2;
            }
            else if(round==9 && non_score==3){
                score /= 2;
            }
        }
        return score;
    }
}