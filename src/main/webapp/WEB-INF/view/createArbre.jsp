<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css"
href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript"
src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Ajouter Arbre</title>
</head>
<body class="bg-light">

<div class="container">
<jsp:include page="nav.jsp" />
<hr>
<div class="card-body">
<form action="saveArbre" method="post">
 <div class="form-group">
 <label class="control-label">Nom Arbre :</label>
 <input type="text" name="nomArbre" class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Prix Arbre :</label>
 <input type="text" name="prixArbre" class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">date création :</label>
 <input type="date" name="date" class="form-control"/>
 </div>

 <div>
 <button type="submit" class="btn btn-primary">Ajouter</button>
</div>
</form>
</div>
<div class="alert alert-success" role="alert"> ${msg}</div>
<br/>
<br/>
<a href="ListeArbres" class="btn btn-outline-primary" >Liste Arbres</a>
</div>
</body>
</html>