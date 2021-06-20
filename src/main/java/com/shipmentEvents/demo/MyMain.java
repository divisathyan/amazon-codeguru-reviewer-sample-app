package com.shipmentEvents.demo;

import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;
import software.amazon.codeguruprofilerjavaagent.Profiler;

public class MyMain {
    public static void main(String[] args) {
        EnvironmentVariableCredentialsProvider authProvider = new EnvironmentVariableCredentialsProvider();
        new Profiler.Builder()
            .profilingGroupName("divya-sample-app")
            .withHeapSummary(true) // optional - to start without heap profiling set to false or remove line
            .build().start();
    }
}
