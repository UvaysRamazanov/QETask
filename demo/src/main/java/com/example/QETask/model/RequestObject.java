package com.example.QETask.model;

import com.example.QETask.util.validationOfSwearWords.NoProfanity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestObject {
    @JsonProperty("name")
    @NotNull(message = "Имя не может быть null")
    @Size(min = 1, message = "Имя не может быть пустым")
    @NoProfanity(message = "Имя не может содержать нецензурную лексику")
    private String name;

    @JsonProperty("age")
    @NotNull(message = "Возраст не может быть null")
    @Min(value = 1, message = "Возраст не может быть менее 1")
    @Max(value = 150, message = "Возраст не может быть более 150")
    private int age;
}