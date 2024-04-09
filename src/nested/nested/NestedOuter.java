package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested { //정적중첩클래스 : 나의 안에 있지만 내것이 아님, 스태틱이 붙음


        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에 접근에는 접근할 수 없다. - 스태틱 클래스 라서
            //System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private도 접근 가능
            //static int outClassValue = 3; 일땐 어디서든 접근 가능하지만 private이 붙으면 접근 불가 - 내부에서만 접근가능
            System.out.println(NestedOuter.outClassValue);
        }
    }
}
