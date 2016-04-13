<%@page import="com.telefonica.centroseducativos.model.impl.EvaluacionesCEImpl"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>


<portlet:defineObjects />

Formulario Enviado, gracias!
<script>
function direccion(){
	location.href='http://localhost:8080/web/guest/home?p_p_id=58&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&saveLastPath=false&_58_struts_action=%2Flogin%2Flogin'
}
</script>
<div >
<input type="button" class="btn btn-primary" type="submit" value="Continuar" onclick="direccion()"/>
</div>