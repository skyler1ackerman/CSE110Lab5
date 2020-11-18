package edu.uscd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        return new Celsius((this.getValue()*9/5)+32);
    }

    public String toString()
    {
        return this.getValue() + " C";
    }
}