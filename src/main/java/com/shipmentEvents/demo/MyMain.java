package com.shipmentEvents.demo;

import software.amazon.codeguruprofilerjavaagent.Profiler;

public class MyMain {
    public static void main(String[] args) {
        Profiler.builder()
            .profilingGroupName("MyProfilingGroup")
            .build()
            .start();
    }
}
