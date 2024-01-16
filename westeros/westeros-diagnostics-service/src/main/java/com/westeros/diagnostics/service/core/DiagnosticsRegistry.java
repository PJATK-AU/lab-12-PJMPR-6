package com.westeros.diagnostics.service.core;

import com.westeros.diagnostics.service.contract.DiagnosticsResultsDto;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DiagnosticsRegistry implements IRegisterDiagnostics{

    private Map<String, DiagnosticsResultsDto> serviceDiagnostics = new HashMap<>();

    @Override
    public void registerDiagnostics(DiagnosticsResultsDto diagnostics) {
        serviceDiagnostics.put(diagnostics.getServiceName(), diagnostics);
    }

    @Override
    public List<DiagnosticsResultsDto> getServiceDiagnostics() {

        return serviceDiagnostics.values().stream().toList();
    }
}
