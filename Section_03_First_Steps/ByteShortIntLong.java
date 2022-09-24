public class ByteShortIntLong {
    public static void main(String[] args) {
        // int has a width of 32
        int value = 10000;

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value: " + minIntValue);
        System.out.println("Integer Maximum Value: " + maxIntValue);
        System.out.println("Busted Maximum Value: " + (maxIntValue + 1));
        System.out.println("Busted Minimum Value: " + (minIntValue - 1));

        int maxIntTest = 2_147_483_647;

        // byte has a width of 8
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value: " + minByteValue);
        System.out.println("Byte Maximum Value: " + maxByteValue);

        // the cast is not required
        int intTotal = (minIntValue / 2);
        // the cast is required
        byte byteTotal = (byte)(minByteValue / 2);

        // short has a width of 16
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value: " + minShortValue);
        System.out.println("Short Maximum Value: " + maxShortValue);

        // long has a width of 64
        long longValue = 100L;
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value: " + minLongValue);
        System.out.println("Long Maximum Value: " + maxLongValue);

        // Challenge
        // 1. Create a byte variable and set it to any valid byte number.
        byte byteValue = 10;

        // 2. Create a short variable and set it to any valid short number.
        short shortValue = 20;

        // 3. Create a int variable and set it to any valid int number.
        int intValue = 50;

        // 4. Create a variable of type long, and make it equal to
        //    50000 + 10 times the sum of the byte, plus the short, plus the int
        long aLongValue = 50000L + (10L * (byteValue + shortValue + intValue));
        System.out.println(aLongValue);
    }
}
