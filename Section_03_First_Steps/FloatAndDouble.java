import java.util.function.IntBinaryOperator;

public class FloatAndDouble {
    public static void main(String[] args) {
        // width of a float = 32 (4 bytes)
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value: " + minFloatValue);
        System.out.println("Float Maximum Value: " + maxFloatValue);

        // width of a double = 64 (8 bytes)
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value: " + minDoubleValue);
        System.out.println("Double Maximum Value: " + maxDoubleValue);

        int intValue = 5 /2;
        float floatValue = 5f / 2;
        double doubleValue = 5.0 / 2;
        System.out.println("Int: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);

        // Challenge
        // Covert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms from the above and
        //    store it in a variable
        // 3. Print out the results
        //
        // Notes: 1 pound is equal to 0.45359237 kilograms
        double weightInPounds = 200.0;
        double weightInKilograms = weightInPounds * 0.45359237;
        System.out.println(weightInKilograms + " kilograms");
    }
}
