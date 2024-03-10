import java.util.Scanner;

public class Reggie {
    public static void main (String [] args){
    Scanner in = new Scanner(System.in);
    String socialSecNumber;
    String studentID;
    String menuChoice;

    socialSecNumber = SafeInput.getRegExString(in,"Enter your social security number as XXX-XX-XXXX", "^\\d{3}-\\d{2}-\\d{4}$");
    studentID = SafeInput.getRegExString(in,"Enter your UC ID as MXXXXX", "^(M|m)\\d{5}$");
    menuChoice = SafeInput.getRegExString(in,"Enter your action Open, Save, View, Quit: " + "[O/S/V/Q]", "^[OoSsVvQq]$");

    System.out.println("Your social security number is " + socialSecNumber + ", your UC ID is " + studentID + ".");
}
}
