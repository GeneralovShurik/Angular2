package com.step;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/shop"})
public class SecondSelvlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1> Hello dear </h1>\n" +
                "\n" +
                "<form action=\"/bill\" method=\"get\">\n" +
                "    <input type=\"submit\" value=\"submit\">\n" +
                "</form>\n" +
                "\n" +
                "</body>\n" +
                "</html>");
        req.getSession().setAttribute("name",req.getParameter("userName"));
    }
}

