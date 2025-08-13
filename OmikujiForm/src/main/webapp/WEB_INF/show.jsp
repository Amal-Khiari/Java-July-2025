<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>   
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/NewFile.css">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

    <!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="UTF-8">
<title>Show </title>
</head>
<body>
<div class="container">
<div class="card">
  <div class="card-header">
    <h5 class="card-title">Here is Your Omikuji !</h5>
  </div>
  <div class="card-body">
    
    <p class="card-text">In <c:out value="${number }"></c:out> years, you will live in <c:out value="${city }"></c:out> with <c:out value="${namePerson }"></c:out> as your roomate, <c:out value="${profession }"></c:out> for living. The next time you see <c:out value="${livingThing }"></c:out> , you will havegood luck.Also, <c:out value="${somethingNice }"></c:out>.</p>
    
   
  </div>
  <div class="card-footer text-muted center">
    <a href="/omikuji" class="btn btn-primary">Go back</a>
  </div>
</div>
</div>
</body>
</html>