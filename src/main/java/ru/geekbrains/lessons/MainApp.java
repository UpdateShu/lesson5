package ru.geekbrains.lessons;

public class MainApp {
    public static void main(String[] args)
    {
        Person[] persons = new Person[5];
        persons[0] = new Person("Иванов И.И.", "слесарь", "ivanov_ii@mail.ru",
                "7-121212", 80000, 47);
        persons[1] = new Person("Петров А.А.", "инженер-технолог", "petrov_aa@mail.ru",
                "7-123456", 30000, 38);
        persons[2] = new Person("Кузнецов К.И.", "инженер-конструктор", "kuznetsov_ki@mail.ru",
                "7-444555", 35000, 45);
        persons[3] = new Person("Сидорова Е.Н.", "бухгалтер", "sidorova_en@mail.ru",
                "7-363699", 40000, 42);
        persons[4] = new Person("Уткин Р.В.", "нач. отдела", "utkin_rv@mail.ru",
                "7-021021", 50000, 35);
        for (int i = 0; i < persons.length; i++)
        {
            Person person = persons[i];
            if (person.getAge() > 40)
                person.ShowInfo();
            System.out.println();
        }
    }
}
