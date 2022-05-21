package gb002;

public class HomeWorkApp2 {
    public static void main(String[] args){

        if (within10and20(10, 5)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("**********");

        isPositiveOrNegative(5);

        System.out.println("**********");

        if (isNegative(-5)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("**********");

        for (int i = 1; i < 6; i++) {
            System.out.println("word №" + i);
        }

        System.out.println("**********");

        if (isLeapYear(400)) {
            System.out.println("isLeapYear");
        } else {
            System.out.println("isNotLeapYear");
        }

        System.out.println("**********");
    }

    public static boolean within10and20(int a, int b) {
        return a + b >= 10 && a + b <=20;
    }

    public static void isPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    public static boolean isNegative(int number) {
        if (number < 0) {
            return true;
        }
        return false;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
