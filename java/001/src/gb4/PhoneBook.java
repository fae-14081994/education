package gb4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
//Создание телефонного справочника
    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phonesForLastName = phoneBook.getOrDefault(lastName, new ArrayList<>());
        phonesForLastName.add(phoneNumber);
        phoneBook.put(lastName, phonesForLastName);
    }
//метод поиска get с помощью фамилии
    public ArrayList<String> get(String lastName) {
        return phoneBook.get(lastName);
    }
//добавление записей (фамилий и номеров) в телефонный справочник
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "234234243");
        phoneBook.add("Ivanov1", "12345");
        phoneBook.add("Ivanov2", "25347254");
        phoneBook.add("Ivanov", "8888888");
//Вывести номера по фамилии
        System.out.println(phoneBook.get("Ivanov"));
    }
}