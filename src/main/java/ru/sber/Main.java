package ru.sber;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<City> cities = CityUtils.parse();

        int[] maxPopulation = CityUtils.maxPopulation(cities);
        System.out.println("[" + maxPopulation[0]+ "] = " + maxPopulation[1]);
    }
}

