package mainpackage;

public class SubChangeCase extends ChangeCase{

    // Begin with a string
    String stringToCheck;

    // If the string matches its toLowerCase version,then it does NOT contain an uppercase,
    // and is therefore false.
    @Override
    boolean checkForUppercase() {
        boolean isLowercase = !stringToCheck.equals(stringToCheck.toLowerCase());
        if(isLowercase) {
            return false;
        } else {
            return true;
        }
    }

    // Very straightforward, converts to uppercase
    @Override
    String convertToUppercase() {
        String s1upper=stringToCheck.toUpperCase();
        return s1upper;
    }


    @Override
    int convertToIntPlusTen() {
        // Create new field for the converted string
        String asciiValue = "";
        // Break original string down to char array
        final char[] chars = stringToCheck.toCharArray();
        // Find the ascii value of each character and add it to the new field
        for (int i = 0; i < chars.length; i++) {
            asciiValue += String.valueOf((int) chars[i]);
        }
        // Convert string of numeric characters to int
        int asciiInt = Integer.parseInt(asciiValue);
        // Add ten to the resulting int
        asciiInt += asciiInt + 10;
        return asciiInt;
    }
}
