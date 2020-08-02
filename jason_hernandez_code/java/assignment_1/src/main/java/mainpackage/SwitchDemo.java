package mainpackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SwitchDemo {


    // Need to have the datetime available
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now = LocalDateTime.now();

    // And have the string
    String string = "I am learning Core Java";

    // Getters and Setters
    public DateTimeFormatter getDtf() {
        return dtf;
    }

    public void setDtf(DateTimeFormatter dtf) {
        this.dtf = dtf;
    }

    public LocalDateTime getNow() {
        return now;
    }

    public void setNow(LocalDateTime now) {
        this.now = now;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    // Build the cases in the switcher
    public SwitchDemo() {
        switch (expression) {
            case "sqrt": System.out.println(Math.sqrt(double a));
            break;
            case "date": System.out.println(dtf.format(now));
            break;
            case "split": System.out.println(string[] = string.split(" "));
            break;

        }
    }
}
