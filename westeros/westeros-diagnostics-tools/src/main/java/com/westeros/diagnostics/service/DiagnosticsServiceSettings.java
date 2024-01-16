package com.westeros.diagnostics.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class DiagnosticsServiceSettings {

    @Value("${westeros.service.name}")
    private String serviceName;

    @Value("${westeros.diagnostics.host}")
    private String diagnosticsHost;

}
