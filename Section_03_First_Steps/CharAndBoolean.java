public class CharAndBoolean {
    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char aChar = 'D';
        char aUnicodeChar = '\u0044';   // also the letter D
        System.out.println(aChar);
        System.out.println(aUnicodeChar);

        char copyrightChar = '\u00A9';
        System.out.println(copyrightChar);


        boolean aBoolean = false;

        // Challenge
        // 1. Find the code for the registered symbol
        // 2. Create a variable of type char and assign it to the
        //    unicode value for that symbol
        // 3. Print out the value
        char registeredSymbol = '\u00AE';
        System.out.println("Register symbol: " + registeredSymbol);
    }
}
