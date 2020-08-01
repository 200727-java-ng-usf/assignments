public class Question13 {
    public void displayTriangle() {
        boolean on = false;
        for(int i = 1; i < 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(on ? 1 + " " : 0 + " ");
                on = !on;
            }
            System.out.println();
        }
    }
}
