package com.annotations.repeatableannotation;

import java.lang.reflect.Method;

public class BugReportDemo {
    public static void main(String[] args) throws Exception {
        Method method = BugTracker.class.getDeclaredMethod("process");

        BugReport[] reports =
                method.getAnnotationsByType(BugReport.class);

        for (BugReport br : reports) {
            System.out.println(br.description());
        }
    }
}