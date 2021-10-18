package ru.sber;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<City> cities = CityUtils.parse();

        System.out.println("Сортировка списка городов по наименованию в алфавитном порядке по" +
                " убыванию без учета регистра: ");
        cities.stream()
                .sorted(Comparator.comparing(City::getNameLowerCase).reversed())
                .forEach(System.out::println);

        System.out.println("\nСортировка списка городов по федеральному округу и наименованию" +
                " города внутри каждого федерального округа в алфавитном порядке по убыванию" +
                " с учетом регистра: ");
        cities.stream()
                .sorted(Comparator.comparing(City::getDistrict)
                        .thenComparing(City::getName).reversed())
                .forEach(System.out::println);
    }
}

