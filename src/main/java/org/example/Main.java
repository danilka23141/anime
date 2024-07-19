package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Birthday birthday = new Birthday(30, 7, 2004);
        Post post = new Post (
                "Даниил",
                "Михалев",
                "Игоревич",
                "+7 (999)-999-99-99",
                "4444 № 44444444",
                true,
                birthday
        );
    }
}