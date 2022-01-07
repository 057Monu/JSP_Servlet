package com.example.servlettutorial;

import com.example.servlettutorial.dao.LoginDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {

    LoginDao dao = new LoginDao();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("uname");
        String pass = request.getParameter("pass");

        if(dao.checkCredentials(name, pass)){
            HttpSession session = request.getSession();
            session.setAttribute("username", name);
            response.sendRedirect("welcome.jsp");
        }else{
            response.sendRedirect("login.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
