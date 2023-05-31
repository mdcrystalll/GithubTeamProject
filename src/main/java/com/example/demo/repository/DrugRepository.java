package com.example.demo.repository;

import com.example.demo.model.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DrugRepository extends JpaRepository <Drug,Long> {
}
