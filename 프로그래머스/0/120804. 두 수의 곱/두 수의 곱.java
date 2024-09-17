import java.util.function.BiFunction;

class Solution {
    public int solution(int num1, int num2) {
        BiFunction<Integer, Integer, Integer> product = (n1, n2) -> n1 * n2;
        return product.apply(num1, num2);
    }
}