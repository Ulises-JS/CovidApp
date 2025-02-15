/*
Name: Ulises Servellon
Date: 04/28/23
Description: ou have been hired as a Java developer by the U.S Health  Department to design an algorithm,
create and deploy one secure  COVID -19 Booster Vaccine compliant checking java program.
 */
import java.util.*;//imports scanner and other classes.
public class Main {
    static Scanner input = new Scanner(System.in);//Create input object and associate it with input stream.
    public static void main(String[] args) {
        try {//try starts
            //declare variables
            String userAnswer;
            String firstName;
            String lastName;
            int Age;
            int zipCode;
            int usersChoice;

            System.out.println("Welcome to the U.S Health Department ");//Displays a welcome message.
            //Asks the user if they would like to use the application.
            System.out.println("Would you like to use the application? please answer Yes to continue or No to exit! ");
            userAnswer = input.next();

            //If the user chose YES, the application will continue running.
            if (userAnswer.compareToIgnoreCase("yes") == 0) {
                System.out.println("You selected YES.");

                //asks for the user's personal information.
                System.out.println("Please enter your first name: ");
                firstName = input.next();
                System.out.println("Please enter your last name: ");
                lastName = input.next();
                System.out.println("Please enter your age: ");
                Age = input.nextInt();
                System.out.println("Please enter your zipcode: ");
                zipCode = input.nextInt();

                //Confirms to the user the information they entered.
                System.out.println("Your first name is " + firstName + "\nYour last name is: " + lastName + "\nYour age is: " + Age + "\nand your zipcode is: " + zipCode);

                //This shows the user the different vaccines available.
                System.out.println(" Please Select an option!");
                System.out.println("1 = Pfizer-BioNTech");
                System.out.println("2 = Moderna");
                System.out.println("3 = Jonhson & Jonhson's");
                System.out.println("4 = Other");

                usersChoice = input.nextInt();//Asks the user to enter a choice from 1 to 4.

                //this determines what vaccine the user chose.
                switch (usersChoice) {
                    case 1://if the user chose 1, this happens.
                        System.out.println("You chose 1, which means you received a covid booster by Pfizer-BioNTech ");
                        break;

                    case 2://if the user chose 2, this happens.
                        System.out.println("You chose 2, which means you received a covid booster by Moderna ");
                        break;

                    case 3://if the user chose 3, this happens.
                        System.out.println("You chose 3, which means you received a covid booster by Johnson & Johnson's ");
                        break;

                    case 4://if the user chose 4, this happens.
                        System.out.println("You chose 4, which means you received a covid booster other then the ones listed. ");
                        break;

                    default://if the user chose a number other than 1 to 4, it displays an invalid choice message.
                        System.out.println("You entered an invalid choice.");
                }

            }
            else {//if the user chose NO, a message confirming their choice will be displayed.
                System.out.println("You chose NO, goodbye and thank you for using our program!");
            }
        }//try ends
        //Catches if the user enters invalid data and displays a message confirming the invalid data.
        catch(InputMismatchException misMatch)
        {
            System.out.println("You entered invalid data!!!!");
        }

    }
}