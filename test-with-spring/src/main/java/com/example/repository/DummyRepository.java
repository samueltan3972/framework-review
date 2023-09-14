package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Dummy;

public interface DummyRepository extends JpaRepository<Dummy, Long>{

}
