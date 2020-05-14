public class CharAndBoolean {
    public static void main(String[] args) {

        // width of 16 (2 bytes)
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodechar);

        boolean myBoolean = false;

        // Challenge
        // 1. Find the code for the registered symbol
        // 2. Create a variable of type char and assign it to the
        //    unicode value for that symbol
        // 3. Print out the value
        char registeredSymbol = '\u00AE';
        System.out.println("Register symbol: " + registeredSymbol);
    }
}
