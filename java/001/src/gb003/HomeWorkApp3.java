package gb003;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        invertArray(); //1
        System.out.println("**********");
        fillArray(); //2
        System.out.println("**********");
        changeArray(); //3
        System.out.println("**********");
            int counter = 1; //4
            int[][] table = new int[5][5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    table[i][j] = counter;
                    System.out.print(table[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("**********");
        returnArray2(5,15); //5
    }
    //1
    public static void invertArray() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
            System.out.println(arr[i] + "\t");
        }
    }
    //2
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i] + "\t");
        }
    }
    //3
    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                System.out.println(arr[i] * 2 + "\t");
            }
            else {
                System.out.println(arr[i] + "\t");
            }
        }
    }
    //4
    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
        }
    }
    //5
    public static void returnArray2(int len, int initValue) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initValue;
            System.out.print(arr[i] + "\t");
        }
    }
}