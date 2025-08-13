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
    <title>Adding new Dojo</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   <div class="container mt-4">
  
   <div class="row">
<form:form method="POST" action="/create" class="form-control"  modelAttribute="dojo">  
<h1>Add a Dojo :</h1>
<p>
  <form:label path="name">Name</form:label>
        <form:errors class="badge bg-danger" path="name"/>
        <form:input class="form-control" path="name"/>
        </p>
        <p>
 
    
  <button type="submit" class="btn btn-primary mt-4">Create</button>
</form:form>
<a href="/new/ninja" class="btn btn-primary col-3 mt-4">Create new ninja</a>
</div>
<hr>
<div class="row">
 <c:if test="${dojos.size()!=0 }">
  <table class="table table-striped table-hover table-bordered">
  <thead>
    <tr>
      
      <th scope="col">Name</th>
      <th scope="col"># Of Ninjas</th>
       <th scope="col">Action</th>
      
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${dojos}" var="dojo">
   

    <tr>
      <th scope="row">${dojo.name}</th>
     
      <td>${dojo.ninjas.size()}</td>
      
       <th scope="row">
       <a href="/dojos/display/${dojo.id }">Display</a>
       
       </th>
    </tr>
   </c:forEach>
  </tbody>
</table>
</c:if>
<c:if test="${dojos.size()==0}">
<div class="alert alert-info" role="alert">
  Hello There is no Dojos  yet !! Add One to get started ^^
</div>
</c:if>
</div>
   </div>
</body>
</html>
