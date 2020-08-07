public class QuestionThirteen {

    public static void main(String[] args) {

        // 2, 5, 5, 10
        int convertThisToBinary = 0;
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            convertThisToBinary += counter;
            System.out.println(Integer.toBinaryString(convertThisToBinary));
            counter++;

        }

        //

//        String str = "10101";
//        String result = "";
//        for (int i = 0; i < 4; i++) {
//            if (i < 3) {
//                result.concat(String.valueOf(str.charAt(0)));
//            }
//            if (i >= 1) {
//                System.out.print(str.charAt(1));
//                if (i >= 2) {
//                    System.out.print(str.charAt(2));
//                    if (i >= 3) {
//                        System.out.print(str.charAt(3));
//                    }
//                }
//            }
//            if (i == 3) {
//                result = String.valueOf(str.charAt(1)) + String.valueOf(str.charAt(2)) + String.valueOf(str.charAt(3)) + String.valueOf(str.charAt(4));
//            } else {
//                System.out.println(result);
//            }
//
//        }

    }
} // not done. Not printing in the correct order.
