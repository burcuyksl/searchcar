package com.example.searchcar.service.impl;

import com.example.searchcar.model.Car;
import com.example.searchcar.request.GetCarRequest;
import com.example.searchcar.service.SearchCarService;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchCarServiceImpl implements SearchCarService {
    @Override
    public List<Car> getCars(GetCarRequest getCarRequest) throws Exception {

        List<Car> cars;
        cars = readFromText();

        switch (getCarRequest.getSearchCriteria()) {
            case MODEL:
                cars = cars.stream()
                        .filter(car -> car.getModel().toLowerCase().contains(getCarRequest.getSearchKey()))
                        .collect(Collectors.toList());
                return cars;
            case SEGMENT:
                cars = cars.stream()
                        .filter(car -> car.getSegment().toLowerCase().contains(getCarRequest.getSearchKey()))
                        .collect(Collectors.toList());
                return cars;
            case BRAND:
                cars = cars.stream()
                        .filter(car -> car.getBrand().toLowerCase().contains(getCarRequest.getSearchKey()))
                        .collect(Collectors.toList());
                return cars;
            case ALL:
                cars = cars.stream()
                        .filter(car -> car.toString().toLowerCase().contains(getCarRequest.getSearchKey()))
                        .collect(Collectors.toList());
                return cars;
            default:
                throw new IllegalStateException("Unexpected value: " + getCarRequest.getSearchCriteria());
        }
    }

    private static ArrayList<Car> readFromText() throws Exception {

        ArrayList<Car> cars = new ArrayList<>();
        String source = "cars";
        try (BufferedReader reader = new BufferedReader(new FileReader(source))){
            String s;
            while( (s = reader.readLine()) != null) {
              /*  String line = reader.readLine();*/
                if (s != ""){
                    String[] objectArray = s.split(";");
                    cars.add(new Car(objectArray[0], objectArray[1], objectArray[2]));
                }

            }
        }

        return cars;
    }
}
