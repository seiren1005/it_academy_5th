public class GetterSetter {
    
    private int a;
    private int b;


    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    // getter/setter
    // 외부로부터 객체 내부의 정보 보호 (Encapsulation, 캡슐화)
    // 메소드나 변수에 private 접근 제한자 설정하면 외부에서 사용 불가
    // 따로 허락한 방식으로 외부에서 사용할 수 있도록 해줌
    // 메소드를 호출해서 명시적으로 값을 변경하거나 또는 가져가는 것을 알리기
    // 위해서 getter/setter method 사용

    // 외부에서 a의 값을 변경하기 위해서는 setA(int a) 메소드를 통해서만 가능
    // 외부에서 a의 값을 사용하기 위해서는 getA() 메소드를 통해서만 가능
    // b도 마찬가지
    
}

