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
    <title>Adding new Ninja</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
<div class="container mt-4">
<div class="row">
<form:form method="POST" action="/create/ninja" class="form-control"  modelAttribute="ninja">  
<h1>Add a Dojo :</h1>
<p>
  <form:label path="firstName">First Name</form:label>
        <form:errors class="badge bg-danger" path="firstName"/>
        <form:input class="form-control" path="firstName"/>
        </p>
<p>
  <form:label path="lastName">Last Name</form:label>
        <form:errors class="badge bg-danger" path="lastName"/>
        <form:input class="form-control" path="lastName"/>
        </p>
 <p>
  <form:label path="age">Age</form:label>
        <form:errors class="badge bg-danger" path="age"/>
        <form:input type="number" class="form-control" path="age"/>
        </p>
   <div class="form-group row">
  <form:label path="dojo">Dojo</form:label>
  <form:select class="form-control" path="dojo">
   <c:forEach items="${dojos}" var="dojo">
   <form:option value="${dojo }"> <c:out value="${dojo.name }"></c:out> </form:option>
   </c:forEach>
  </form:select>
   </div> 
  <button type="submit" class="btn btn-primary mt-4">Create Ninja</button>
</form:form>
<a href="/" class="btn btn-primary col-3 mt-4">Go back</a>
</div>
</div>
</body>
</html>