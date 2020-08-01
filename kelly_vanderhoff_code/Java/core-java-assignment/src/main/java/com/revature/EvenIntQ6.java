package com.revature;

public class EvenIntQ6 {

    private final int value;

    public EvenIntQ6(int i) {
        this.value = i;
    }

    public void isEven() {
        if ((this.value / 2) == ((this.value + 1) / 2)) {
            System.out.println(this.value + " is even.");
        } else {
            System.out.println(this.value + " is odd.");
        }
    }

    public static void main(String[] args) {
        EvenIntQ6 evenInt = new EvenIntQ6(28), oddInt = new EvenIntQ6(7);
        evenInt.isEven();
        oddInt.isEven();
    }
}
