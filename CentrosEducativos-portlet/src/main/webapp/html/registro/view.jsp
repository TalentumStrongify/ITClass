<%@page import="com.telefonica.centroseducativos.service.PreguntasEncuestaLocalServiceUtil"%>
<%@page import="com.telefonica.centroseducativos.model.impl.PreguntasEncuestaImpl"%>
<%@page import="com.telefonica.centroseducativos.model.PreguntasEncuesta"%>
<%@ page import= "java.util.ArrayList" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri= "http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import= "com.telefonica.centroseducativos.*" %>

<portlet:defineObjects />
<h1>Encuesta de Opinión</h1>

<portlet:actionURL var="urlRecogerDatosEncuesta" name="recogerDatosEncuesta" />


<aui:form action="<%=urlRecogerDatosEncuesta%>" method="post">
	<c:forEach items="${preguntas}" var="pregunta">
		<legend><div class="control-label">${pregunta.numpregunta +1} .
			${pregunta.enunciadopregunta }:</div></legend>
		<aui:input value="${pregunta.numpregunta}" name="numpregunta${pregunta.numpregunta}"
			type="hidden" />
		<aui:input value="1" name="notapregunta${pregunta.numpregunta}" type="radio"
			label="Muy de acuerdo" />
		<aui:input value="2" name="notapregunta${pregunta.numpregunta}" type="radio"
			label="De acuerdo" />
		<aui:input value="3" name="notapregunta${pregunta.numpregunta}" type="radio"
			label="Ni de acuerdo, ni en desacuerdo" />
		<aui:input value="4" name="notapregunta${pregunta.numpregunta}" type="radio"
			label="En Desacuerdo" />
		<aui:input value="5" name="notapregunta${pregunta.numpregunta}" type="radio"
			label="Muy en desacuerdo" />
	</c:forEach>
	<input class="btn btn-primary" type="submit" value="Continuar">
	<input class="btn btn-primary" type="reset" value="Borrar">
</aui:form>

