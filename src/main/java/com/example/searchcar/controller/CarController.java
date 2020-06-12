package com.example.searchcar.controller;

import com.example.searchcar.model.Car;
import com.example.searchcar.request.GetCarRequest;
import com.example.searchcar.service.impl.SearchCarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarController {

    private SearchCarServiceImpl searchCarService;

    @Autowired
    public CarController(SearchCarServiceImpl searchCarService){
        this.searchCarService = searchCarService;
    }
    //produces = MediaType.APPLICATION_XML_VALUE

    @GetMapping("/getcars")
    public ResponseEntity<?> getCars(@RequestBody GetCarRequest request) throws Exception {

        List<Car> cars;
        cars = searchCarService.getCars(request);

        return new ResponseEntity(cars, HttpStatus.ACCEPTED);
    }

}
