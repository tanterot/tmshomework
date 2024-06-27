<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="mes" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<br><hr>
<a href="/film/home?lang=en">En</a><br>
<a href="/film/home?lang=ru">Ru</a><br>
<br><hr>
<sp:form method="post" action="/film/save" modelAttribute="filmModel" class="form-group">
   <mes:message code="name"/> <sp:input path="name" type="text" class="form-control" placeholder="Name"/> <sp:errors path="name"/> <br>
    <mes:message code="description"/><sp:input path="description" type="text" class="form-control" placeholder="Description"/> <sp:errors
        path="description"/> <br>
    <mes:message code="year"/> <sp:input path="year" type="number" class="form-control" placeholder="Year"/> <sp:errors path="year"/> <br>
    <input type="submit" name="save" class="btn btn-primary"><br>
</sp:form>

<hr>

<div class="row">
    <c:forEach items="${films}" var="films">
        <div class="col-sm-4">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">${films.name}</h5>
                    <p class="card-text">${films.description}</p>
                    <a href="<c:url value='/film/update?id=${films.id}'/>" class="btn btn-primary">Update</a>
                    <a href="<c:url value='/film/delete?id=${films.id}'/>" class="btn btn-danger">Delete</a>
                </div>
            </div>
        </div>
    </c:forEach>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>



