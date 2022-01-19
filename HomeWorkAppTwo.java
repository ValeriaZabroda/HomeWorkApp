public class HomeWorkAppTwo {
    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное);
        }
    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printWordNTimes(String word, int times) {
        for (int times = 0; times < 10; times++) {
            System.out.println("Word");
        }
    }