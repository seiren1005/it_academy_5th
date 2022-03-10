public class SingleTon {
    // Singleton pattern : 객체를 단 하나만 생성해서 사용할 수 있는 패턴

    public int a = 0;


    // static field (정적 필드)
    private static SingleTon instance = new SingleTon();
    // SingleTon 타입의 instance 변수 선언

    // Constructor
    private SingleTon() {
        // Access Modifier (접근 제한자) 로 private 사용
        // 다른 클래스에서 SingleTon 클래스의 객체를 생성하는 것을 막음
    }

    // static method
    public static SingleTon getInstance() {
        // Singleton 타입 변수를 리턴
        // instance는 위에서 SingleTon 타입 변수로 선언
        // instance를 리턴하기 위해서는 메소드 리턴 타입도
        // SingleTon 타입으로 선언해야 가능

        return instance;
        // 가지고 있는 객체의 참조 주소값 리턴
    }

    // 외부에서 SignleTon 객체를 생성 불가 오직 getInstance() 메소드를 통해서만
    // SingleTon 객체의 참조 주소를 가져와 사용할 수 있음

}

