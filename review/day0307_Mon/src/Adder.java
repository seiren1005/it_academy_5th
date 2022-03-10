public class Adder {
    
    int result;
    // Field(필드)

    public int add(int x, int y) {
        // 리턴 타입이 int -> int값을 리턴해 줘야됨
        return result = x + y;
    }

    public void method() {
        // 리턴 타입 void -> return 값 없음
    }

    public int sum(int[] arr) {
        // 메소드의 파라미터로 배열 가능
        int sum = 0;
        return sum;
    }

    public int[] makeArr() {
        return new int[10];
        // 리턴 타입을 배열로 선언하고 배열을 리턴하는 것도 가능
    }

    
}

