package com.company;

/**
 * Created by Benjamin R. on 20-07-2016.
 */
public class City {
    private String name;
    private Weather cityWeather;

    public City(String n, Weather c) {
        name = n;
        cityWeather = c;
    }

    public String getName() {
        return name;
    }

    public Weather getWeather() {
        return cityWeather;
    }
}
