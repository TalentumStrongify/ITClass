<%@page import="com.telefonica.centroseducativos.model.impl.EvaluacionesCEImpl"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri= "http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

Formulario Enviado, gracias!

<% 

EvaluacionesCEImpl pregunta1= (EvaluacionesCEImpl)request.getAttribute("idcategoria"); 
String categoria = "idcategoria";

if(pregunta1!=null){
	categoria=String.valueOf(pregunta1.getIdcategoria());
}

	

%>

<form  method="post">
	<input type="text" name= "categoria" value="<%=categoria %>"/>
</form>