package com.Demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import com.Connection.DatabaseConnection;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		
		String userName1=request.getParameter("userName");
		String password1=request.getParameter("password");
		DatabaseConnection db=new DatabaseConnection();
		Connection con=db.getConnection();
		PreparedStatement ps=null;
		
		try {
			ps=con.prepareStatement("select * from User where USER_NAME=? and USER_PASSWORD=?");
			ps.setString(1, userName1);
			ps.setString(2, password1);
			ResultSet rs=ps.executeQuery();
			System.out.println("in try");
			
			
			    if(rs.next()) {
			
			    		HttpSession session=request.getSession();
			    		session.setAttribute("name", userName1);
			    		
						PreparedStatement ps1=null;
						ps1=con.prepareStatement("select * from PRODUCT");
						ResultSet rs1=ps1.executeQuery();                   			
																					
						ArrayList<Product> productList=new ArrayList<Product>();
						
						while(rs1.next())
						{
							
							Product product=new Product();
							product.setId(rs1.getString("ID"));
							product.setName(rs1.getString("NAME"));
							product.setQuantity(rs1.getInt("QUANTITY"));
							product.setPrice(rs1.getInt("PRICE"));
							
							productList.add(product);
							
							session.setAttribute("productList", productList);
							System.out.println("Next");
							//RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
							//rd.forward(request, response);
							//response.sendRedirect("welcome.jsp");
						}
						
								
							//RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
							//rd.forward(request, response);
						System.out.println(productList.size());
			    	response.sendRedirect("welcome.jsp");
			    	}else {
			    		 HttpSession session=request.getSession();
			    		 session.setAttribute("error", "Password don not match");
			    		response.sendRedirect("login.jsp");
			    	}
			    	
			    
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
