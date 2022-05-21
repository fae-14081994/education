package gb006;

public class Cat extends Animal {
// подсчет кошек
    public static int countCat = 0;
// Кот(Кошка) и его(ее) характеристики + подсчет кол-ва Котов(Кошек)
    Cat(String name, int run, int swim) {
        super("Кот(Кошка)", name, run, swim);
        countCat ++;
    }
// не умеет плавать
    @Override
    public int swim(int distance) {
        return Animal.swimNo;
    }
}
