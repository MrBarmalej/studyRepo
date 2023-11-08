package Lesson26;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class SaveRequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String description = request.getParameter("description");

        if (name == null || name.isEmpty() || email == null || email.isEmpty() || description == null || description.isEmpty()) {
            request.setAttribute("error", "Все поля должны быть заполнены.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("save-request.jsp");
            dispatcher.forward(request, response);
        } else {
            request.setAttribute("successMessage", "Заявка успешно сохранена");
            request.setAttribute("name", name);
            request.setAttribute("email", email);
            request.setAttribute("description", description);
            RequestDispatcher dispatcher = request.getRequestDispatcher("requestSuccessful");
            dispatcher.forward(request, response);
        }
    }
}
