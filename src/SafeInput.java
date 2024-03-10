
import java.util.Scanner;
public class SafeInput {
    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do {
            System.out.print(“\n” + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;

    }
    public static int getInt(Scanner pipe, String prompt) {
        int number = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.println("\n" + prompt + ":");
            if (pipe.hasNextInt()) ;
            {
                number = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
     else
            {
                trash = pipe.nextLine();
                System.out.println("Invalid Input:" + trash + ".");
            }

            }while (!done);
        return number;
        }
    public static double getDouble(Scanner pipe, String prompt)
    {
        double decimalNumber =0;
        String trash = "":
        boolean done = false;

        do {
            System.out.println( "\n" + prompt + ":");
            if (pipe.hasNextDouble()) {
                decimalNumber = pipe.nextDouble();
                pipe.nextLine();
                done = true;
                System.out.Println(decimalNumber);
            }
            else {
                trash = pipe.nextLine();
                System.out.println("Invalid entry" + trash + ".");
            }

        }while (!done);
        return decimalNumber;
    }
    public static int getRangedInt (Scanner pipe, String prompt, int low, int high)
    { int result = 0;
        String trash + "";
        boolean done = false;
        do {
            System.out.println(prompt+ "{" +low+ "-" +high + "}:" );
            if (pipe.hasNextInt());
            { result =pipe.nextInt();
                pipe.nextLine();
                if (result > low && result <=high)
                {
                    done=true;
                }
                else {
                System.out.print( "Invalid entry:" + result + ". You must enter a value within range: [" +low + "-" +high + "]");
            }

        } else {            }
       }

    }
    }
