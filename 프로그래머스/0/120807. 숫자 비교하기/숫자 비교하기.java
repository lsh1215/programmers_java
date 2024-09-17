import java.util.function.BiPredicate;

class Solution {
    public int solution(int num1, int num2) {
        BiPredicate<Integer, Integer> isEqual = (n1, n2) -> n1.equals(n2);
        return isEqual.test(num1, num2) ? 1 : -1;
    }
}