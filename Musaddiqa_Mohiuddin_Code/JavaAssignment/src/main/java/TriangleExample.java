public class TriangleExample {

    private String triangleString;
    
    
	public String getTriangleString() {
		return triangleString;
	}

	void triangle(int n) {

		// declare row and column
        int row, col;

        for (row = 0; row < n; row++)  {
            for (col = 0; col <= row; col++)  {
                if (((row + col) % 2) == 0)  {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
                System.out.print("\t");
            }

            System.out.print("\n");
        }
        this.triangleString = "Triangle successfully Created";
    }

    public void main (Integer num) {
        
        triangle(num);
    }

}