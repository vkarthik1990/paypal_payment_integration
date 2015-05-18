package com.cloud.controller;

import java.io.IOException;

import com.cloud.bean.LoginBean;
import com.cloud.dao.LoginDAO;
import com.cloud.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {
			String username = request.getParameter("uname");
			String password = request.getParameter("password");
			LoginBean a = new LoginBean();
			a.setUserName(username);
			a.setPassword(password);

			LoginDAO b = new LoginDAO();
			if(b.login(a))
			{
				 HttpSession session = request.getSession(true);
				 session.setAttribute("username", username);
				response.sendRedirect(request.getContextPath()+"/jsp/BookTicket.jsp");
		
			}
			else
			{
				request.setAttribute("errorMessage", "*Invalid username or password");
				request.getRequestDispatcher("/jsp/index.jsp").forward(request, response);
			}

		} catch (Exception e) {
		} finally {
		}
	}
}
