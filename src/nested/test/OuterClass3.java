package nested.test;

public class OuterClass3 {
    public void myMethod() {

        class LocalClass {  //지역클래스
            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }

        LocalClass local = new LocalClass();
        local.hello();
    }
}
