package enumeration.ex2;

public class ClassGradleEx2_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

/*      //새로운 인스턴스를 생성 할 수 있는 문제가 발생
        ClassGrade newClassGrade = new ClassGrade(); //x009
        //생성자에 private을 추가하여 인스턴스 생성을 막을 수 있음
        int result = discountService.discount(newClassGrade, price);
        System.out.println("newClassGrade 등급의 할인 금액: " + result);
*/
    }
}
