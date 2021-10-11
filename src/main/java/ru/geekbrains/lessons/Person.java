package ru.geekbrains.lessons;

public class Person {
    private String name;
    private String position;
    private String e_mail;
    private String phone;
    private long salary;
    private int age;

    public Person(String name, String position, String e_mail, String phone, long salary, int age)
    {
        this.name = name;
        this.position = position;
        this.e_mail = e_mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void ShowInfo()
    {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("E-mail: " + e_mail);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}
