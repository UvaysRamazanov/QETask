package com.example.QETask.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseObject {

    @JsonProperty("message")
    private String message;

    @JsonProperty("incomingName")
    private String incomingName;

    @JsonCreator
    public ResponseObject(@JsonProperty("message") String message,
                          @JsonProperty("incomingName") String incomingName) {
        this.message = message;
        this.incomingName = incomingName;
    }
}