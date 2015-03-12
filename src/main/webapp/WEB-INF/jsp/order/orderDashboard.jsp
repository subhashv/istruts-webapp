<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order Management</title>
</head>
<body>
<html:form action="/order">
<table width="80%" height="80%" align="center" style="border: 1px solid;">
	<tr>
		<td align="center"><h1>Order Management</h1></td>
	</tr>
	<tr>
		<td align="right">Welcome User</td>
	</tr>
	<tr>
		<td>
			<table width="80%" align="center">
				<tr>
					<td colspan="5" style="color: orange;"><b>Search Orders</b></td>
				<tr>
				<tr>
					<td>Order Id</td>
					<td><input type="text" name="orderId"/></td>
					<td>Order Date</td>
					<td><input type="text" name="orderStateDate"/></td>
					<td><input type="text" name="orderEndDate"/></td>
				<tr>
				<tr>
					<td>Order Status</td>
					<td>
						<select name="orderStatus">
							<option>--- Select ---</option>
							<option value="PROCESSING">Processing</option>
							<option value="SHIPPING">Shipping</option>
							<option value="DELEVERED">Delivered</option>
						</select>
					</td>
					<td colspan="3"></td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td>
			<table width="100%" align="center" style="padding-top: 10px;">
				<thead>
					<tr>
						<th>S No</th>
						<th>Order Id</th>
						<th>Customer Name</th>
						<th>Order Date</th>
						<th>Order Status</th>
						<th>Total Amount</th>
					</tr>
				</thead>
				<tbody align="center">
					<logic:iterate id="order" name="orderForm" property="orders" indexId="index">
						<tr
							<logic:equal name="order" property="orderStatus" value="DELIVERED">style="background-color: green;"</logic:equal>
							<logic:equal name="order" property="orderStatus" value="SHIPPING">style="background-color: yellow;"</logic:equal>
							<logic:equal name="order" property="orderStatus" value="PROCESSING">style="background-color: blue;"</logic:equal>
						>
							<td><bean:write name="index"/></td>
							<td><bean:write name="order" property="orderNo"/></td>
							<td><bean:write name="order" property="customerName"/></td>
							<td><bean:write name="order" property="orderDate"/></td>
							<td><bean:write name="order" property="orderStatus"/></td>
							<td><bean:write name="order" property="totalAmount"/></td>
						</tr>
					</logic:iterate>
				</tbody>
			</table>
		</td>
	</tr>
</table>
</html:form>
</body>
</html>