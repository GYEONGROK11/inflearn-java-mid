package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter(); //x001
        InnerOuter.Inner inner = outer.new Inner(); //x001내부에x002 -실제로는 002에서 001 참조를 보관 - 002에서 001접근가능
        inner.print();

        System.out.println("innerClass = " + inner.getClass());

    }
}
