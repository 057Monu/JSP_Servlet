package com.example.servlettutorial;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet  extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {


        int aid = Integer.parseInt(req.getParameter("aid"));
        String name = req.getParameter("aname");

//        System.out.println("Result is " + k);
        PrintWriter out = res.getWriter();

        out.println("Name is " + name);

//        Request Dispatcher and Redirect

//        HttpSession session = req.getSession();
//        session.setAttribute("k", k);

//        Cookie cookie = new Cookie("k", k + "");
//        res.addCookie(cookie);
//
//        res.sendRedirect("sq");

//        req.setAttribute("j", k);
//        RequestDispatcher rd = req.getRequestDispatcher("sq");
//        rd.forward(req, res);

    }
}
