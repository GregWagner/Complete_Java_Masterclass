public class FloatAndDouble {
    public static void main(String[] args) {

        // width of a int = 32 (4 bytes)
        int myIntValue = 5 / 3;

        // width of a float = 32 (4 bytes)
        float myFloatValue = 5.0f / 3.0f;

        // width of a double = 64 (8 bytes)
        double myDoubleValue = 5.0 / 3.0;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

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
