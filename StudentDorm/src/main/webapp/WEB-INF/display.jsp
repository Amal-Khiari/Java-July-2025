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
    <title>Dorm Detail</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
 <div class="container mt-4">
 <div class="row">
 <a href="/dorms" class="mb-4">Dasboard</a>
 <div class="form-group row mb-4">
 
  <form:label path="students">Students</form:label>
  <form:select class="form-control" path="students">
   <c:forEach items="${students}" var="student">
   <form:form class="form-control" mode="put" action="/student/edit/${dorm.id}"  modelAttribute="student">
   <form:option  value="${student}"> <c:out value="${student.name } (${ student.dorm.name})"></c:out> </form:option>
   
   <input class="btn btn-primary" type="submit" value="Add">
    </form:form>
   </c:forEach>
   
    
  </form:select>
  

  <br>
   </div> 
 </div>
   <div class="row">
 <c:if test="${dorm.students.size()!=0 }">
  <table class="table table-striped table-hover table-bordered">
  <thead>
    <tr>
      
      <th scope="col">Dorm</th>
      <th scope="col">Action</th>
      
      
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${dorm.students}" var="student">
   

    <tr>
      <th scope="row">${student.name}</th>
     
      <td></td>
      
       <th scope="row">
       
       <form:form action="/student/delete/${student.id }" method="Post" modelAttribute="burger">
    <input type="hidden" name="_method" value="delete">
    <input class="btn btn-danger" type="submit" value="Remove">
</form:form>
       
       
       </th>
    </tr>
   </c:forEach>
  </tbody>
</table>
</c:if>
<c:if test="${dorm.students.size()==0}">
<div class="alert alert-info" role="alert">
  Hello There is no Student  yet !! Add One to get started ^^
</div>
</c:if>
</div>
</div>
</body>
</html>