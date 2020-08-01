public class Question13 {
    public StringBuilder displayTriangle() {
        boolean on = false;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 1; i < 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(on ? "1" + " " : "0" + " ");
                stringBuilder.append(on ? "1" + " " : "0" + " ");
                on = !on;
            }
            stringBuilder.append("\n");
            System.out.println();
        }
        return stringBuilder;
    }
}
