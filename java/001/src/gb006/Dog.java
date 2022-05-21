package gb006;

public class Dog extends Animal {
// подсчет собак
    public static int countDog = 0;
// Собака и ее характеристики + подсчет кол-ва собак
    Dog(String name, int run, int swim) {
        super("Собака", name, run, swim);
        countDog ++;
    }
}
