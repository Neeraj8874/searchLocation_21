<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
table, th, td {
  border: 1px solid white;
  border-collapse: collapse;
}
th, td {
  background-color: #96D4D4;
}
</style>
<title>Result here...</title>
</head>
<body>
<h2>Result Here...</h2>
<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>Code</th>
<th>Type</th>
</tr>
<tr>
<td>${location.id}</td>
<td>${location.name}</td>
<td>${location.code}</td>
<td>${location.type}</td>
</tr>
</table>
</body>
</html>