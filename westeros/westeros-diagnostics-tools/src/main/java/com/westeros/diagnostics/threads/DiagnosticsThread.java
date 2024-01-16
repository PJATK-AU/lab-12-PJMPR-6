package com.westeros.diagnostics.threads;

import com.westeros.diagnostics.runners.IRunDiagnoses;
import com.westeros.diagnostics.service.DiagnosticsServiceSettings;
import com.westeros.diagnostics.service.IDiagnosticsServiceClient;
import com.westeros.diagnostics.service.contract.DiagnosticsResultsDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Slf4j
public class DiagnosticsThread implements Runnable{

    private final DiagnosticsServiceSettings settings;
    private final IRunDiagnoses runner;
    private final IDiagnosticsServiceClient client;

    @Override
    public void run() {

        while (true){
            try {
                Thread.sleep(10000);
                client.sendDiagnostics(
                        new DiagnosticsResultsDto(settings.getServiceName(), runner.runAll()));
                log.info("Diagnostics sent successfully.");
            } catch (Exception e) {
                log.error("Problem with diagnostics", e);
            }
        }

    }

    public void startNewThread(){
        new Thread(this).start();
    }
}
