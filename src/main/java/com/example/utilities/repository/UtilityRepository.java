package com.example.utilities.repository;

import com.example.utilities.model.UtilityData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UtilityRepository extends JpaRepository<UtilityData, Long> {
    List<UtilityData> findAllByCustomerId(String customerId);
}
