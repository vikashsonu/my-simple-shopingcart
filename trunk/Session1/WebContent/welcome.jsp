
<%@page import="com.Demo.Product" %>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<c:if test="${empty name}">
<c:redirect url="login.jsp"></c:redirect>
</c:if>
</head>
<body>
<c:if test="${not empty infoMsg }"> 
<span style="color : red;">${infoMsg }</span>


</c:if>
<c:choose>
<c:when test="${empty cartInfo.size() }">
<b>Cart is empty</b>
</c:when>
<c:otherwise>
Welcome ${sessionScope.name} your cart HAVE(<a href="ViewCart">${cartInfo.size()})</a>
</c:otherwise>
</c:choose>


</body>

<a href="LogOut">LogOut</a>
 
 <form action="AddProduct" method="post">
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
		<%-- 	<%  ArrayList<Product> productsList=(ArrayList<Product>)session.getAttribute("productList");
      
      for(Product product : productsList){
      
      %> 
			<tr>
				<td><%out.println(product.getId()); %></td>
				<td><%=product.getName() %></td>
				<td><%=product.getQuantity() %></td>
				<td><%=product.getPrice() %></td>
				<td><input type="checkbox"  name="selectedId"  value="<%=product.getId() %>"> </td>
			</tr>

			<%} %>--%>
			
			<c:forEach   var="product" items="${sessionScope.productList}">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.quantity}</td>
				<td>${product.price}</td>
				
				
				 <c:choose>
				 
				  <c:when test="${not empty cartInfo && cartInfo.containsKey(product.id)}">
				<td><input type="checkbox"  name="selectedId" checked="checked"  value="${product.id}"> </td>
				</c:when>
				 <c:otherwise>
				 <td><input type="checkbox"  name="selectedId"  value="${product.id}"> </td>
				 </c:otherwise>
				</c:choose>
				<td><a href="AddProduct"></a></td>
			</tr>
			</c:forEach>
			
			
		</tbody>
			<tr>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th><input  type="submit" value="Add Product"></th>
				</tr>

  
	</table>
</form>



</html>