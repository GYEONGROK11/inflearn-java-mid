package nested.nested;

public class NestedOuterMain {


    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();
        //outer.outInstanceValue; //바깥 클래스의 인스턴스 멤버에 접근할 수 없다. - 스태틱 클래스 라서
        //NestedOuter.outClassValue; // private이 붙으면 접근 불가 - 내부에서만 접근가능

        System.out.println("nestedClass = " + nested.getClass());
    }
}
