import java.util.ArrayList;
import java.util.Scanner;

public class ListOfNames {

    private final ArrayList<String> nameList;

    public ListOfNames() {
        this.nameList = new ArrayList<>();
        nameList.add("Johan");
        nameList.add("Hyveri");
        nameList.add("Kalle");
        nameList.add("Johann Sebastian Bach");
        nameList.add("Mozart");
        nameList.add("Lisa");
        nameList.add("Ludwig van Beethoven");

    }
    public void printNames() {
        System.out.print("Names in list: \t");
        for (String name : nameList) {
            System.out.print(name + ", ");
        }
        System.out.println("\n");
    }
    public void printBestFriends() {
        ArrayList<String> bestFriends = new ArrayList<>();

        for (String bestFriend : nameList) {
            if (bestFriend.equals("Johann Sebastian Bach"))
                bestFriends.add(bestFriend);
            if (bestFriend.equals("Ludwig van Beethoven"))
                bestFriends.add(bestFriend);
        }
        System.out.print("Your best friends are: \t");
        for (String bestFriend : bestFriends) {
            System.out.print(bestFriend + ", ");
        }
        System.out.println("\n");

    }

}
