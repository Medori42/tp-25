package com.medori42.carservice.controller;

import com.medori42.carservice.model.Car;
import com.medori42.carservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller for managing cars.
 * 
 * @author Medori42
 */
@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarRepository carRepository;

    @Autowired
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    /**
     * Retrieves all cars.
     * 
     * @return List of cars.
     */
    @GetMapping
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    /**
     * Retrieves a car by ID.
     * 
     * @param id Car ID.
     * @return The car if found.
     */
    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carRepository.findById(id).orElse(null);
    }

    /**
     * Retrieves cars by Client ID.
     * 
     * @param clientId Client ID.
     * @return List of cars belonging to the client.
     */
    @GetMapping("/client/{clientId}")
    public List<Car> getCarsByClientId(@PathVariable Long clientId) {
        return carRepository.findByClientId(clientId);
    }

    /**
     * Creates a new car.
     * 
     * @param car Car object to create.
     * @return The created car.
     */
    @PostMapping
    public Car createCar(@RequestBody Car car) {
        return carRepository.save(car);
    }
}
