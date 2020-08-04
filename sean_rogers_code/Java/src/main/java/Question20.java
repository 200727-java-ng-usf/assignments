import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *     Mickey:Mouse:35:Arizona
 *     Hulk:Hogan:50:Virginia
 *     Roger:Rabbit:22:California
 *     Wonder:Woman:18:Montana
 *
 *     Write a program that would read from the file and print it out to the screen in the following
 *     format:
 *
 *     Name: Mickey Mouse
 *     Age: 35 years
 *     State: Arizona State
 */
public class Question20 {
    public StringBuilder fileOutput() {
        File file = new File("textfile.txt");
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        String[] words;
        try{
            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNext()) {
                line = scanner.nextLine();
                words = line.split(":");
                stringBuilder.append("Name: " + words[0] + " " + words[1] + "\n" + "Age: " + words[2] + " years\n" + "State: " + words[3] + " State\n\n");
            }
            System.out.println(stringBuilder.toString());
        } catch(Exception e) {
            e.printStackTrace();
        }
        return stringBuilder;
    }
}
