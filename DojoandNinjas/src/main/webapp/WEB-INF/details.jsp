<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

    <!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Dojo Details</title>
</head>
<body>
<div class="container">
<div class="card">
  <div class="card-header">
  <h5 class="card-title"> <c:out value="${dojo.name}"></c:out></h5>
   
  </div>
  <div class="card-body">
  <c:if test="${dojo.ninjas.size()!=0 }">
  <h1>List of ninjas</h1>
  <table class="table table-striped table-hover table-bordered">
  <thead>
    <tr>
      
      <th scope="col">First name</th>
      <th scope="col">Last Name</th>
       <th scope="col">Age</th>
      
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${dojo.ninjas}" var="ninja">
   

    <tr>
      <th scope="row">${ninja.firstName}</th>
     
      <td>${ninja.lastName}</td>
      <td>${ninja.age}</td>
       
    </tr>
   </c:forEach>
  </tbody>
</table>
</c:if>
<c:if test="${dojo.ninjas.size()==0}">
<div class="alert alert-info" role="alert">
  Hello There is no ninjas yet yet !! Hit "Bo back button and add ninjas" ^^
</div>
</c:if>    
    
    <a href="/" class="btn btn-primary">Go Back</a>
  </div>
  
</div>
</div>
</body>
</html>