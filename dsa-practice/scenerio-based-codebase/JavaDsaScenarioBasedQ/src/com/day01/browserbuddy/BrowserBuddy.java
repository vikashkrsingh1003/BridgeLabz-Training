package com.day01.browserbuddy;

import java.util.Stack;

public class BrowserBuddy {

    private BrowserTab currentTab;
    private Stack<BrowserTab> closedTabs;

    public BrowserBuddy() {
        currentTab = new BrowserTab();
        closedTabs = new Stack<>();
    }

    // Open a new tab
    public void newTab() {
        currentTab = new BrowserTab();
        System.out.println("New tab opened");
    }

    // Close current tab
    public void closeTab() {
        closedTabs.push(currentTab);
        currentTab = new BrowserTab();
        System.out.println("Tab closed");
    }

    // Restore last closed tab
    public void restoreTab() {
        if (!closedTabs.isEmpty()) {
            currentTab = closedTabs.pop();
            System.out.println("Restored tab, current page: " +
                    currentTab.getCurrentPage());
        } else {
            System.out.println("No closed tabs to restore");
        }
    }

    public BrowserTab getCurrentTab() {
        return currentTab;
    }
}
