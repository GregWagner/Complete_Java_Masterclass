public class Switch {
    public static void main(String[] args) {
        int value = 3;
        switch (value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char c = 'C';
        switch (c) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("A, B, C, D, or E was entered.");
                break;
            default:
                System.out.println("The character was not A through E.");
                break;
        }
    }
}
