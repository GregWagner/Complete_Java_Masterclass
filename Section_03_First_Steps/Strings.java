// Woulld be better to use StringBuffers

public class Strings {
    public static void main(String[] args) {
        String aString = "This is a string";
        System.out.println("aString = " + aString);

        aString += ", and this is more.";
        System.out.println("aString = " + aString);

        aString += " \u00A9 2019";
        System.out.println("aString = " + aString);

        String numberString = "250.55";
        numberString += "49.95";
        System.out.println("numberString = " + numberString);

        String lastString = "10";
        int anInt = 50;
        lastString += anInt;        // convert int to string 1050
        System.out.println(lastString);

        double doubleNumber = 120.47;
        lastString += doubleNumber; // convert double to string 1050120.47
        System.out.println(lastString);
    }
}
