package com.github.hotire.springtest.core;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.junit.runner.Result;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CoreUtils {
    public static void resultReport(Result result) {
        System.out.println("Finished. Result: Failures: " +
                result.getFailureCount() + ". Ignored: " +
                result.getIgnoreCount() + ". Tests run: " +
                result.getRunCount() + ". Time: " +
                result.getRunTime() + "ms.");
    }
}
