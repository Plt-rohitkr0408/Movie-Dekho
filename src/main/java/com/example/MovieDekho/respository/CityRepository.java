package com.example.MovieDekho.respository;

import com.example.MovieDekho.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City,Long> {
    City findCityByName(String name);
    List<City> findbyState(String state);

}
