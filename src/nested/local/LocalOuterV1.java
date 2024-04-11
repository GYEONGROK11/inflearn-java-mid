package nested.local;

public class LocalOuterV1 {

    private int outInstanceVar = 3;  //인스턴스 변수

    public void process(int paramVar) {

        int localVar = 1;  //지역변수

        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value=" + value);  //자신의 인스턴스 변수에 접근가능
                System.out.println("localVar=" + localVar);  //자신이 속한 코드블록의 지역변수에 접근가능
                System.out.println("paramVar=" + paramVar);  //자신이 속한 코드블록의 파라미터에 접근가능
                System.out.println("outInstanceVar=" + outInstanceVar);  //자신이 속한 클래스의 인스턴스 변수에 접근가능
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
