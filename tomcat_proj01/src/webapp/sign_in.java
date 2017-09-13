package webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import booleanfile.booleanfile;

@WebServlet(name = "sign_in")
public class sign_in extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //PrintWriter out = response.getWriter();
        //out.println("<html>");
        //out.println("<p>sign in name: " + request.getParameter("name_input") + "</p>");
        //out.println("<p>Password: " + request.getParameter("password") + "</p>");
        Date date = new Date();
        booleanfile bfile = new booleanfile();
        request.setAttribute("username", request.getParameter("name_input"));
        request.setAttribute("password", request.getParameter("password"));

        if (bfile.is_correct_or_wrong(request.getParameter("name_input"), request.getParameter("password"))){
            request.getRequestDispatcher("/welcome.jsp").forward(request, response);
        }
        else{
           request.setAttribute("errormessage", "Invalid sign and paassword. Please try again!!");
            request.setAttribute("date_set", date);
           request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
