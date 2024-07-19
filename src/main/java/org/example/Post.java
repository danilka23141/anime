package org.example;

public class Post {
    public String name;
    public String surname;
    public String patronymic;
    public String phone;
    public String passport;
    public boolean subscription;
    public Birthday birthday;

    // Конструктор для удобства создания объектов
    public Post(String name, String surname, String patronymic, String phone, String passport, boolean subscription, Birthday birthday) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.phone = phone;
        this.passport = passport;
        this.subscription = subscription;
        this.birthday = birthday;
    }
}

