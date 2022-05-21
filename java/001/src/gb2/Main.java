package gb2;

public class Main {
    public static int arraySum(String[][] twoDimensionalArray) throws MyArraySizeException, MyArrayDataException {
// исключение MyArraySizeException с выводом результата
        if (twoDimensionalArray.length != 4) {
            throw new MyArraySizeException("Длина массива != 4");
        }

        for (String[] array : twoDimensionalArray) {
            if (array.length != 4) {
                throw new MyArraySizeException("Высота массива != 4");
            }
        }
// преобразование в int и суммирование
        int sum = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(twoDimensionalArray[i][j]);
                } catch (NumberFormatException e) {
// исключение MyArrayDataException с выводом результата
                    throw new MyArrayDataException("Не число в элементе:" + i  + "," + j);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
// создание массива
        String[][] successArray =
                {{"1", "3", "5", "6"},
                        {"1", "3", "5", "6"},
                        {"1", "3", "5", "6", "5"},
                        {"1", "3", "5", "6"}};

        Integer[][] array = new Integer[4][];
        array[0] = new Integer[4];
        array[0] = new Integer[5];
        array[0] = new Integer[4];

        try {
            System.out.println(arraySum(successArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
// исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные
        String[][] invalidDataArray =
                {{"1", "3", "5", "6"},
                        {"1", "3a", "5", "6"},
                        {"1", "3", "5", "6"},
                        {"1", "3", "5", "6"}};

        try {
            System.out.println(arraySum(invalidDataArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}