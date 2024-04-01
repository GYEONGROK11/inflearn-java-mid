package lang.string.chaining;

public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();
        //메소드 체이닝 기법 : 리턴이 자기 자신 타입일 때 가능, 코드를 간결하고 읽기쉽게 만들어줌
        System.out.println("result = " + result);
    }
}
