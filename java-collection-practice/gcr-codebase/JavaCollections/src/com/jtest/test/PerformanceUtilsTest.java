package com.jtest.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.jtest.main.PerformanceUtils;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class PerformanceUtilsTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Test will fail if method takes more than 2 seconds
    public void testLongRunningTaskTimeout() {
        PerformanceUtils.longRunningTask(); // This will fail because it sleeps 3 seconds
    }

    @Test
    public void testLongRunningTaskNormal() {
        String result = PerformanceUtils.longRunningTask();
        assertEquals("Task Completed", result);
    }
}

