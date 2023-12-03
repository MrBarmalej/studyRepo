package Lesson32.FrontController;

public class FrontController {
    private Dispatcher dispatcher;
    public FrontController() {
        dispatcher = new Dispatcher();
    }
    // Метод для обработки запроса
    public void processRequest(String request) {
        // Логика работы с запросом должна быть тут
        logRequest(request);
        dispatcher.dispatch(request);
    }
    private void logRequest(String request) {
        System.out.println("Log: " + request);
    }
}
class Dispatcher {
    private HomeView homeView;
    private StudentView studentView;
    public Dispatcher() {
        homeView = new HomeView();
        studentView = new StudentView();
    }
    public void dispatch(String request) {
        if (request.equalsIgnoreCase("HOME") || request.equalsIgnoreCase("/home")) {
            homeView.show();
        } else if (request.equalsIgnoreCase("STUDENT") || request.equalsIgnoreCase("/student")) {
            studentView.show();
        } else {
            System.out.println("Error: Invalid request");
        }
    }
}
class HomeView {
    public void show() {
        System.out.println("Displaying Home Page");
    }
}
class StudentView {
    public void show() {
        System.out.println("Displaying Student Page");
    }
}

