public class CarTest {
    public static void main(String[] args) {
        
        Car c1 = new Car(100);
        Car c2 = new Car("RED");
        // Car 클래스의 객체 생성시
        // Car() 생성자에 맞는 parameter를 넣어줘야 생성 가능
        // Car(100)은 Car(int speed) 호출
        // Car("RED")는 Car(String color) 호출

        // 만약 Car()라는 parameter를 지정하지 않은 생성자가 존재하면
        // parameter 넣어주지 않아도 객체 생성 가능
        
    }
    
}

