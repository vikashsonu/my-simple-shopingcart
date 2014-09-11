package com.Demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RemoveProduct
 */
@WebServlet(description = "will remove the product from selected  list", urlPatterns = { "/RemoveProduct" })
public class RemoveProduct extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RemoveProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session=request.getSession(false);
		//you have to recieve Id here .. Clicked Id that will come from  display.jsp
		String productIdToDeleted=request.getParameter("productId");
		Map<String, Integer> cartInfoMap=(Map<String, Integer>)session.getAttribute("cartInfo");

		cartInfoMap.remove(productIdToDeleted); //item deleted from cart here 


		Set<String> set=cartInfoMap.keySet();
		ArrayList<Product>productList=(ArrayList<Product>)session.getAttribute("productList");
		//? 

		ArrayList<Product> selectedProductDetails=new ArrayList<Product>();
		for(String key:set)
		{

			Iterator<Product> it=productList.iterator();
			while(it.hasNext())
			{
				Product product=(Product)it.next();

				if(product.getId().equals(key))
				{
					selectedProductDetails.add(product);
					break;

				}
			}




		}
		session.setAttribute("selectedProductList", selectedProductDetails);
		response.sendRedirect("Display.jsp");



		//why the hell is this you added ??  why you need this removed product ? 
		//session.setAttribute("removedProductList", removedProductList);
		//response.sendRedirect("Display.jsp");
	}

}
