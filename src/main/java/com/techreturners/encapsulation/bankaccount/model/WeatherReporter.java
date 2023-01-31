package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;

    private final String EMOJI_SUN_BEHIND_RAINCLOUD="🌦";
    private final String EMOJI_SUN_RISE="🌅";
    private final String EMOJI_SUN_BEHIND_SMALL_CLOUD="🌤";
    private final String EMOJI_HIGH_BRIGHTNESS="🔆";
    private final String EMOJI_HOT_FACE="🥵";
    private final String EMOJI_COLD_FACE="🥶";
    private final String EMOJI_SMILING_FACE="😊";
    private final int HOT_TEMPERATURE=30;
    private final int COLD_TEMPERATURE=10;


    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String print() {

        double newTemp = (9.0 / 5.0) * temperature + 32;
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, check1(), check2(), newTemp);

    }

    public String check1() {
        if (location.equals("London")) {

            return EMOJI_SUN_BEHIND_RAINCLOUD;

        } else if (location.equals("California")) {

            return EMOJI_SUN_RISE;

        } else if (location.equals("Cape Town")) {

            return EMOJI_SUN_BEHIND_SMALL_CLOUD;

        }
        return EMOJI_HIGH_BRIGHTNESS;
    }

    public String check2() {
        if (temperature > HOT_TEMPERATURE) {

            return String.format("It's too hot %s!", EMOJI_HOT_FACE);

        } else if (temperature < COLD_TEMPERATURE) {

            return String.format("It's too cold %s!", EMOJI_COLD_FACE);

        }
        return String.format("Ahhh...it's just right %s", EMOJI_SMILING_FACE);
    }

}
