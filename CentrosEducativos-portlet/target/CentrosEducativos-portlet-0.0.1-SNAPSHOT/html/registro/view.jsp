<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri= "http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />
<% System.out.println("he llegado"); %>
Esta es la <b>Encuesta</b> de registro.

<portlet:actionURL var="urlRecoger" name="recogerDatosEncuesta" />

<!-- TO DO: iteracion de preguntas, con un for y un while hasnext, 
una clase/objeto con las preguntas como atributos de tipo string de la clase/objeto-->

<aui:form action="<%=urlRecoger%>" method="post" name="name" id= "formulario">
		<div class="control-label" label= "t1" value="1">Categoria 1: 
		<aui:input value="1" name="categoria" type="hidden" label="Categoria"/>
			<div class="controls"  value="1"><b>Pregunta 1:</b>
			<aui:input value="1" name="numpregunta" type="hidden" label="Numero Pregunta"/>	
				<aui:input value="1" name="p11"  type="radio" label="Muy de acuerdo"  />
				<aui:input value="2" name="p11"  type="radio" label="De acuerdo"/>
				<aui:input value="3" name="p11"  type="radio" label="Ni de acuerdo, ni en desacuerdo"/>
				<aui:input  value="4" name="p11"  type="radio" label="En Desacuerdo"/>
				<aui:input value="5" name="p11" type="radio" label="Muy en desacuerdo"/>	
				
			 </div> 	
			 </div>
				<div class="control-label" label= "t2" value="2">Categoria 2: 
				<aui:input value="2" name="categoria" type="hidden" label="Categoria"/>
			<div class="controls"><b>Pregunta 11:</b>
			<aui:input value="11" name="numpregunta" type="hidden" label="Numero Pregunta"/>
				<aui:input value="1" name="p21" type="radio" label="Muy de acuerdo"/>
				<aui:input value="2" name="p21" type="radio" label="De acuerdo"/>
				<aui:input value="3" name="p21" type="radio" label="Ni de acuerdo, ni en desacuerdo"/>
				<aui:input value="4" name="p21" type="radio" label="En Desacuerdo"/>
				<aui:input value="5" name="p21" type="radio" label="Muy en desacuerdo"/>
		 </div> 
		 </div>
				<div class="control-label" label= "t3" value="3">Categoria 3:
				<aui:input value="3" name="categoria" type="hidden" label="Categoria"/>
			<div class="controls"><b>Pregunta 21:</b>  
			<aui:input value="21" name="numpregunta" type="hidden" label="Numero Pregunta"/>
				<aui:input value="1" name="p31" type="radio" label="Muy de acuerdo"/>
				<aui:input value="2" name="p31" type="radio" label="De acuerdo"/>
				<aui:input value="3" name="p31" type="radio" label="Ni de acuerdo, ni en desacuerdo"/>
				<aui:input value="4" name="p31" type="radio" label="En Desacuerdo"/>
				<aui:input value="5" name="p31" type="radio" label="Muy en desacuerdo"/>			
	 </div> 
 </div>
			<input class="btn btn-primary" type="submit" value="Submit"> 
			<input class="btn btn-primary" type="reset" value="Reset">
	
</aui:form>


