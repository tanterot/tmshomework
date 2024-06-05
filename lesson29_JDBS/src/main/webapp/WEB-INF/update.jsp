<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <form method="post" action="/update" class="form-group">
        <input name="id" type="hidden" value="${film.id}">
        Name <input name="name" type="text" class="form-control" value="${film.name}"><br>
        Description<input name="description" type="text" class="form-control" value="${film.description}"><br>
        Year<input name="year" type="number" class="form-control" value="${film.year}"><br>
        <c:if test="${film.isViewed == true}">
            Viewed <input type="checkbox" checked name="viewed">
        </c:if>
        <input type="submit" value="update" class="btn btn-primary">
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>