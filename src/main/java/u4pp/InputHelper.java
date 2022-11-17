package u4pp;

import java.util.Scanner;

public class InputHelper {
    Scanner scanner;

    public void InputHelper(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean getYesNoInput(String prompt) {
        System.out.println(prompt);
        String userInput = this.scanner.next();

        Boolean isInputValid = userInput.equals("Y") || userInput.equals("y") || userInput.equals("n")
                || userInput.equals("N");
        return isInputValid;
    }

    public int getIntegerInput(String prompt, int min, int max) {
        int i = min - 1;
        while (i < min || i > max) {
            System.out.println(prompt);
            String userInput = this.scanner.next();
            i = Integer.parseInt(userInput);
        }
        return i;
    }
}
