package com.reflection.advancedlevel;

public class PerformanceTest {
	void heavyTask() {
		for (int i = 0; i < 1_000_000; i++);
	}
}