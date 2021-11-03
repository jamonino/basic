
package albares.basic.servlet;

import albares.basic.api.User;
import albares.utils.Parameters;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addUser")
public class UserServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        Integer age = Integer.parseInt(request.getParameter("age"));
        
        User newUser = new User(user,pass,age);
        
        Parameters.users.put(Parameters.idUsers.incrementAndGet(),newUser);
    }
}
