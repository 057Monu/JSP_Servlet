package com.example.servlettutorial;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/addAlien")
public class NameFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest req = (HttpServletRequest) request;
        PrintWriter out = response.getWriter();

        String name = request.getParameter("aname");
        if(name.length() > 4)
            chain.doFilter(request, response);
        else
            out.println("Name contains more letter");
    }
}
