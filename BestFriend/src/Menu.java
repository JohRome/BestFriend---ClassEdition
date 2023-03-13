import java.util.Scanner;

public class Menu {

    public void printMenu() {
        System.out.println("1. See a list of all your friends");
        System.out.println("2. Print all your best friends");
        System.out.println("3. Exit program");
    }

    public int menuOptions(int startIndex, int endIndex) {
        Scanner input = new Scanner(System.in);
        int userInput = 0;

        while ( (userInput < startIndex) || (userInput > endIndex) ) {
            System.out.print("\nEnter a number from " + startIndex + " to " + endIndex + ": \n");
            userInput = input.nextInt();
        }
        return userInput;

    }




}
