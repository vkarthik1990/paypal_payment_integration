<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"><title>REDTRAIN INC TICKET CHECKOUT</title>
<link rel="StyleSheet" href="	IRCTC%20Next%20Generation%20eTicketing%20System_files/fluid16coltableerrorstabuiStylejquery.css">
<SCRIPT language="javascript">
        function addRow(tableID) {
var idArray=["","name_","age_","gender_","berth_","meal_","IsSenior_","IDproof_"];
            var table = document.getElementById(tableID);
            var rowCount = table.rows.length;
            var row = table.insertRow(rowCount);

            var colCount = table.rows[0].cells.length;
            

            for(var i=0; i<colCount; i++) {

                var newcell = row.insertCell(i);

                newcell.innerHTML = table.rows[1].cells[i].innerHTML;
              // if(i!=0)table.rows[rowCount].cells[i].document.getElementsByTagName("input").id=idArray[i]+rowCount;
               if(i!=0) newcell.childNodes[0].name=idArray[i]+rowCount;
                //alert(newcell.childNodes[0].type);

            }
            table.rows[rowCount].cells[0].innerHTML=rowCount;
            
            if(rowCount==5)
            	{
            	document.getElementById("addRowBtn").disabled = true;
            	}
        }
</SCRIPT>


</head>
<body onload="noBack();" onpageshow="if (event.persisted) noBack();" onunload="">
<%
String Uname=(String)session.getAttribute("username");
String Amount= (String)session.getAttribute("Payment_Amount");
%>
<div class="container_16">
<div class="container">	
	<div class="grid_9"><img src="IRCTC%20Next%20Generation%20eTicketing%20System_files/irctc_logo.gif" style="border-top-left-radius: 15px;margin-left:2px;"></div>
	<div class="grid_7"></div>	
	<div class="clear"></div><div style="float:right">Logged in as: <strong><%=Uname%></strong></div>
	<div class="grid_16">
		<div id="NavContainer">
			<div style="float: right">
				<ul id="topnav">
					<li><a href="<%=request.getContextPath()%>/jsp/BookTicket.jsp">Home</a></li>
					<li><a  href="#">Contact Us</a></li>
					<li><a href="<%=request.getContextPath()%>/LogoutController">Logout</a></li>
				</ul>
			</div>
		</div>
	</div>


<div style="margin-left: 200px;"><div style="width:400px;padding:2px;background-color:#0033FF;color:white;margin-top:100px;margin-left:200px;"><strong>BOOKING DETAILS</strong></div>
<table id="ticketdetails" border="1" cellpadding="5" cellspacing="0" bordercolor="black" style="margin-left:200px;margin-top:5px;  border-style:solid;width:402px;  ">
<tr>
<td bgcolor="#CCCCCC">Passenger Name</td>
    <td bgcolor="#CCCCCC">Age</td>
    <td bgcolor="#CCCCCC">ID PROOF</td>
</tr>
<% for(int i=0; i <= 5; i++) { if(session.getAttribute("name_"+i)!=null&& session.getAttribute("name_"+i)!=""){ %>
    <tr><TD><%=session.getAttribute("name_"+i)%></TD>
    <TD> <%=session.getAttribute("age_"+i)%>  </TD>
    <TD><%=session.getAttribute("IDproof_"+i)%></TD>
    </tr>
        <%} } %>
</table><br><br><div style="width:400px;padding:2px;margin-left:280px;">
Total amount payable (SGD):  <strong><%=Amount%></strong>
	</div> </div>
<br>
<br>
  <center><form action='<%=request.getContextPath()%>/expresscheckout' METHOD='POST' >
<input type='image' name='submit' src='https://www.paypal.com/en_US/i/btn/btn_xpressCheckout.gif' border='0' align='top' alt='Check out with PayPal' />
</form></center>	</div>
	</div>
</body>
</html>