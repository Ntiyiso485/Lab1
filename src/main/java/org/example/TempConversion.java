package org.example;

public class TempConversion {
    void CelsiustoFahrenheit(){
        double celsius = 25;
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Celsius: " + celsius + " °C");
        System.out.println("Fahrenheit: " + fahrenheit + " °F");

        // Convert Fahrenheit back to Celsius
        double newCelsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Converted back to Celsius: " + newCelsius + " °C");
    }
}
