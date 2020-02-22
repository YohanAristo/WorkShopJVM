package com.jvm.workshop.repository;

import com.jvm.workshop.domain.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {

}
