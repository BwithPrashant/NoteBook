<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
	
<div class="container">
	<div class="page-header well text-center text-primary">
  	 	<h1><strong>NoteBook</strong></h1>
	</div>
  <button type="button" class="btn btn-primary">Login here</button>

  <form class="form-horizontal well" id="userForm" action="loginUser" method="post">
    <div class="form-group" >
      <label class="control-label col-sm-2" for="email">Email:</label>
      <div class="col-sm-6">
        <input type="email" name = "email" class="form-control" id="email" placeholder="Enter email" name="email">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Password:</label>
      <div class="col-sm-6">          
        <input type="password" name = "password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <div class="checkbox">
          <label><input type="checkbox" name="remember"> Remember me</label>
        </div>
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" id = "fire" class="btn btn-default" onclick="submit()">Submit</button>
      	<button type="button" class="btn btn-link btn-warning">
      	<a href="registration">New User</a></button>
      </div>
    </div>
  </form>
</div>

</body>
</html>