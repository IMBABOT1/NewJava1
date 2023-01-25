package ru.imbabot.lesson5;

public class Employee {
    private String FIO;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Employee(String FIO, String position, String email, int phone, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.println("FIO: " + FIO +  '\n'  +
                           "Position: " + position + '\n' +
                            "Email: "   + email + '\n' +
                            "Phone: " + phone +  '\n' +
                            "Salary: " + salary + '\n' +
                            "Age: " + age);
    }
}
