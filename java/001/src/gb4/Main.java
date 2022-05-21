package gb4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//Массив с наборов слов (10-20)
        String[] words = {"Apple", "Potato", "Orange", "Apple", "Bread", "Tomato", "Carrot", "Beet", "Bread", "Carrot",
                "Beet", "Tomato", "Potato", "Orange", "Tomato", "Bread", "Apple", "Carrot", "Bread", "Orange"};

        HashMap<String, Integer> uniqueWords = new HashMap<>();
//Вывод списка уникальных слов
        for (int i = 0; i < words.length; i++) {
            if (uniqueWords.containsKey(words[i])) {
                uniqueWords.put(words[i], uniqueWords.get(words[i]) + 1);
            } else {
                uniqueWords.put(words[i], 1);
            }
        }

        System.out.println(uniqueWords);
    }
}