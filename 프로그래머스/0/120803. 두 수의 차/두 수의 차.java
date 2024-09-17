import java.util.function.*;

class Solution {
    public int solution(int num1, int num2) {
        IntBinaryOperator minus = (n1,n2) -> n1 - n2;
        return minus.applyAsInt(num1,num2);
    }
}