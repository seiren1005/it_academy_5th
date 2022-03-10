public class StaticTest {
    
    public static void main(String[] args) {
        
        System.out.println(StaticEx.number);
        StaticEx.method1();
        // static으로 선언했기 때문에 따로 객체를 생성해서 .operator를
        // 사용하지 않아도 외부에서 사용 가능

        // static variable은 모든 객체가 공유함
        System.out.println(StaticEx.a); // 0

        StaticEx st1 = new StaticEx();
        System.out.println(StaticEx.a); // 1

        StaticEx st2 = new StaticEx();
        System.out.println(StaticEx.a); // 2
        // StaticEx의 객체가 생성될 때마다 생성자 StaticEx()가 실행됨 (a++;)
        // static variable은 그 클래스로부터 생성된 모든 객체가 공유하므로
        // a의 값이 증가해서 print됨

    }
    
}

