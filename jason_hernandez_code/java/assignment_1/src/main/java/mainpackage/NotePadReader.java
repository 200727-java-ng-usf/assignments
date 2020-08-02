package mainpackage;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class NotePadReader {
    private NotePadReader() {
        NotePadReader parser = new NotePadReader
                ("C:\\Users\\jason\\200727-java-ng-usf\\assignments\\jason_hernandez_code\\java\\assignment_1\\src\\main\\resources");
        parser.processLineByLine();

    }
}
