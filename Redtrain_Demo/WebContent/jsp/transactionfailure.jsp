<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TRANSACTION FAILED</title>
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
					<li><a href="BookTicket.jsp">Home</a></li>
					<li><a  href="#">Contact Us</a></li>
					<li><a href="<%=request.getContextPath()%>/LogoutController">Logout</a></li>
				</ul>
			</div>
		</div>
	</div><br><br><br><br><br><center>
<span style="font-style: italic; color: red;">
Sorry Transaction Failed !!!</span></center>	</div>
	</div>
</body>
</html>