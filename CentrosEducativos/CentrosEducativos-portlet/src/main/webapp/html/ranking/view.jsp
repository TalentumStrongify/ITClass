<%@ page import="java.util.List"%>
<%@ page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@ page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<portlet:defineObjects />

<portlet:resourceURL var="urlRanking" />

<div id="miRanking"></div>

<script type="text/javascript">

//Tabla aui

	YUI().ready('aui-datatable', 'aui-io-request', 'datable-sort', 'aui-datatype',
			
	function(Y) {
		
		var columns = [{key:'centroEducativo',label:"Centro Educativo"}, {key:'comunidadAutonoma', label: "Comunidad Autonoma"}, {key:'pais', label:"País"}, 
{key:'media1', label: "Nota media de Aspecto 1"}, {key:'media2', label:"Nota media de Aspecto 2"},
{key:'media3', label: "Nota media TIC"}, {key:'numEvaluaciones', label: "Número de evaluaciones"}];

		Y.io.request('<%=urlRanking%>', {
			on : {
				success : function() {
					var data = this.get('responseData');

					data = JSON.parse(data);

					new Y.DataTable({
						
						columnset : columns,
						recordset : data.list,
						sortable: true
					}).render('#miRanking');
				}
			}
		});
	});
</script>