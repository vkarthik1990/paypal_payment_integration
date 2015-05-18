package com.cloud.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cloud.bean.FormBean;
import com.cloud.dao.FormDAO;

/**
 * Servlet implementation class LibraryController
 */
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public FormController() {
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

		int No_of_tkts=0;
		HttpSession session = request.getSession(true);
		String IsSenior="NO";
		try {
			for(int i=0;i<=5;i++){
			
				if(request.getParameter("name_"+i)!="" && request.getParameter("name_"+i)!=null && request.getParameter("name_"+i).length() !=0 )
				{
					No_of_tkts++;
					session.setAttribute("name_"+i, request.getParameter("name_"+i));
					session.setAttribute("age_"+i, request.getParameter("age_"+i));
					session.setAttribute("IDproof_"+i, request.getParameter("IDproof_"+i));
				
					String name= request.getParameter("name_"+i);
					String age = request.getParameter("age_"+i);
					String gender = request.getParameter("gender_"+i);
					String berth = request.getParameter("berth_"+i);
					String meal = request.getParameter("meal_"+i);
					if(request.getParameter("IsSenior_"+i)!=null){
						IsSenior = request.getParameter("IsSenior_"+i);
					}
					String IDproof = request.getParameter("IDproof_"+i);
				
					FormBean gt = new FormBean();
					gt.setName(name);
					gt.setAge(age);
					gt.setGender(gender);
					gt.setBerth(berth);
					gt.setMeal(meal);
					gt.setIsSenior(IsSenior);
					gt.setIDproof(IDproof);
					FormDAO obj = new FormDAO();

					FormBean obj1 = obj.FormDetails(gt);
				}
			
			}
				session.setAttribute("No_of_tkts",No_of_tkts);
				session.setAttribute("Payment_Amount", String.valueOf(No_of_tkts*100));
				No_of_tkts=0;
				getServletContext().getRequestDispatcher("/jsp/Checkout.jsp")
						.forward(request, response);
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

	}
}
