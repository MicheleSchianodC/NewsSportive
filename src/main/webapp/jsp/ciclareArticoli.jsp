<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html>

<html>


	<head>
		<link rel="stylesheet" href="css/modifiche.css" type="text/css">
		<meta charset="ISO-8859-1">
		<title>News del giorno</title>

	</head>
	
	<body>
	
		<div class="intestazionePagina">
		<div>
		    <img id="img" src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Sky_Sport_24_-_Logo_2020.svg/2560px-Sky_Sport_24_-_Logo_2020.svg.png"/>
		</div>
		<div>
		    <h1  id="titoloPagina"> News Sportive del 05/03/2023</h1>
		</div>
		</div>
		
		
		<div class="superContenitore">
		
		<c:forEach  var="art" items="${requestScope.ArrayLista}" > 
		
			<div class="contenitoreNews">
			<h1 id="titoloParagrafo">
			<c:out value="${art.getTitolo()}"/>
			</h1>
			
			<p>
			<c:out value="${art.getDescrizione()}"/>
			</p>
			
			<img id="imgParagrafo" src="${art.getImmagine()}" >
			
			</div>
			
			
		
		</c:forEach>
		
		</div>

	</body>


</html>