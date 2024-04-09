package nested;

public class ShdowingMain { //내부클래스와 멤버필드 이름이 같다면

    public int value = 1;  //밸류

    class Inner {
        public int value = 2;  //밸류

        void go() {
            int value = 3;   //밸류
            //가깝고 구체적인 것이 우선권을 가짐
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("ShdowingMain.value = " + ShdowingMain.this.value);
        }
        //하지만 웬만하면 이름을 달리하자
    }

    public static void main(String[] args) {
        ShdowingMain main = new ShdowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
