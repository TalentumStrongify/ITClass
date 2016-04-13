<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<portlet:defineObjects />

<h1>Formulario de Registro</h1>

<portlet:actionURL name="procesarRegistro" var="urlRegistro"/>

<aui:form action="<%=urlRegistro%>" method="post" >
	
	<aui:input name="nombre" type="text" label="Nombre">
		<aui:validator name= "alpha"  errorMessage = "Introduce sólo números"/>
		<aui:validator name= "required"  errorMessage="Introduce un Nombre"/>
	</aui:input>	
	<aui:input name="apellido" label="Apellido"  >
		<aui:validator name= "required"  errorMessage="Introduce un apellido"/>
	</aui:input>
	<aui:input name="email" label="Email"  >
		<aui:validator name="email" errorMessage="Introduce un email correcto"/>
		<aui:validator name= "required"  errorMessage="Introduce un email"/>
	</aui:input>	
	<aui:input name="password" type="password"  label="Contraseña" >
		<aui:validator name= "required"  errorMessage="Introduzca Contraseña"/>
	</aui:input>
	<aui:select name="perfil" label="Perfil" >
		<aui:option label="docente" value= "28730"/>
		<aui:option label="alumno" value = "28729"/>
		<aui:option label="familiar" value ="28731"/>
	</aui:select>
	
	<aui:select name="pais" label = "País">
		<aui:option label="España" value= "1"/>
		<aui:option label="Reino Unido" value = "2"/>
		<aui:option label="Francia" value ="3"/>
		
	</aui:select>
	<aui:select name="comunidadAutonoma" label = "Comunidad Autónoma" >
		<aui:option label="Madrid" value= "0"/>
		<aui:option label="Catalunya" value = "1"/>
		<aui:option label="Euskadi" value ="2"/>
		<aui:option label="Andalucia" value ="3"/>
		<aui:option label="Cantabria" value = "4"/>
		<aui:option label="London" value = "5"/>
		<aui:option label="Ille-de-France" value = "6"/>
	</aui:select>
 
	<aui:select name="colegio" type="text" label="Colegio">
		<aui:option label="Colegio X" value= "21250"/>
		<aui:option label="Colegio Y" value = "26908"/>
		<aui:option label="Colegio Z" value ="26914"/>
		<aui:option label="Colegio A" value = "27753"/>
		<aui:option label="Colegio B" value = "27759"/>
		<aui:option label="Colegio C" value = "27765"/>
	</aui:select>
	
	<aui:select name="cursoAcademico" label ="Curso Académico">
		<aui:option label="Primaria" value= "1"/>
		<aui:option label="Secundaria" value = "2"/>
	</aui:select>
	
	<input class="btn btn-primary" type="submit" value="Continuar">
	<input class="btn btn-primary" type="reset" value="Borrar">
	
</aui:form>