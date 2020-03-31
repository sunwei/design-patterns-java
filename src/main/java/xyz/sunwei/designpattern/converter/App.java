package xyz.sunwei.designpattern.converter;


public class App {
  
  public static void main(String[] args) {
    CarConverter carConverter = new CarConverter();
    
    Car car = new Car("Sun", "X6", "BMW");

    CarName carName = (CarName) carConverter.convert(car, CarName.class.toString());
    System.out.println(carName.getName());

    CarSeries carSeries = (CarSeries) carConverter.convert(car, CarSeries.class.toString());
    System.out.println(carSeries.getSeries());

    CarBrand carBrand = (CarBrand) carConverter.convert(car, CarBrand.class.toString());
    System.out.println(carBrand.getBrand());

  }
}
