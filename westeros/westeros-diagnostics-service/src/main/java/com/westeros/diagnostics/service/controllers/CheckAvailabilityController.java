package com.westeros.diagnostics.service.controllers;

import com.westeros.diagnostics.service.contract.DiagnosticsResultsDto;
import com.westeros.diagnostics.service.core.IRegisterDiagnostics;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("check/services")
@RequiredArgsConstructor
public class CheckAvailabilityController {

    private final IRegisterDiagnostics diagnosticsRegistry;

    @GetMapping
    public ResponseEntity<List<DiagnosticsResultsDto>> checkDiagnostics(){
        return ResponseEntity.ok(diagnosticsRegistry.getServiceDiagnostics());
    }

    @PostMapping
    public ResponseEntity checkDiagnostics(@RequestBody DiagnosticsResultsDto diagnostics){
        diagnosticsRegistry.registerDiagnostics(diagnostics);
        return ResponseEntity.ok().build();
    }

}
