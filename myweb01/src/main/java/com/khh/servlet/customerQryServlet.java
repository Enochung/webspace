package com.khh.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.khh.domain.Customer;

/**
 * Servlet implementation class customerQryServlet
 */
@WebServlet("/customerQryServlet")
public class customerQryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Customer cust = new Customer();
		cust.setId(1);
		cust.setName("Tom");
		cust.setAddress("高雄市");
		cust.setEmail("here@gmail.com");
		cust.setPhone("0912345678");
		RequestDispatcher disp = request.getRequestDispatcher("showCustomer.jsp");
		request.setAttribute("cust", cust);
		disp.forward(request, response);
		
	}

}
