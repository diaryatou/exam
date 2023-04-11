<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p> creation de cv </p>
<form action="traitement.jsp" method="post">
        lastname : <input type="text" name="nom"><br>
        firtname : <input type="text" name="prenom"><br>
        email : <input type="text" name="email"><br>
        adresse : <input type="text" name="adresse"><br>
        age : <input type="text" name="age"><br>
        specialite : <input type="text" name="specialite"><br>
       niveauEtude : <input type="text" name="niveau"><br>
        ExperienceProfessionelle : <input type="text" name="experience"><br>
        <input type="submit" value="Creer">
    </form>
</body>
</html>