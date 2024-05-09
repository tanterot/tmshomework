package com.hometask;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
@WebServlet("/white/home")
public class HomeDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        Date date = new Date();
        writer.println("""
                <html>
                <body>
                <h1>now date</h1><br>
                """ + date + """
                <a href = '/black/name'> go name info </a>
                </body>
                </html>
                """);
        String username = req.getParameter("username");

        if (username!=null&& username.length()>=5 ){
            req.getSession().setAttribute("token",username);
        }

    }
}
