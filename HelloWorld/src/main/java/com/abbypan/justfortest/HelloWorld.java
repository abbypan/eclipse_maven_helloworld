package com.abbypan.justfortest;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        String name = args[1];
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello(name));
    }
}
