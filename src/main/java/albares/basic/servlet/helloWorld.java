
package albares.basic.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/world")
public class helloWorld extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.getOutputStream().println("<!DOCTYPE html>");
        response.getOutputStream().println("<html>");
        response.getOutputStream().println("<head>");
        response.getOutputStream().println("<title>Servlet holaMundo</title>");            
        response.getOutputStream().println("</head>");
        response.getOutputStream().println("<body>");
        response.getOutputStream().println("<h1>Servlet holaMundo at " + request.getContextPath() + "</h1>");
        response.getOutputStream().println("</body>");
        response.getOutputStream().println("</html>");
    }
}
