package com.westeros;

import com.westeros.diagnostics.service.IDiagnosticsServiceClient;
import com.westeros.diagnostics.threads.DiagnosticsThread;
import com.westeros.tools.schedulers.Chron;
import com.westeros.tools.schedulers.Scheduler;
import com.westeros.tools.schedulers.SchedulerThread;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;
import java.time.LocalDateTime;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class DiagnosticsConfiguration {

    private final DiagnosticsThread diagnostics;

    @PostConstruct
    public void runScheduler(){
        diagnostics.startNewThread();

    }
}
