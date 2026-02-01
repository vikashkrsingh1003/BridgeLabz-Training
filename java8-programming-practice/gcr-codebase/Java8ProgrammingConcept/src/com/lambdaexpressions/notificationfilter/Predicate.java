package com.lambdaexpressions.notificationfilter;

@FunctionalInterface
interface Predicate<T> {
    boolean test(T t);
}

