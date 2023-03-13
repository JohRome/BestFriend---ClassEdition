import java.util.Scanner;

public class Application {
    private ListOfNames listOfNames;
    private Menu menu;

    public Application() {
        this.listOfNames = new ListOfNames();
        this.menu = new Menu();
    }

    public void initialize() {

        boolean isDone = false;
        while (!isDone) {
            menu.printMenu();

            int menuChoise = menu.menuOptions(1, 3);

            switch (menuChoise) {
                case 1 -> listOfNames.printNames();
                case 2 -> listOfNames.printBestFriends();
                case 3 -> isDone = true;
            }



        }



    }
}





