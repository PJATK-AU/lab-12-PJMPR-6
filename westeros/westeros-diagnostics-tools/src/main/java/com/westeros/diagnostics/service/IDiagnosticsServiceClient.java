package com.westeros.diagnostics.service;

import com.westeros.diagnostics.service.contract.DiagnosticsResultsDto;

public interface IDiagnosticsServiceClient {

    void sendDiagnostics(DiagnosticsResultsDto diagnostics);
}
