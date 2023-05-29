// 문제: 영역(뭉쳐있는 1)의 개수와 크기 구하기
// 1번째 입력: 배열의 크기
// 2번째 임력~: 배열(한줄씩)
package 현대소프티어preTest;
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lines = Integer.parseInt(br.readLine());
        int[][] area = new int[lines][lines];
        for(int i=0; i<lines; i++){
                String[] area_str = br.readLine().split(" ");
              for(int j=0;j<lines;j++){
                area[i][j] = Integer.parseInt(area_str[j]);
            }
        }
//        System.out.println(Arrays.deepToString(area));
        for(int i=0;i<lines;i++){
            for(int j=0;j<lines;j++){
                if(area[i][j]==1){
                    int size=1;
                    for(int k=i;k<lines;k++){
                        for(int l=j;l<lines;l++){
                            if(is_area(k, l, lines) && area[k][l]==1){

                        }

                        }
                    }
                }
//                for(int k=i-1;k<=i+1;k++){
//                    for(int l=j-1;l<=j+1;l++){
//                        if(is_area(k, l, lines) && area[k][l]==1){
//                            size++;
//                        }
//                    }
//                }
            }
        }
    }
    static boolean is_area(int n1, int n2, int len){
        if(len>n1 && n1>0 && len>n2 && n2>0){
            return true;
        }
        return false;
    }
}
