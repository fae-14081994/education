package cucumber.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

//    подготовить данные
    @Before
    public void prepareData() {
        System.out.println("Привет, огурец. Я пишу ПЕРЕД тестом! Можно делать все подготовительные шаги здесь.");
    }

//    очистить данные
    @After
    public void clearData() {
        System.out.println("Пока, огурец. Я пишу ПОСЛЕ теста! Но можно делать, что угодно, например закрывать драйвер.");
    }
}

