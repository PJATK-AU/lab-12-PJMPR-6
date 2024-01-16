package com.westeros.diagnostics.service.core;

import com.westeros.diagnostics.service.contract.DiagnosticsResultsDto;

import java.util.List;

public interface IRegisterDiagnostics {

    void registerDiagnostics(DiagnosticsResultsDto diagnostics);
    List<DiagnosticsResultsDto> getServiceDiagnostics();
}
