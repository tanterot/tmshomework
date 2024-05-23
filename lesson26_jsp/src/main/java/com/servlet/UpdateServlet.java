package com.servlet;

import com.model.Film;
import com.service.FilmService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.UUID;
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
    FilmService service = new FilmService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UUID id = UUID.fromString(req.getParameter("id"));
        Film film = service.getById(id);

        req.setAttribute("film",film);
        req.getRequestDispatcher("/WEB-INF/update.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UUID id = UUID.fromString(req.getParameter("id"));
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        int year = Integer.parseInt(req.getParameter("year"));
        String viewed = req.getParameter("isViewed");
        boolean isViewed = viewed != null && !viewed.isBlank();

        Film film = new Film(name,description,year,isViewed);
        service.update(film,id);

        resp.sendRedirect("/home");


    }
}
