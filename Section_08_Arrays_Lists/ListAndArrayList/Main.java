import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t0 - To print choice options.");
        System.out.println("\t1 - To print the list of grocery items.");
        System.out.println("\t2 - To add an item to the list.");
        System.out.println("\t3 - To modify an item in the list.");
        System.out.println("\t4 - To remove an item from the list.");
        System.out.println("\t5 - To quit the application.");
    }

    private static void addItem() {
        System.out.print("Enter the grocery item: ");
        groceryList.addGrocreyItem(input.nextLine());
    }

    private static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNumber = input.nextInt();
        input.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = input.nextLine();
        groceryList.modifyGroceryItem(itemNumber - 1, newItem);
    }

    private static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNumber = input.nextInt();
        groceryList.removeGroceryItem(itemNumber);
    }

    private static void searchForItem() {
        System.out.print("Enter item to search for: ");
        String searchItem = input.nextLine();
        if (groceryList.findGroveryItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in grocery list");
        } else {
            System.out.println(searchItem + " was not in grocery list");
        }
    }
}
