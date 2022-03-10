public class StaticEx {
    
    // static field
    static int number = 10;
    static int a = 0;

    // static method
    static void method1() {
        // static method 안에서 this 키워드 사용 불가
        System.out.println("static method.");
    }

    // Constructor StaticEx : 클래스 객체가 생성될 때마다 실행
    public StaticEx() {
        a++;
    }

    // static : 클래스에 소속
    // 객체를 따로 생성하지 ㅇ낳아도 사용할 수 있게 메모리에 먼저 loading 시킴

    // 클래스는 디자인 같은 의미의 이런 변수, 메소드가 잇다는 것을 알려주는 것
    // 객체는 디자인을 토대로 실제로 만드는 작업
    // 클래스가 가지고 있는 변수, 메소드를 저장할 공간을 메모리에 할당 시킴

    // static은 실행하지 않아도 항상 메모리를 차지하기 때문에 너무 많이
    // 사용하는 것은 좋지 않음
    
}

