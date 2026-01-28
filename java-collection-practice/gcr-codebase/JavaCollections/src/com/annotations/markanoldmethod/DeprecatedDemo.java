package com.annotations.markanoldmethod;

public class DeprecatedDemo {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature(); // compiler warning
        api.newFeature();
    }
}