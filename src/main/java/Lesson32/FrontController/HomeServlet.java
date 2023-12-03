package Lesson32.FrontController;

import Lesson32.FrontController.FrontController;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        FrontController frontController = new FrontController();
        frontController.processRequest("/home");
        response.getWriter().println("Welcome to the home page");
    }
}
