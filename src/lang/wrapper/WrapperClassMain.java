package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        //래퍼클래스는 기본 불변임
        Integer newInteger = new Integer(10); //미래에 삭제 예정, 대신에 valueOf()를 사용
        Integer integerObj = Integer.valueOf(10); //-128 ~ 127 자주 사용하는 숫자 값 풀에 미리 만들어놓음, 재사용 - 성능상 유리, 불변
        Integer integerObj1 = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue(); //getValue 같은것
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("==: " + (integerObj == integerObj1));  //풀 사용
        System.out.println("equals: " + (newInteger.equals(integerObj)));
    }
}
