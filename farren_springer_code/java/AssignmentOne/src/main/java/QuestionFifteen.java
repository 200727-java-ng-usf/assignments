public class QuestionFifteen implements QuestionFifteenInterface{

    private int num1;
    private int num2;
    private int ans;

    // constructor no args
    public QuestionFifteen() {
        this.num1 = 3;
        this.num2 = 5;
        this.ans = 0;
    }

    // constructor one arg
    public QuestionFifteen(int num1, int num2){
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
    public void add() {
        this.ans = this.num1 + this.num2;
        System.out.println("Invoking add method");
        System.out.println(ans);
    }

    @Override
    public void subtract() {
        this.ans = this.num1 - this.num2;
        System.out.println("Invoking subtract method");
        System.out.println(ans);
    }

    @Override
    public void multiply() {
        this.ans = this.num1 * this.num2;
        System.out.println("Invoking multiply method");
        System.out.println(ans);
    }

    @Override
    public void divide() {
        this.ans = this.num1 / this.num2;
        System.out.println("Invoking divide method");
        System.out.println(ans);
    }
} // done
