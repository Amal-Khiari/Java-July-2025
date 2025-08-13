<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/NewFile.css">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

    <!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="UTF-8">
<title>Main Form</title>
</head>
<body>
<div class="container" >
<div class="col-4"></div>
<div class="col-4 mt-4" >

<h1 style="text-align:center">Send an Omikuji</h1>

<form action="/show" method="POST" style="border:1px solid grey;border-radius:10px">
<h4> Pick any number from 5 to 25</h4>
<input  type="number" class="form-input myStyle" name="number">
<h4 > Enter the name of any city</h4>
<input type="text" class="form-input myStyle" name="city">
<h4> Enter the name of any real person</h4>
<input type="text" class="form-input myStyle" name="namePerson">
<h4> Enter profession endeavor or hobby</h4>
<input type="text" class="form-input myStyle" name="profession">
<h4> Enter a type of any living thing</h4>
<input type="text" class="form-input myStyle" name="livingThing">
<h4> Say something nice to anyone</h4>
<div class="form-floating">
  <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea" name="somethingNice" style="height: 100px"></textarea>
  <label for="floatingTextarea">something Nice ^^</label>
</div>
<h5>Send and show a friend</h5>
<button type="submit" class="btn btn-outline-primary float-end" data-bs-toggle="button" autocomplete="off">Send</button>
</form>
</div>
<div class="col-4"></div>
</div>
</body>
</html>