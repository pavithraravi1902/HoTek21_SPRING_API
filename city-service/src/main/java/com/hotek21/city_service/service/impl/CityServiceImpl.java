package com.hotek21.city_service.service.impl;

import com.hotek21.city_service.model.City;
import com.hotek21.city_service.repository.CityRepository;
import com.hotek21.city_service.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public City createCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public Optional<City> getCityById(Long id) {
        return cityRepository.findById(id);
    }

    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public City updateCity(Long id, City updatedCity) {
        return cityRepository.findById(id)
                .map(existing -> {
                    existing.setCode(updatedCity.getCode());
                    existing.setName(updatedCity.getName());
                    existing.setDestinationId(updatedCity.getDestinationId());
                    existing.setStatus(updatedCity.getStatus());
                    return cityRepository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("City not found with ID: " + id));
    }

    @Override
    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }
}
