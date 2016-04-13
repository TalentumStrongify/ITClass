<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<portlet:defineObjects />

<h1>Formulario de Registro</h1>


<!-- 
<portlet:actionURL name="procesarRegistro" var="urlRegistro"/>

<portlet:renderURL portletMode="view" var="urlSubmit">
	<portlet:param name="vista_destino" value="encuesta"/>
</portlet:renderURL>



<aui:form action="<%=urlRegistro%>" method="post">
	<aui:layout>
		<aui:column>
			<aui:input name="colegio" type="text" label="Colegio"/>
		</aui:column>
		<aui:column>
			<aui:input name="nombre" type="text" label="Nombre"/>
		</aui:column>
		<aui:layout>
		<aui:column>
			<aui:button type="submit" value="Enviar"  />
		</aui:column>
		</aui:layout>
		
	</aui:layout>
</aui:form>

 -->












<portlet:actionURL name="procesarRegistro" var="urlRegistro"/>


<aui:form action="<%=urlRegistro%>" method="post" >
	
	<aui:column>
	
	<aui:input name="nombre" type="text" label="Nombre"/>
	<aui:input name="apellido" value="" />
	<aui:input name="email" value="" />
	
	<aui:select name="perfil" >
		<aui:option label="docente" value= "1"/>
		<aui:option label="alumno" value = "2"/>
		<aui:option label="familiar" value ="3"/>
	</aui:select>
	
	</aui:column>
	

	<aui:select name="pais" >
		<aui:option label="España" value= "1"/>
		<aui:option label="Colombia" value = "2"/>
		<aui:option label="Francia" value ="3"/>
		<aui:option label="Sri Lanka" value = "4"/>
	</aui:select>
	
	<aui:select name="comunidadAutonoma" >
		<aui:option label="iybdiyb" value= "1"/>
		<aui:option label="peip" value = "2"/>
		<aui:option label="errrfrf" value ="3"/>
		<aui:option label="Kerala" value = "4"/>
	</aui:select>
 
	<aui:select name="colegio" type="text" label="Colegio">
		<aui:option label="Colegio x" value= "21250"/>
		<aui:option label="Colegio Y" value = "26909"/>
		<aui:option label="Colegio Z" value ="3"/>
		<aui:option label="Colegio A" value = "4"/>
		<aui:option label="Colegio B" value = "4"/>
		<aui:option label="Colegio c" value = "4"/>
	</aui:select>
	
	<aui:select name="cursoAcademico" >
		<aui:option label="iybdiyb" value= "1"/>
		<aui:option label="peip" value = "2"/>
		<aui:option label="errrfrf" value ="3"/>
		<aui:option label="Kerala" value = "4"/>
	</aui:select>
	
	
	
	<aui:button type="submit" value = "Enviar"/>
	
</aui:form>





