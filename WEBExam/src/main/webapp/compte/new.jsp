<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nouveau Compte</title>
<style type="text/css">
<%@include file="/css/style.css"%>
</style>
</head>
<body>
<div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->
    <h2 id="con" class="inactive underlineHover"  ><a href="connexion"> Se connecter</a> </h2>
    <h2 id="cre" class=" active" onclick="create()">Créer un compte </h2>

    <!-- Icon -->
   

    <!-- Login Form -->
   
    
     <div id="create">
     <form action="connexion" method="post" >
     
       <input type="text" id="email" class="fadeIn second" name="email" placeholder="email">
      <input type="password" id="pass" class="fadeIn third" name="pass" placeholder="password">
      <input type="password" id="cpass" class="fadeIn third" name="cpass" placeholder="confirm password">
       <br>
      
       <input type="checkbox" id="showPassword" onclick="check()" >
        <label for="showPassword">Show password</label>
         <br>
      <button type="submit" class="fadeIn fourth">S'Inscrire</button>
    </form>
    </div>
   

   
   
  </div>
</div>
<script type="text/javascript">
function check(){
	     var ch =document.getElementById('showPassword');
	    if ( ch.checked ) {
	       document.getElementById('pass').type = "text";
	       document.getElementById('cpass').type = "text";
	    } else {
	       document.getElementById('pass').type = "password";
	       document.getElementById('cpass').type = "password";
	    }
	}

    
</script>
<a href="cv">Create</a>

</body>
</html>