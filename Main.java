import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Step 1: boolean valid set to false
    boolean valid = false;
    String password = "";
    int length = 0;
    //Step 2: start conditional loop while valild is false
    while (valid == false) {
        password = Keyboard.getText("Please enter your password.");
        length = password.length();
        char firstLetter= password.charAt(0);
        char lastLetter = password.charAt(length - 1);
        int firstValue = (int) firstLetter;
        int lastValue = (int) lastLetter;
        if ((firstValue >= 40 && firstValue <= 42) && (lastValue >= 65 && lastValue <= 90) && (length > 7)) {
          valid = true;
        } else {
          System.out.println("Error: password must be at least 8 characters, with ()* to start and a capital at the end.");
        }
    }
    System.out.println("Your password meets the strength requirements.");
    //Step 3: ask user to enter password
    //Step 4: set character firstLetter to the value of the first letter of password
    //Step 5: set character lastLetter to the value of the last letter of password
    //Step 6: integer firstValue to the ascii value of firstLetter
    //Step 7: integer lastValue to the ascii value of lastLetter
    //Step 8: If firstValue is between 40 and 42 AND lastValue is between 65 and 90 AND password length is greater than 7 THEN
    //Step 9: valid = true
    //Step 10: ELSE
    //Step 11: display "Error password must be at least 8 characters, with a ()* to start adn a captial at the end"
    //Step 12: END IF
    //Step 13: END LOOP
    //Step 14: display "Your password meets the strength requirements"
  }
}
