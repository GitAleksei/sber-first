package ru.sber;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityUtils {
    private static final String FILE_NAME = "city_ru.csv";
    private static final String SPLIT_SYMBOL = ";";

    public static List<City> parse() {
        List<City> cities = new ArrayList<>();

        File file = new File(FILE_NAME);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String readLine = scanner.nextLine();
                String[] parts = readLine.split(SPLIT_SYMBOL, -1);

                String name = parts[1];
                String region = parts[2];
                String district = parts[3];
                int population = Integer.parseInt(parts[4]);
                String foundation = parts[5];
                City city = new City(name, region, district, population, foundation);

                cities.add(city);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return cities;
    }

    public static int[] maxPopulation(List<City> cities) {
        Integer[] array = cities.stream()
                .map(City::getPopulation)
                .toArray(Integer[]::new);

        Integer max = 0;
        Integer indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                indexMax = i;
                max = array[i];
            }
        }

        return new int[] {indexMax, max};
    }
}
