package mainpackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SwitchDemo {


    // Need to have the datetime available
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now = LocalDateTime.now();

    // And have the string
    String string = "I am learning Core Java";

    // Build the cases in the switcher
    public SwitchDemo() {
        switch (expression) {
            sqrtcase: System.out.println(Math.sqrt(double a));
            break;
            datecase: System.out.println(dtf.format(now));
            break;
            splitcase: System.out.println(string[] = string.split(" "));
            break;

        }
    }
}
