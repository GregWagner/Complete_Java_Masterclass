public class FlourPack {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 12));
        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0) {
            return false;
        }
        for (int big = 0; big <= bigCount; ++big) {
            for (int small = 0; small <= smallCount; ++small) {
                if ((big * 5) + small == goal) {
                    return true;
                }
            }
        }
        return false;
    }
}
