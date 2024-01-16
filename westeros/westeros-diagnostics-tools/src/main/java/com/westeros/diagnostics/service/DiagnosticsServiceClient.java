package com.westeros.diagnostics.service;

import com.westeros.diagnostics.service.contract.DiagnosticsResultsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
@RequiredArgsConstructor
public class DiagnosticsServiceClient implements IDiagnosticsServiceClient{

    private final DiagnosticsServiceSettings settings;
    @Override
    public void sendDiagnostics(DiagnosticsResultsDto diagnostics) {
        new RestTemplate()
                .postForEntity(
                        UriComponentsBuilder.newInstance()
                                .scheme("http")
                                .host(settings.getDiagnosticsHost())
                                .pathSegment("check", "services")
                                .build()
                                .toUriString(),
                        diagnostics,
                        DiagnosticsResultsDto.class
                );
    }
}
