package gb005;

import gb005.Employee.Person;

public class HomeWorkApp5 {

    public static void main(String[] args) {

        Person mainEmployee = new Person("Иванов-0", "Иван-0", "Иванович-0", "Engineer-0", "ivan0@mailbox.com", "8(111)222-33-40", 50000, 1970);

        Person[] job = {
                mainEmployee,
                new Person("Иванов-0", "Иван-0", "Иванович-1", "Engineer-1", "ivan1@mailbox.com", "8(111)222-33-41", 40000, 1994),
                new Person("Иванов-0", "Иван-0", "Иванович-2", "Engineer-2", "ivan2@mailbox.com", "8(111)222-33-42", 70000, 1990),
                new Person("Иванов-0", "Иван-0", "Иванович-3", "Engineer-3", "ivan3@mailbox.com", "8(111)222-33-43", 60000, 1941),
                new Person("Иванов-0", "Иван-0", "Иванович-4", "Engineer-4", "ivan4@mailbox.com", "8(111)222-33-44", 30000, 1989),
                new Person("Иванов-0", "Иван-0", "Иванович-5", "Engineer-5", "ivan5@mailbox.com", "8(111)222-33-45", 15000, 1977),
        };

        getAllPersonsJob(job);

        System.out.println("**********");

        System.out.println("Age 40+ :");

        getOldPerson(job,40);

        System.out.println("**********");

    }

    public static void getOldPerson(Person[] job, int year) {
        for (int i = 0; i < job.length; i++)
            if (job[i].getAge() > year) {
                System.out.println(job[i].getFullInfo());
            }
    }

    public static void getAllPersonsJob(Person[] job) {
        System.out.println("All person: ");
        for (int i = 0; i < job.length; i++)
            System.out.println((i + 1) + ") " + job[i].getFullInfo());
    }
}
