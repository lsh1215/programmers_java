import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        
    // 가장 작은 수 찾기
        int min = Arrays.stream(arr).min().getAsInt();

        // 가장 작은 수를 제외한 새로운 배열 생성
        return Arrays.stream(arr)
                     .filter(num -> num != min)  // 가장 작은 수를 제외
                     .toArray();  // 배열로 변환
    }
}