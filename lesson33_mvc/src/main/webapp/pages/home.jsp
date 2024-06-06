<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<form method="post" action="/film/save" class="form-group">
    <input type="text" name="name" class="form-control" placeholder="Name"><br>
    <input type="text" name="description" class="form-control" placeholder="Description"><br>
    <input type="number" name="year" class="form-control" placeholder="Year"><br>
    isViewed<input type="checkbox" name="isViewed" class="form-check" ><br>
    <input type="submit" name="save" class="btn btn-primary"><br>
</form>
<hr>
<%--в задании необходимо было вывести только название фильма ,--%>
<%--но я добавил и описание , что бы красивее смотрелись катрочки--%>
<div class="row">
    <c:forEach items="${films}" var="films">
        <div class="col-sm-4">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">${films.name}</h5>
                    <p class="card-text">${films.description}</p>
                    <a href ="<c:url value='/film/update?id=${films.id}'/>" class="btn btn-primary">Update</a>
                    <a href ="<c:url value='/film/delete?id=${films.id}'/>" class="btn btn-danger">Delete</a>
                </div>
            </div>
        </div>
    </c:forEach>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>



