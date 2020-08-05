package mainpackage;

public class Triangle<rows> {
    public void Triangle() {
        Triangle triangle = new Triangle();
        // Adapted from codeforcoding.com/java-program-to-display-triangle-binary-pattern/

        // Declare fields
        int i, j, rows;

        // Define number of rows
        rows=4;

        // Iterate over the rows
        for(i=1;i<=rows;i++) {
            // Alternate 0 and 1
            for (j = 1; j <= i; j++) {
                if ((i + j) % 2 == 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            // Print the triangle in one go
            System.out.println();
        }
    }
}