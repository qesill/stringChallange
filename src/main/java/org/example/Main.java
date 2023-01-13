package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.println("Podaj swoje imie");
        String name = reader.readLine();
        System.out.println("Twoje imie to: " + name);
        System.out.println("Podaj swoje miejsce zamieszkania");
        String city = reader.readLine();
        String nameAndCity = name + " mieszka w " + city;
        System.out.println(nameAndCity);
        System.out.println("String ma " + nameAndCity.length() + " znaków");

        /*
        Zadanie:
        pobierz dodatkowo miejsce zamieszkania i zaprezentuj informację
        "imie" mieszka w "miasto"
        przypisz ten string do oddzielnej zmiennej
        na koniec zaprezentuj również ile znaków
        ma ten string
         */
    }
}