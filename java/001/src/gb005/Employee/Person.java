package gb005.Employee;

public class Person {

    public String surname;
    public String name;
    public String secondName;
    public String position;
    public String mail;
    public String phone;
    public int salary;
    public int birthYear;
    public static final int CURRENT_YEAR = 2021;



    public Person(String surname, String name, String secondName, String position, String mail, String phone, int salary, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.birthYear = birthYear;
    }



    public int getAge() {
        return CURRENT_YEAR - birthYear;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPosition() {
        return position;
    }

    public String getMail() {
        return  mail;
    }

    public String getPhone() {
        return phone;
    }

    public String getFullInfo() {
        return this.surname + " | " + this.name + " | " + this.secondName + " | Position: " + this.position + " | @mail: " + this.mail + " | Phone number: " + this.phone + " | Salary is " + this.getSalary() + " RU | " + this.getAge() + " years old | ";
    }
}
