package com.jvm.workshop.controller;

import com.jvm.workshop.domain.Car;
import com.jvm.workshop.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    @Autowired
    CarRepository carRepository;

    @GetMapping
    public Iterable<Car> getCars(){
        return carRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Car> getCarById(@PathVariable("id") Long id){
        return carRepository.findById(id);
    }

    @PostMapping
    public Car addNewCar(@RequestBody Car car){
        return carRepository.save(car);
    }

    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable("id") Long id){
        carRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Car updateCarById(@PathVariable(value = "id")  Long id, @RequestBody Car car){
        Car carFound = carRepository.findById(id).get();

        carFound.setBrand(car.getBrand());
        carFound.setColor(car.getColor());
        carFound.setModel(car.getModel());
        carFound.setYear(car.getYear());
        carFound.setFuel(car.getFuel());

        return carRepository.save(carFound);
    }
}
