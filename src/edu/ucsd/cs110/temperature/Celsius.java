package edu.ucsd.cs110.temperature;
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
        float newValue = (float) (this.getValue() * 1.8 + 32);
        return new Fahrenheit(newValue);
    }

    public String toString()
    {
        return this.getValue() + " C";
    }
}