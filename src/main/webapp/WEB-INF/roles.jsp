<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Roles</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body>

	<form method="post">
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Id
				Utilisateur</label> <input type="number" name="idUser" required="required"
				class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp">
		</div>




 <div class="mb-3 form-check">
 <label class="form-check-label" for="exampleCheck1">Check me out</label>
    <input type="checkbox" class="form-check-input" id="exampleCheck1" name="role">
    
  </div>





		

		<button type="submit" class="btn btn-primary">Submit</button>
		<button type="reset" class="btn btn-danger">Annuler</button>
	</form>



</body>
</html>