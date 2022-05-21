package gb006;

public class Animal {

    String type;
    String name;
    int run;
    int swim;
// варианты событий
    public static int swimOk = 1;
    public static int swimFail = 0;
    public static int swimNo = -1;
// подсчет всех животных
    public static int countAnimal = 0;
// характеристики животного + подсчет кол-ва животных
    Animal(String type, String name, int run, int swim) {
        this.type = type;
        this.name = name;
        this.run = run;
        this.swim = swim;
        countAnimal ++;
    }
// тип животного
    String getType() {
        return this.type;
    }
// имя животного
    String getName() {
        return this.name;
    }
// расстояние бега животного
    int getRun() {
        return this.run;
    }
// расстояние плавания животного
    int getSwim() {
        return this.swim;
    }
// тест бега животного
    protected boolean run(int distance) {
        return (distance <= run);
    }
// тест плавания животного
    int swim(int distance) {
        return (distance <= swim) ? swimOk : swimFail;
    }
}

