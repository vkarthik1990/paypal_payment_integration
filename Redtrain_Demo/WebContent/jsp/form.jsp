<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"><title>REDTRAIN INC TICKET BOOKING FORM</title>
<link rel="StyleSheet" href="	IRCTC%20Next%20Generation%20eTicketing%20System_files/fluid16coltableerrorstabuiStylejquery.css">
<script type="text/javascript">
window.history.forward(1);
function noBack(){
window.history.forward();
}
</script>
	
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
<script>
function validateForm() {
	var name;
	var age;
	var Idproof;
    for(var i=0;i<=3;i++)
    	{	
    	name = document.forms["FormController"]["name_"+i].value;
    	age=document.forms["FormController"]["age_"+i].value;
    	Idproof=document.forms["FormController"]["IDproof_"+i].value;
        if ((name != null || name != "")||((age != null || name != ""))||((Idproof != null || Idproof != ""))) {
        	 if ((name == null || name == "")||((age == null || name == ""))||((Idproof == null || Idproof == ""))) {
            	alert("Please complete the form and submit");
                return false;	
            }
        	
        }
    	} return true;
	
}
</script>	

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
	</div>
    <div style="width:1010px;padding:2px;background-color:#0033FF;color:white;margin-top:100px;margin-left:200px;"><strong>PASSENGER DETAILS</strong></div>
      <form name="FormController"  method="post" id="FormId" action="<%=request.getContextPath()%>/FormController">    
    
    <table id="tabledata" style="margin-top:5px;margin-left:200px;" border="1" bordercolor="#000000">
    <tr>
    <td><strong>S. No.</strong></td>
    <td ><strong>Name</strong></td>
    <td ><strong>Age</strong></td>
    <td ><strong>Gender  </strong></td>
    <td ><strong>Berth Preference</strong></td>
    <td ><strong>Meal  </strong></td>
    <td ><strong>Senior Citizen </strong></td>
    <td ><strong>Identity proof </strong></td>
    
    </tr>
    <tr>
      <td>1</td>
    <td ><input name="name_0" type="text" required placeholder="Name of Passenger" pattern="[a-zA-Z ]*$" /></td>
    <td ><input name="age_0" type="text" required placeholder="Enter Digits only" pattern = "[0-9]*$"/></td>
    <td ><select name="gender_0" required><option  value="M">Male</option><option value="F">Female</option></select></td>
    <td ><select  name="berth_0" required><option value="NO PREFERENCE">NO PREFERENCE</option><option value="WINDOW">WINDOW</option></select></td>
    <td ><select name="meal_0"><option  value="V">VEG</option><option value="N">NON VEG</option> </select> </td>
    <td ><input name="IsSenior_0" type="checkbox" value="YES"/> </td>
    <td ><input name="IDproof_0" type="text" required placeholder="ID Proof of Passenger" pattern="[a-zA-Z0-9 ]*$"/></td>
    
    </tr>
    <tr>
        <td>2</td>
       <td ><input name="name_1" type="text" placeholder="Name of Passenger" pattern="[a-zA-Z ]*$"/></td>
    <td ><input name="age_1" type="text" placeholder="Enter Digits only" pattern = "[0-9]*$"/></strong></td>
    <td ><select name="gender_1" ><option  value="M">Male</option><option value="F">Female</option></select></td>
    <td ><select  name="berth_1"><option value="NO PREFERENCE">NO PREFERENCE</option><option value="WINDOW">WINDOW</option></select></td>
    <td ><select name="meal_1"><option  value="V">VEG</option><option value="N">NON VEG</option> </select> </td>
    <td ><input name="IsSenior_1" type="checkbox" value="YES"/></td>
    <td ><input name="IDproof_1" type="text"  placeholder="ID Proof of Passenger" pattern="[a-zA-Z0-9 ]*$"/></td>
    <tr>
        <td>3</td>
       <td ><strong><input name="name_2" type="text" placeholder="Name of Passenger" pattern="[a-zA-Z ]*$"/></strong></td>
    <td ><strong><input name="age_2" type="text" placeholder="Enter Digits only" pattern = "[0-9]*$"/></strong></td>
    <td ><strong><select name="gender_2" ><option  value="M">Male</option><option value="F">Female</option></select> </strong></td>
    <td ><strong><select  name="berth_2"><option value="NO PREFERENCE">NO PREFERENCE</option><option value="WINDOW">WINDOW</option></select></strong></td>
    <td ><strong><select name="meal_2"><option  value="V">VEG</option><option value="N">NON VEG</option> </select> </strong></td>
    <td ><strong><input name="IsSenior_2" type="checkbox" value="YES"/> </strong></td>
    <td ><strong><input name="IDproof_2" type="text"  placeholder="ID Proof of Passenger" pattern="[a-zA-Z0-9 ]*$"/></strong></td></tr>
    <tr>
        <td>4</td>
       <td ><strong><input name="name_3" type="text" placeholder="Name of Passenger" pattern="[a-zA-Z ]*$"/></strong></td>
    <td ><strong><input name="age_3" type="text" placeholder="Enter Digits only" pattern = "[0-9]*$"/></strong></td>
    <td ><strong><select name="gender_3" ><option  value="M">Male</option><option value="F">Female</option></select> </strong></td>
    <td ><strong><select  name="berth_3"><option value="NO PREFERENCE">NO PREFERENCE</option><option value="WINDOW">WINDOW</option></select></strong></td>
    <td ><strong><select name="meal_3"><option  value="V">VEG</option><option value="N">NON VEG</option> </select> </strong></td>
    <td ><strong><input name="IsSenior_3" type="checkbox" value="YES"/> </strong></td>
    <td ><strong><input name="IDproof_3" type="text"  placeholder="ID Proof of Passenger" pattern="[a-zA-Z0-9 ]*$"/></strong></td></tr>

    
    
    
    </table>
	<div style="margin-top:15px;margin-left:600px;"><input  type="button" value="Add New Row" id="addRowBtn" onclick="addRow('tabledata')"><input  type="submit" value="submit" ></div>
   </form>
    <br/>
    <br/>
    <br/><br/>

	<div class="irfooter">
	  <div class="irfooterborder"></div>	
	</div>
  </div>
	<div class="clear"></div>
</div>




</body>
</html>