package mainpackage;

public class FindMinimum {

    int num1;
    int num2;

    public int findTheMinimum(int num1, int num2) {

        // A ternary operator allows this in one line
        int result = num1 < num2 ? num1 : num2;
        System.out.println("Original numbers are " + num1 + ", " + num2);
        System.out.println("Smallest Number is:" + result);
        return result;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
