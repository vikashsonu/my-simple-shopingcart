<%@page import="com.Demo.ViewCart"%>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
    function goBack()
     {
    	history.back()
     }
</script>

</head>
<body>

</body>
<form action="ViewCart" method="post">
<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Quantity</th>
				<th>Price</th>
				
				</tr>
		</thead>
		<tbody>
	<c:forEach   var="product" items="${sessionScope.selectedProductList}">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.quantity}</td>
				<td>${product.price}</td>
			<td>	<a href="RemoveProduct?productId=${product.id}">Remove</a>  </td>
				
			</tr>
			</c:forEach>
			<tr>
			<td></td>
			<td></td>
			<td></td>
			
			<td><a href="welcome.jsp">Back</a></td>


			
			</tbody>
			</table>
			
			
</form>
<form>
<table>
<tr>
 <td><input type="button"  value="Back" onclick="goBack()"></td>
 </tr>
 </table>
 </form>
</html>