package com.example.servlettutorial;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/addAlien")
public class IdFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("In filter");

        PrintWriter out = response.getWriter();

        HttpServletRequest req = (HttpServletRequest)request;

        int aid = Integer.parseInt(request.getParameter("aid"));
        if(aid > 1)
            chain.doFilter(request, response);
        else
            out.println("Invalid Input ");
    }
}
