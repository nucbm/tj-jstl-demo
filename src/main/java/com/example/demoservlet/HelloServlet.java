package com.example.demoservlet;

import java.io.*;
import java.util.Arrays;
import java.util.Optional;

import com.example.demoservlet.bean.Person;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        req.setAttribute("name", name);
        Person personA = new Person("Andrei", "I.");
        Person personB = new Person("Radu", "G.");

        req.setAttribute("persons", Arrays.asList(personA, personB));

        req.getRequestDispatcher("/index.jsp").forward(req, resp);

    }

    public void destroy() {
    }
}