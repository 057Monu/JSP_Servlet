package com.example.servlettutorial;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SquareServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();

//        out.println("Hello World");

//        HttpSession session = req.getSession();
//        int k = (int)session.getAttribute("k");
//        int k = (int) req.getAttribute("j");
        int k = 0;
        Cookie cookies[] = req.getCookies();

        for(Cookie c : cookies){
            if(c.getName().equals("k"))
                k = Integer.parseInt(c.getValue());
        }
//
        out.println("The value of k: " + k);

    }
}
