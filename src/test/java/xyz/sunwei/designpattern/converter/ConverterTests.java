package xyz.sunwei.designpattern.converter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConverterTests {

    private CarConverter carConverter;
    private Car car;
    
    @BeforeEach
    void initService(){
        carConverter = new CarConverter();
        car = new Car("Sun", "X6", "BMW");
    }

    @Test void given_converter_when_converted_by_class_then_get_converted_objects() throws DomainEntityConverterNotFoundException {
        
        CarName carName = (CarName) carConverter.convert(car, CarName.class.toString());
        CarSeries carSeries = (CarSeries) carConverter.convert(car, CarSeries.class.toString());
        CarBrand carBrand = (CarBrand) carConverter.convert(car, CarBrand.class.toString());
        
        assertEquals("Sun", carName.getName());
        assertEquals("X6", carSeries.getSeries());
        assertEquals("BMW", carBrand.getBrand());
    }

    @Test void given_converter_when_converted_by_not_exist_class_then_get_notfound_exception() {

        assertThrows(DomainEntityConverterNotFoundException.class, () -> {
            carConverter.convert(car, "notFoundClass");
        });
    }
}
