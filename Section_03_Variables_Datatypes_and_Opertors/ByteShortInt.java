public class ByteShortInt {
    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myIntTotal = (myMinValue / 2);
        System.out.println("MyINtTotal = " + myIntTotal);

        // byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        byte myByteTotal = (byte)(myMinByteValue / 2);
        System.out.println("MyByteTotal = " + myByteTotal);

        // short has a width of 16
        short myMinShortValue = -32_768;
        short myMaxShortValue = 32_767;
        short myShortTotal = (short)(myMaxShortValue / 2);

        // long has a width of 64
        long myLongValue = 100L;

        // Challenge
        // 1. Create a byte variable and set it to any valid byte number.
        byte byteValue = 30;

        // 2. Create a short variable and set it to any valid short number.
        short shortValue = 20;

        // 3. Create a int variable and set it to any valid int number.
        int intValue = 10;

        // 4. Create a variable of type long, and make it equal to
        //    50000 + 10 times the sum of the byte, plus the short, plus the int
        long longValue = 5000L + (10L * (byteValue + shortValue + intValue));
        System.out.println(longValue);
    }
}
