package org.example;

import io.javalin.Javalin;

public class WebbyHelloWorld {
    public static void main(String[] args) {
        Javalin server = Javalin.create().start(7000);
        server.get("/hello", ctx -> ctx.result("Hello, world!"));

        // Prevent JVM from exiting
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
