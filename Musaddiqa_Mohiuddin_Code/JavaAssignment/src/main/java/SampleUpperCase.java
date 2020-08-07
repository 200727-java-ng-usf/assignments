public class SampleUpperCase extends StringAbstract {

    @Override
    boolean checkUppercase(String input) {

        for(int i = 0; i < input.length(); i++) {
            if(Character.isUpperCase(input.charAt(i))) {
                return true;
            }
        }

        return false;
    }

    @Override
    String convertUppderCase(String input) {
        return input.toUpperCase();
    }

    @Override
    int sumString(String input) {
        return Integer.valueOf(input) + 10;
    }

}