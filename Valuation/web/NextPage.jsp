<%-- 
    Document   : NextPage
    Created on : Mar 29, 2017, 8:39:36 AM
    Author     : Karthi
--%>

<%@page import="com.jlmd.simpleneuralnetwork.example.Main2"%>
<%@page import="com.jlmd.simpleneuralnetwork.neuralnetwork.callback.INeuralNetworkCallback"%>
<jsp:useBean id="property" class="com.jlmd.simpleneuralnetwork.example.Main2" scope="session"/> 
<HTML>
<BODY>
You entered<BR>
Area: <%= property.getArea() %><BR>
Land size: <%= property.getLsize() %><BR>
Land value: <%= property.getLvalue() %><BR>
Living space: <%= property.getHsize() %><BR>
Stories: <%= property.getStories() %><BR>
Bedrooms: <%= property.getBed() %><BR>
Bathrooms: <%= property.getBath() %><BR>
Built year: <%= property.getYear() %><BR>
Renovated within 10 years: <%= property.getReno() %><BR>
Highway within 1km: <%= property.getHighway() %><BR>
Main road within 1km: <%= property.getMainrd() %><BR>
Hospital within 1km: <%= property.getHos() %><BR>
College within 1km: <%= property.getCol() %><BR>
Supermarket within 1km: <%= property.getSupermarket() %><BR>
School within 1km: <%= property.getScl() %><BR>
Bus station within 1km: <%= property.getBus() %><BR>
Water & Electricity available: <%= property.getWne() %><BR>
Garden: <%= property.getGar() %><BR>
No of cash crops: <%= property.getCashcr() %><BR>
Home security system: <%= property.getSec() %><BR>
Garage: <%= property.getGarage() %><BR>
Air-conditioner: <%= property.getAc() %><BR>
Fully tiled: <%= property.getTiled() %><BR>
Famous city-points within 5km:  <%= property.getCitypoint() %><BR>
Frontal feature: <%= property.getFrontal() %><BR>
Bedroom feature: <%= property.getBedroom() %><BR>
Bathroom feature: <%= property.getBathroom() %><BR>
Kitchen feature: <%= property.getKitchen() %><BR>

The Estimated Price: 
<%
Main2 a = new Main2();
a.estValue();
out.println(a.estValue());
%>
<BR>

<% session.setAttribute("INFO",null);%>

</BODY>
</HTML>