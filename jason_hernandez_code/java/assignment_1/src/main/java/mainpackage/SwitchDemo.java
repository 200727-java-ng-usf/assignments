package mainpackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class SwitchDemo {

    // Number to find the sqrt
    double a;

    // Need to have the datetime available
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now = LocalDateTime.now();

    // And the string
    String theString;

    // Build the cases in the switcher
    public void buildSwitchDemo(String dataPoint) {

        switch (dataPoint) {
            case "sqrt": System.out.println(Math.sqrt(a));
            break;
            case "date": System.out.println(dtf.format(now));
            break;
            case "split": System.out.println(Arrays.toString(theString.split(" ")));
            break;

        }
    }

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
        return theString;
    }

    public void setString(String string) {
        this.theString = string;
    }


}
