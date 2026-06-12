package com.example.MovieDekho.service;

import com.example.MovieDekho.entity.City;
import com.example.MovieDekho.service.intface.CityServiceInterface;

import java.util.List;

public class CityService implements CityServiceInterface {
    @Override
    public City getCityById(Long id) {
        return null;
    }

    @Override
    public List<City> getAllCity() {
        return List.of();
    }

    @Override
    public City getCityByName(String name) {
        return null;
    }

    @Override
    public City addCity(City city) {
        return null;
    }

    @Override
    public List<City> getCityByState(String state) {
        return List.of();
    }
}
