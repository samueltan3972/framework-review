package com.example.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;

import com.example.model.Fruit;

public interface FruitRepository extends Repository<Fruit, Long> {
	List<Fruit> findAll() throws DataAccessException;
}
