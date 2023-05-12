package Level0.삼각형의완성조건1;

public class triangle {
    public static void main(String[] args) {
//        int[] sides = {1, 2, 3};
//        int[] sides = {3, 6, 2};
        int[] sides = {199, 72, 222};
        Solution sol = new Solution();
        System.out.println(sol.solution(sides));
    }
}
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int LEN = sides.length;
        int max_loc = findMax(sides);
        int result_one = 0, result_two = 0;

        // 제일 긴 변의 길이와 나머지 두 변의 합 구하기
        for(int i=0;i<LEN;i++){
            if(i==max_loc){result_one += sides[i];}
            else{result_two += sides[i];}
        }

        // 두 변의 합이 더 크면 1 아니면 2
        return answer = result_two > result_one ? 1 : 2;
    }
    // 배열에서 최대값의 위치를 리턴하는 함수
    int findMax(int[] arr){
        int max = arr[0], max_loc = 0;

        // 최대값과 그 위치를 찾음
        for(int i=1;i<arr.length;i++){
            max = Math.max(max, arr[i]);
            max_loc = max>arr[i] ? max_loc : i;
        }
        // 최대값의 위치를 리턴
        return max_loc;
    }
}
