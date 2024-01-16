package com.westeros.diagnostics.service.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Diagnostics {
    @JsonProperty("is_success")
    private boolean isSuccess;
    private String name;
    @JsonProperty("error_message")
    private String errorMessage;
    private String description;
}
