package com.example.searchcar.service;

import com.example.searchcar.model.Car;
import com.example.searchcar.model.enums.SearchCriteria;

import java.util.List;

public interface SearchCar {
    public List<Car> getCars(SearchCriteria searchCriteria, String searchKey);
}
