<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Adding newDorm</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
<div class="container mt-4">
<div class="row">
<form:form method="POST" action="/create/dorm" class="form-control"  modelAttribute="dorm">  
<h1>New Dorm</h1>
<p>
  <form:label path="name">Name</form:label>
        <form:errors class="badge bg-danger" path="name"/>
        <form:input class="form-control" path="name"/>
        </p>
<p>
 
   
  <button type="submit" class="btn btn-primary mt-4">Create Dorm</button>
</form:form>
<a href="/dorms" class="btn btn-primary col-3 mt-4">Go back</a>
</div>
</div>
</body>
</html>