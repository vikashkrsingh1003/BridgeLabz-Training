package com.day01.browserbuddy;

 public class Main {
    public static void main(String[] args) {

        BrowserBuddy browser = new BrowserBuddy();

        browser.getCurrentTab().visit("google.com");
        browser.getCurrentTab().visit("youtube.com");
        browser.getCurrentTab().visit("github.com");

        browser.getCurrentTab().back();
        browser.getCurrentTab().forward();

        browser.closeTab();
        browser.restoreTab();
    }
}
