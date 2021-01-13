package com.example.utilities.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;
import java.time.LocalDateTime;

@Data
@Entity
public class UtilityData {
    @Id
    @JsonIgnore
    @GeneratedValue
    private long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;
    @NotEmpty
    private String customerId;
    @PositiveOrZero
    private long gas;
    @PositiveOrZero
    private long coldWater;
    @PositiveOrZero
    private long hotWater;

    public UtilityData() {
        createdAt = LocalDateTime.now();
    }
}
