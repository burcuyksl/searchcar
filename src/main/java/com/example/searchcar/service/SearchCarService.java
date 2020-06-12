package com.example.searchcar.service;

import com.example.searchcar.model.Car;
import com.example.searchcar.request.GetCarRequest;

import java.util.List;

public interface SearchCarService {
    public List<Car> getCars(GetCarRequest getCarRequest) throws Exception;
}
