public class Car {
    
    String color;
    int speed;
    int mileage;

    // Constructor (생성자) : class_name과 이름이 같은 method
    // reture type (반환 타입) 이 없음.
    // Parameter (매개변수) 를 가질 수 있다. (not mandatory)
    // Car class의 Object (객체) 가 생성될 때마다 실행됨.
    // 코딩 시 생성자를 선언하지 않아도 없을 경우 자바에서 자동으로 객체가 생성될
    // 때 기본 생성자 (아무 일도 하지 않는 생성자) 를 추가해줌.
    // 따로 생성자를 명시할 경우 자바에서 기본 생성자를 자동으로 추가시켜주지 않음

    public Car(int speed) {
        this.speed = speed;
        // this.speed : 이 클래스에서 선언된 변수인 speed를 의미
        // speed : parameter로 주어진 speed
        // parameter로 주어진 speed 값을 이 클래스에서 선언한 speed 변수에 저장
        // 하겠다는 의미
    }

    public Car(String color) {
        // @Override (생성자 오버로딩)
        // 이름이 같고 그 외 parameter의 타입, 개수, 순서 중 적어도 하나가 반드시
        // 달라야 됨
    }

    public int speedUp() {
        return speed;
    }
    
    public void speedUp(int x) {
        // @Override (메소드 오버로딩) : 메소드 이름이 같아야 됨
        // 메소드의 retunr type은 같아도 달라도 됨
        // parameter에서 타입, 개수, 순서가 적어도 하나는 반드시 달라야 됨
    }
    
}

