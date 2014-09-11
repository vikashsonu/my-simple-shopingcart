package com.Demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ViewCart
 */
@WebServlet("/ViewCart")
public class ViewCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	//	response.sendRedirect("welcome.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session=request.getSession(false);
        Map<String, Integer>	productIdSizeMap=(Map<String,Integer>)session.getAttribute("cartInfo");
		
        //only on line has been added i.e. cart.remove(id);
        
		Set<String> set=productIdSizeMap.keySet();
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
		
			System.out.println(productIdSizeMap.size());	
			
				
		}
		session.setAttribute("selectedProductList", selectedProductDetails);
		response.sendRedirect("Display.jsp");
	}
	
}
