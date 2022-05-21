package gb006;

public class HomeWorkApp6 {

    public static void main(String[] args) {
// старт и результат
        String start;
        String result;
// успешное или провальное прохождение дистанции
        String win = "Животное успешно преодолевает дистанцию!";
        String lose = "Животному не удается преодолеть дистанцию!";
// добавление животных
        Cat cat1 = new Cat("Мурка", 200, 0);
        Cat cat2 = new Cat("Косяк", 50, 666);
        Dog dog1 = new Dog("Звонок", 280, 7);
        Dog dog2 = new Dog("Арья", 300, 5);
        Dog dog3 = new Dog("Чара", 500, 10);

        Animal[] animals = {cat1, cat2, dog1, dog2, dog3};
// длина дистанции, которую будут преодолевать животные
        int runDistance = 300;
        int swimDistance = 7;
// запуск цикла проверок по списку
        System.out.println("Испытание животного:");

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getType() + " " + animals[i].getName();
// бег
            start = " обычно пробегает " + animals[i].getRun() + "м. Попытка пробежать на ";
            result = animals[i].run(runDistance) ? win : lose;
            result(nameString, start, runDistance, result);
// плавание
            int swimResult = animals[i].swim(swimDistance);
            start = " обычно проплывает " + animals[i].getSwim() + "м. Попытка проплыть на ";
            result = (swimResult == Animal.swimOk) ? win : lose;
// не умеет плавать
            if (swimResult == Animal.swimNo)
                result = "Животному не удается преодолеть дистанцию, т.к. оно не умеет плавать!";
            result(nameString, start, swimDistance, result);

            System.out.println("**********");
        }
// подсчет животных
        System.out.println("Кошек: " + Cat.countCat);
        System.out.println("Собак: " + Dog.countDog);
        System.out.println("Всего животных: " + Animal.countAnimal);
    }
// результат
    public static void result(String nameAnimal, String test, int distance, String allResult) {
        System.out.println(nameAnimal + test + distance + "м. " + allResult);
    }
}
