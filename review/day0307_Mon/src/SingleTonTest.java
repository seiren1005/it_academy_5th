public class SingleTonTest {
    
    public static void main(String[] args) {
        
        // SingleTon st = new SingleTon();
        // 다른 클래스에서 객체 생성 불가

        SingleTon st = SingleTon.getInstance();
        SingleTon st2 = SingleTon.getInstance();
        // st와 st2는 모두 같은 하나의 SingleTon 객체를 가리킴

        st.a = 100;
        
        System.out.println(st.a); // 100
        System.out.println(st2.a); // 100


    }

}

