package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature{
    public Fahrenheit(float t){
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float value = (float)((this.getValue() - 32) / 1.8);
        return new Fahrenheit(value);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString(){
        return this.getValue() + " F";
    }
}
