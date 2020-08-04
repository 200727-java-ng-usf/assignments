package mainpackage;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;

public class NotePadReader {

    private static String REGEX = ":";
    private NotePadReader(String s) {
        NotePadReader parser = new NotePadReader
                ("C:\\Users\\jason\\200727-java-ng-usf\\assignments\\jason_hernandez_code\\java\\assignment_1\\src\\main\\resources");
        parser.processLineByLine();
    }

    public String[] split(String regex) {
        return new String[0];
    }

    private void processLineByLine() {
    }
}
