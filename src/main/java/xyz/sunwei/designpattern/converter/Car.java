package xyz.sunwei.designpattern.converter;


public class Car {
  private final String name;
  private final String series;
  private final String brand;
  
  public Car(String name, String series, String brand) {
    this.name = name;
    this.series = series;
    this.brand = brand;
  }

  public String getName() {
    return name;
  }

  public String getSeries() {
    return series;
  }

  public String getBrand() {
    return brand;
  }

}
