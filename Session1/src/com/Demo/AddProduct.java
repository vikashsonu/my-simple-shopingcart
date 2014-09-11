package com.Demo;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request ,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String productIds[]=request.getParameterValues("selectedId");
		HttpSession session=request.getSession(true);
		if(null!=session)
		{
			
			Map<String, Integer> productIdSizeMap=null;
			 //this shoudl not be  created every time when you call this servlet 
			
			//so check whether data exist in session on not already is exist then dont create if not create it.
			
			 if(session.getAttribute("cartInfo")==null){
				 productIdSizeMap=new HashMap<String, Integer>();
			 } else {
				 productIdSizeMap=(Map<String, Integer>)session.getAttribute("cartInfo");
			 } //done . i hope u got it. YS //run it. 
			
			if(null!=productIds)
			{
				for(String productId:productIds)
				{
					if(productIdSizeMap.containsKey(productId))
					 {
						int size=productIdSizeMap.get(productId)+1;
						productIdSizeMap.put(productId, size);
						
					}
					else
					{
					productIdSizeMap.put(productId, 1);
						
					}
					session.setAttribute("cartInfo", productIdSizeMap);
				}
				
			}
			else
			{
				
				session.setAttribute("infoMsg", "u didnot select any item");
			}
			RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}


}
