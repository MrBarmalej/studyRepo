package compiled.Lesson21;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String path = exchange.getRequestURI().getPath();
        try (OutputStream responce = exchange.getResponseBody()) {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            byte[] result;
            switch (path) {
                case "/minsk":
                    TimeZone minskTimeZone = TimeZone.getTimeZone("Europe/Minsk");
                    dateFormat.setTimeZone(minskTimeZone);
                    String currentTimeInMinsk = dateFormat.format(date);
                    result = currentTimeInMinsk.getBytes();
                    exchange.sendResponseHeaders(200, result.length);
                    responce.write(result);
                    break;
                case "/washington":
                    TimeZone washTimeZone = TimeZone.getTimeZone("America/New_York");
                    dateFormat.setTimeZone(washTimeZone);
                    String currentTimeInWashington = dateFormat.format(date);
                    result = currentTimeInWashington.getBytes();
                    exchange.sendResponseHeaders(200, result.length);
                    responce.write(result);
                    break;
                case "/beijing":
                    TimeZone chinaTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
                    dateFormat.setTimeZone(chinaTimeZone);
                    String currentTimeInChina = dateFormat.format(date);
                    result = currentTimeInChina.getBytes();
                    exchange.sendResponseHeaders(200, result.length);
                    responce.write(result);
                    break;
                default:
                    String def = "Something went wrong. Try again";
                    result = def.getBytes();
                    exchange.sendResponseHeaders(200, result.length);
                    responce.write(result);
                    break;



            }
        }


    }
}
