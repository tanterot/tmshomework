package com.hometask;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/black/name")
public class NameInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String token = (String)session.getAttribute("token");

        PrintWriter writer = resp.getWriter();
        writer.println("""
                <html>
                <body>
                hello"""+ " " +token+"""
                <a href = '/white/home'> go home page </a>
                </body>
                </html>
                """);

    }
}
