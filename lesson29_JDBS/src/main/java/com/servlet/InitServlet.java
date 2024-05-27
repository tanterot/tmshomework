package com.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(urlPatterns = "/init",loadOnStartup = 1)
public class InitServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE if not exists films (\n" +
                    "    id uuid primary key ,\n" +
                    "    name VARCHAR,\n" +
                    "    description VARCHAR,\n" +
                    "    year INT,\n" +
                    "    is_viewed BOOLEAN\n" +
                    ");");
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    private Connection getConnection(){
        try {
            return DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/library_films?user=postgres&password=postgres");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
