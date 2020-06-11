package com.example.searchcar.service.impl;

import com.example.searchcar.model.Car;
import com.example.searchcar.model.enums.SearchCriteria;
import com.example.searchcar.service.SearchCar;

import java.util.List;

public class SearchCarImpl implements SearchCar {
    @Override
    public List<Car> getCars(SearchCriteria searchCriteria, String searchKey) {
        return null;
    }

    private List<Car> readFromText(){
        String filePath = "/home/quit/projects/search-car/src/main/resources/static/carList.txt";
        
        return null;
    }
}
