package com.printit.repository;

import com.printit.model.Cities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<Cities, Integer> {
}
