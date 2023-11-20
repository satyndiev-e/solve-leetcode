import java.util.Scanner;

public class p1678 {
    public static String interpret(String command) {
            command = command.replace("()", "o").replace("(al)", "al");
        return command;
    }
}
