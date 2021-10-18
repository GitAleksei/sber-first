package ru.sber;

public class City {
    private final String name;
    private final String region;
    private final String district;
    private final int population;
    private final String foundation;

    public String getName() {
        return name;
    }

    public String getNameLowerCase() {
        return name.toLowerCase();
    }

    public String getDistrict() {
        return district;
    }

    public int getPopulation() {
        return population;
    }

    public City(String name, String region, String district, int population, String foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation=" + foundation +
                '}';
    }
}