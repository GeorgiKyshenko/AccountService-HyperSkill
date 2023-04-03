package com.example.demo.models.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SignUpResponse {

    String name;
    @JsonProperty("lastname")
    String lastName;
    String email;
}
