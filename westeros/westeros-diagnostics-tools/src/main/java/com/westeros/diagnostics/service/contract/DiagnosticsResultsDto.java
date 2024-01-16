package com.westeros.diagnostics.service.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiagnosticsResultsDto {

    @JsonProperty("service_name")
    private String serviceName;
    private List<Diagnostics> diagnostics = new ArrayList<>();
}
