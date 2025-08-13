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
    <title>Dorms Main</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>

   <div class="container mt-4">
   <a href="/dorms/new" class="mt-4">Add new dorm</a> <br>
<a href="/students/new" class="mt-4">Add new student</a>
   <div class="row">
 <c:if test="${dorms.size()!=0 }">
  <table class="table table-striped table-hover table-bordered">
  <thead>
    <tr>
      
      <th scope="col">Dorm</th>
      <th scope="col">Action</th>
      
      
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${dorms}" var="dorm">
   

    <tr>
      <th scope="row">${dorm.name}</th>
     
      <td></td>
      
       <th scope="row">
       <a href="/dorm/display/${dorm.id }">See Student</a>
       
       </th>
    </tr>
   </c:forEach>
  </tbody>
</table>
</c:if>
<c:if test="${dorms.size()==0}">
<div class="alert alert-info" role="alert">
  Hello There is no Dorms  yet !! Add One to get started ^^
</div>
</c:if>
</div>
   </div>
</body>
</html>