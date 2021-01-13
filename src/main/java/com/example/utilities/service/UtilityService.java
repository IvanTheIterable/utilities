package com.example.utilities.service;

import com.example.utilities.model.UtilityData;

import java.util.List;

public interface UtilityService {
    UtilityData post(UtilityData data);
    List<UtilityData> get(String customerId);
}
