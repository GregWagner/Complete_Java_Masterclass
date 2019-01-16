import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year of birth: ");
        boolean hasNextInt = input.hasNextInt();
        if (hasNextInt) {
            int birthYear = input.nextInt();
            input.nextLine();       // go over line seperator

            System.out.print("Enter your name: ");
            String name = input.nextLine();

            System.out.println("Your name is " + name);

            int age = 2018 - birthYear;
            if (age >= 0 && age <= 100) {
                System.out.println("Your age is " + age);
            } else {
                System.out.println("Invalid birth year entered");
            }
        } else {
            System.out.println("Unable to parse birth year");
        }
        input.close();
    }
}
