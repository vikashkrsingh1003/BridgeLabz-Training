package com.day04.eventease;

public interface ISchedulable {
    void schedule();
    void reschedule(String newDate);
    void cancel();
}
