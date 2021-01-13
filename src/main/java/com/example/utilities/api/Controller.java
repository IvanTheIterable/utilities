package com.example.utilities.api;

import com.example.utilities.model.UtilityData;
import com.example.utilities.service.UtilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController("/")
@RequiredArgsConstructor
public class Controller {
    private final UtilityService utilityService;

    @PostMapping
    public UtilityData post(@Valid @RequestBody UtilityData data) {
        return utilityService.post(data);
    }

    @GetMapping("/{customerId}")
    public List<UtilityData> get(@PathVariable String customerId) {
        return utilityService.get(customerId);
    }
}
