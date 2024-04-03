package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    //추가 - 밖에서 계산하지 않고 안에서 계산 - 객체지향적으로 변경
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
