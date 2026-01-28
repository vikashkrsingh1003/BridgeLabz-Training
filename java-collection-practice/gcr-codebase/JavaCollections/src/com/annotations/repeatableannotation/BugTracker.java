package com.annotations.repeatableannotation;

public class BugTracker {

    @BugReport(description = "NullPointerException")
    @BugReport(description = "Performance issue")
    void process() {}
}