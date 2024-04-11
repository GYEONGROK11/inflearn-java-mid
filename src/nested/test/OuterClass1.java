package nested.test;

public class OuterClass1 {

    static class NestedClass {  //정적 중첩 클래스
        public void hello() {
            System.out.println("NestedClass.hello");
        }
    }
}
