public class Q15CalcMethods implements Q15Calc {

    private int num1;
    private int num2;
    private int ans;

    // constructor no args
    public Q15CalcMethods() {
        this.num1 = 3;
        this.num2 = 5;
        this.ans = 0;
    }

    // constructor one arg
    public Q15CalcMethods(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    // getters and setters
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

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

    @Override
    public int add() {
        this.ans = this.num1 + this.num2;
        System.out.println("Here is " +this.num1 + " and " + this.num2 + " added.");
        System.out.println(ans);
        return ans;
    }

    @Override
    public int subtract() {
        this.ans = this.num1 - this.num2;
        System.out.println("Here is " + this.num1 + " and " + this.num2 + " subtracted.");
        System.out.println(ans);
        return ans;
    }

    @Override
    public double multiply() {
        this.ans = this.num1 * this.num2;
        System.out.println("Here is " + this.num1 + " and " + this.num2 + " multiplied.");
        System.out.println(ans);
        return ans;
    }

    @Override
    public double divide() {
        this.ans = this.num1 / this.num2;
        System.out.println("Here is " + this.num1 + " and " + this.num2 + " divided.");
        System.out.println(ans);
        return ans;
    }
} // done except tests
// two tests per if statement
// at least two unit tests. One for if it works with goode value.
// One that tests for values that shouldn't work. Positive and negative case as a minimum.
