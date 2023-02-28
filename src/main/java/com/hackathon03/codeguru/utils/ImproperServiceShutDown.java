package com.hackathon03.codeguru.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class ImproperServiceShutDown {
    void shutdownNonCompliant(ExecutorService executorService) throws InterruptedException {
        if (executorService != null) {
            // Noncompliant: shutdownNow is called which suddenly shuts down executorService.
            executorService.shutdownNow();
        }
    }

    void shutdownCompliant(ExecutorService executorService) throws InterruptedException {
        if (executorService != null) {
            // Compliant: attempts graceful shutdown before doing so forcefully.
            executorService.shutdown();
            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                throw new IllegalStateException("Timed out while waiting for executing threads to terminate");
            }
            executorService.shutdownNow();
        }
    }
}
