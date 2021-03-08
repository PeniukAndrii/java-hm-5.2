package com.example.java6.dao;

import com.example.java6.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

@Service
@EnableJpaRepositories
public interface CarDAO extends JpaRepository<Car, Integer> {
}
