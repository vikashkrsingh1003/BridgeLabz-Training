package com.day07.icecreamrush;

class Flavor {
    String name;
    int sales;

    Flavor(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }

    void display() {
        System.out.println(name + " - " + sales);
    }
}

