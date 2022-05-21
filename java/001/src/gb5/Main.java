package gb5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//Найти и загрузить файл "hw5.txt"
        AppData appData = new AppData();
        appData.load("hw5.txt");

        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.deepToString(appData.getData()));
//Сохранить файл с названием "hw5-1.txt"
        appData.save("hw5-1.txt");
    }
}
