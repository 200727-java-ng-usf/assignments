/**
 * Displays the triangle on the console as follows using a for loop.
 *  0
 *  1 0
 *  1 0 1
 *  0 1 0 1
 */
public class Question13 {
    public StringBuilder displayTriangle() {

        //this is used to alternate between 0's and 1's
        boolean on = false;

        //stringBuilder will be returned
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
