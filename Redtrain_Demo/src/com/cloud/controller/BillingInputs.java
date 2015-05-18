package com.cloud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BillingInputs
 */
public class BillingInputs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillingInputs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {/*
		// TODO Auto-generated method stub

		
		 ==================================================================
		 PayPal Express Checkout - MARK FLOW : START SNIPPET
		 ===================================================================
		
		//IMPORTANT NOTE: Please import Class paypalfunctions if not in the same package level.
		// import paypalfunctions;
	     HttpSession session = request.getSession(true);
	     String PaymentOption="PayPal";
		String paymentType = "Sale";
		paypalfunctions ppf = new paypalfunctions();
		String paymentAmount = (String)session.getAttribute("Payment_Amount");
		if (PaymentOption == "PayPal")
		{
			
			'------------------------------------
			' The paymentAmount is the total value of 
			' the shopping cart, that was set 
			' earlier in a session variable 
			' by the shopping cart page
			'------------------------------------
			

			

			
			'------------------------------------
			' The currencyCodeType and paymentType 
			' are set to the selections made on the Integration Assistant 
			'------------------------------------
			

			String currencyCodeType = "SGD";
			
			
			'------------------------------------
			' The returnURL is the location where buyers return to when a
			' payment has been succesfully authorized.
			'
			' This is set to the value entered on the Integration Assistant 
			'------------------------------------
			

			String returnURL = " http://redtrain_demo.mybluemix.net/jsp/orderconfirm.jsp";

			
			'------------------------------------
			' The cancelURL is the location buyers are sent to when they hit the
			' cancel button during authorization of payment during the PayPal flow
			'
			' This is set to the value entered on the Integration Assistant 
			'------------------------------------
			
			String cancelURL = "http://redtrain_demo.mybluemix.net/jsp/transactionfailure.jsp";

			
			'------------------------------------
			' When you integrate this code 
			' set the variables below with 
			' shipping address details 
			' entered by the user on the 
			' Shipping page.
			'------------------------------------
			

			String shipToName 			= "<<ShiptoName>>";
			String shipToStreet 		= "<<ShipToStreet>>";
			String shipToStreet2 		= "<<ShipToStreet2>>"; //'Leave it blank if there is no value
			String shipToCity 			= "<<ShipToCity>>";
			String shipToState 			= "<<ShipToState>>";
			String shipToCountryCode 	= "<<ShipToCountryCode>>"; //' Please refer to the PayPal country codes in the API documentation
			String shipToZip 			= "<<ShipToZip>>";
			String phoneNum 			= "<<PhoneNumber>>";

			
			'------------------------------------
			' Calls the SetExpressCheckout API call
			'
			' The CallMarkExpressCheckout function is defined in the file PayPalFunctions.asp,
			' it is included at the top of this file.
			'-------------------------------------------------
			
			
			java.util.HashMap nvp =  ppf.CallMarkExpressCheckout (paymentAmount, returnURL, cancelURL, shipToName, shipToStreet, shipToStreet2, shipToCity, shipToState, shipToCountryCode, shipToZip, phoneNum );
											
			String strAck = nvp.get("ACK").toString();
			if(strAck !=null && !(strAck.equalsIgnoreCase("Success") || strAck.equalsIgnoreCase("SuccessWithWarning")))
			{
				session.setAttribute("token", nvp.get("TOKEN").toString());
				//' Redirect to paypal.com
				ReDirectURL( nvp.get("TOKEN").toString());
			}
			else
			{  
				// Display a user friendly Error on the page using any of the following error information returned by PayPal
				
				String ErrorCode = nvp.get("L_ERRORCODE0").toString();
				String ErrorShortMsg = nvp.get("L_SHORTMESSAGE0").toString();
				String ErrorLongMsg = nvp.get("L_LONGMESSAGE0").toString();
				String ErrorSeverityCode = nvp.get("L_SEVERITYCODE0").toString();
			}
		}
		else
		{
			
		}
		
		 ==================================================================
		 PayPal Express Checkout - MARK FLOW : END SNIPPET
		 ===================================================================
		

	*/}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
