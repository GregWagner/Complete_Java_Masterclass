public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(4.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(3.174, 3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.174));
    }
    
    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
        int first = (int)(x * 1000);
        int second = (int)(y * 1000);
        return first == second;
    }
}
