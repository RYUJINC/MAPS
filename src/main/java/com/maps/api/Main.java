package com.maps.api;

import com.maps.api.console.Display;
import com.maps.api.console.Display.*;

public class Main {
    public static void main(String[] args) {
        Display display = new Display("truc", 50, 50, ".");
        System.out.println(display.getName());
        display.printScreen();
        display.addPoint(4, 5, 'p');
        System.out.println("\n");
        display.printScreen();
        display.addLine(2, 3, 10, 40, 'v');
        System.out.println("\n");
        display.printScreen();
    }
}
