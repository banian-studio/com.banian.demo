package com.banian.demo.web;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

@WebServlet(name = "MyServlet", urlPattern = { "/my" })
public class MyServlet implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
