package com.service;

import com.mapper.FilmMapper;
import com.model.Film;
import lombok.*;

import java.sql.*;
import java.util.List;
import java.util.UUID;

public class DataBaseService {
    private final FilmMapper filmMapper = new FilmMapper();
    @SneakyThrows
    public void add(Film film) {

        Connection connection = getConnection();
        var preparedStatement = connection
                .prepareStatement("INSERT INTO films(id, name, description, year, is_viewed) VALUES (?,?,?,?,?)");
        preparedStatement.setObject(1, film.getId());
        preparedStatement.setString(2, film.getName());
        preparedStatement.setString(3, film.getDescription());
        preparedStatement.setInt(4, film.getYear());
        preparedStatement.setBoolean(5, film.getIsViewed());

        preparedStatement.execute();
        connection.close();
    }

    @SneakyThrows
    public List<Film> getAll() {
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from films");
        connection.close();
        return filmMapper.maps(resultSet);


    }

    @SneakyThrows
    public Film getById(UUID id) {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM films WHERE id = ?");
        preparedStatement.setObject(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();

        Film map = filmMapper.map(resultSet,true);
        connection.close();
        return map;
    }


    @SneakyThrows
    public void delete(UUID id) {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM films WHERE id = ?");
        preparedStatement.setObject(1,id);
        preparedStatement.execute();
        connection.close();
    }

    @SneakyThrows
    public void update(Film film, UUID id) {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE films SET name = ?, description = ?,year = ?,is_viewed = ? WHERE id = ?");
        preparedStatement.setString(1, film.getName());
        preparedStatement.setString(2, film.getDescription());
        preparedStatement.setInt(3,film.getYear());
        preparedStatement.setBoolean(4,film.getIsViewed());
        preparedStatement.setObject(5,id);

        preparedStatement.execute();
        connection.close();

    }

    private Connection getConnection() {
        try {
            return DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/library_films?user=postgres&password=postgres");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}