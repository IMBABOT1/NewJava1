package ru.imbabot.lesson5;

public class Main {

    public static void main(String[] args) {
//        Employee employee = new Employee("FIO", "position", "mail", 88000000, 123, 21);
//        employee.info();

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("first", "firstposition", "mail1", 880000000, 1235, 15);
        employees[1] = new Employee("second", "secondposition", "mail2", 880000001, 150, 50);
        employees[2] = new Employee("third", "thirdposition", "mail3", 880000002, 11111, 60);
        employees[3] = new Employee("fourth", "fourthposition", "mail4", 880000003, 111121, 30);
        employees[4] = new Employee("five", "fiveposition", "mail5", 880000005, 1111211, 35);

        for (int i = 0; i < employees.length ; i++) {
            if (employees[i].getAge() > 40){
                employees[i].info();
            }
        }

    }
}
