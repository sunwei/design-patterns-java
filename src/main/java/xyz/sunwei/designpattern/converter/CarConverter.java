package xyz.sunwei.designpattern.converter;


import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class CarConverter extends DomainEntityConverter<Car> {

  public CarConverter() {
    super(getConverters());
  }
  
  private static List<Pair<String, Function<Car, Object>>> getConverters(){
    List<Pair<String, Function<Car, Object>>> converters = new ArrayList<>();
    converters.add(new Pair<String, Function<Car, Object>>(
            CarName.class.toString(), CarConverter::convertToCarName));
    converters.add(new Pair<String, Function<Car, Object>>(
            CarSeries.class.toString(), CarConverter::convertToCarSeries));
    converters.add(new Pair<String, Function<Car, Object>>(
            CarBrand.class.toString(), CarConverter::convertToCarBrand));
    return converters;
  }

  private static CarName convertToCarName(Car car) {
    return new CarName(car.getName());
  }

  private static CarSeries convertToCarSeries(Car car) {
    return new CarSeries(car.getSeries());
  }

  private static CarBrand convertToCarBrand(Car car) {
    return new CarBrand(car.getBrand());
  }

}
