package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    /*변수의 생명 주기
    클래스 변수 : 클래스가 로딩될 때 생성되고 클래스가 언로드될 때 소멸된다.   메서드 영역에 존재하고 가장 길다
    인스턴스 변수 : 객체가 생성될 때 생성되고 객체가 소멸될 때 소멸된다.  힙 영역에 존재함 GC전 까지 생존
    지역 변수 : 메서드가 호출될 때 생성되고 메서드가 종료될 때 소멸된다.  스택 영역에 존재함 가장 짧다
    */

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1; //지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);

                //인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();

        //printer.print();를 여기서 실행하지 않고 Printer 인스턴스만 반환한다. 아래 메인메소드에서 실행
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        //printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
