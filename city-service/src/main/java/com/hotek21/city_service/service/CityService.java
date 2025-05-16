package com.hotek21.city_service.service;

import com.hotek21.city_service.model.City;

import java.util.List;
import java.util.Optional;

public interface CityService {
    City createCity(City city);
    Optional<City> getCityById(Long id);
    List<City> getAllCities();
    City updateCity(Long id, City updatedCity);
    void deleteCity(Long id);
}
