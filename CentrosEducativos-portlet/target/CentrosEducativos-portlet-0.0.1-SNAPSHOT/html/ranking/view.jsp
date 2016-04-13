<%@ page import="java.util.List"%>
<%@ page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@ page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<portlet:defineObjects />

<portlet:resourceURL var="urlRanking" />

<div id="miRanking"></div>

<script type="text/javascript">

//Tabla aui

	YUI().ready('aui-datatable', 'aui-io-request', 
			
	function(Y) {
		
		var columns = ['centroEducativo', 'comunidadAutonoma', 'pais', 'media1', 'media2', 'media3', 'numEvaluaciones'];

		Y.io.request('<%=urlRanking%>', {
			on : {
				success : function() {
					var data = this.get('responseData');

					data = JSON.parse(data);

					new Y.DataTable.Base({
						columnset : columns,
						recordset : data.list
					}).render('#miRanking');
				}
			}
		});
	});
</script>