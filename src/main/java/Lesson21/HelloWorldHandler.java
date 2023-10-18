package main.java.Lesson21;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

public class HelloWorldHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange){
        try {
            OutputStream responseBody = exchange.getResponseBody(); {


                String text = "Hello, world!";
                byte[] result = text.getBytes();
                exchange.sendResponseHeaders(200, result.length);
                responseBody.write(result);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}