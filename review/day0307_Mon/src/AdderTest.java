public class AdderTest {
    public static void main(String[] args) {
        
        Adder adder = new Adder();
        // 외부에서 Adder 클래스를 사용하기 위해서 객체 adder 생성

        int result = adder.add(5, 5);
        // adder 객체 안에 add(int x, int y) 메소드 호출
        // adder() 메소드는 리턴 타입이 int 이므로 호출해서 실행한 뒤 리턴값을
        // int 타입 변수 result에 저장 가능

        adder.method();
        // adder 객체 안에 method() 메소드 호출
        // method() 메소드는 리턴 타입이 void 이므로 특정 변수에 저장할 수 없고
        // 오직 호출해서 실행만 가능

        
    }

}

