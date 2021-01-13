package com.example.utilities.service;

import com.example.utilities.model.UtilityData;
import com.example.utilities.repository.UtilityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UtilityServiceImpl implements UtilityService {
    private final UtilityRepository repository;

    @Override
    public UtilityData post(UtilityData data) {
        return repository.save(data);
    }

    @Override
    public List<UtilityData> get(String customerId) {
        return repository.findAllByCustomerId(customerId);
    }
}
