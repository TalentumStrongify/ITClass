<%@ page import="java.util.List"%>
<%@ page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@ page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<portlet:defineObjects />

<portlet:resourceURL var="urlRanking" />

<div class='mydiv'>
	<input type="button" class="btn btn-primary" type="submit"
		value="Descarga ranking en Excel"
		onclick="javascript:JSONToCSVConvertor()" />
</div>

</br>

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

							data = this.get('responseData');

							data = JSON.parse(data);

							new Y.DataTable({

								columnset : columns,
								recordset : data.list,
								sortable : true
							}).render('#miRanking');
						}
					}
				});
			});

	// Codigo JavaScript para crear archivo CSV a partir de nuestro JSON

	function JSONToCSVConvertor(JSONData, ReportTitle, ShowLabel) {

		//Pisamos los undefined de los parametros de entrada de la funcion
		ReportTitle = "Ranking";
		JSONData = data.list;//Es el data del JSON que hemos descargado cuando hemos hecho la tabla 
		ShowLabel = true;

		//Si JSONData no es un objeto: JSON.parse parseará el String JSON en un objeto
		var arrData = typeof JSONData != 'object' ? JSON.parse(JSONData)
				: JSONData;
		var CSV = '';

		//Poner el "ReportTitle" en la primera línea del CSV (o del Excel)
		CSV += ReportTitle + '\r\n\n';

		//Esta lína escribe las cabeceras de las columnas
		CSV += "Centro Educativo " + ';' + "Comunidad Autónoma" + ';' + "País" + ';' + "Media en Aspecto 1" + ';' + "Media en Aspecto 2" + ';' + "Media en TIC" + ';' + "Número de evaluaciones"+ '\r\n';


		//Recorre el array del JSON por filas cogiendo cada elemento por su clave
		for (var i = 0; i < arrData.length; i++) {
			var row = " " + arrData[i]['centroEducativo'] + ';' + '"'
					+ arrData[i]['comunidadAutonoma'] + '";' + '"'
					+ arrData[i]['pais'] + '";' + '"' + arrData[i]['media1']
					+ '";' + '"' + arrData[i]['media2'] + '";' + '"'
					+ arrData[i]['media3'] + '";' + '"'
					+ arrData[i]['numEvaluaciones'] + '";';

			row.slice(0, row.length - 1);

			//Añade un salto de línea después de cada fila
			CSV += row + '\r\n';
		}

		if (CSV == '') {
			alert("Invalid data");
			return;
		}

		//Vamos a generar el nombre del archivo de descarga 
		
		//Queremos incluir la fecha:
			//Objeto fecha:
		var today = new Date();
			//Fecha de hoy:
		var dd = today.getDate();
		var mm = today.getMonth()+1; //January is 0!
		var yyyy = today.getFullYear();
		if(dd<10) {
    		dd='0'+dd
		} 
		if(mm<10) {
    		mm='0'+mm
		} 

		today = yyyy+mm+dd;
		
		//Asigno el nombre con la fecha de hoy
		var fileName = today + "_Descarga";
		//this will remove the blank-spaces from the title and replace it with an underscore
		fileName += ReportTitle.replace(/ /g, "_");

		//Initialize file format you want csv or xls
		var uri = 'data:text/csv;charset=utf-8,' + escape(CSV);

		// Now the little tricky part.
		// you can use either>> window.open(uri);
		// but this will not work in some browsers
		// or you will not get the correct file extension    

		//this trick will generate a temp <a /> tag
		var link = document.createElement("a");
		link.href = uri;

		//set the visibility hidden so it will not effect on your web-layout
		link.style = "visibility:hidden";
		link.download = fileName + ".csv";

		//this part will append the anchor tag and remove it after automatic click
		document.body.appendChild(link);
		link.click();
		document.body.removeChild(link);
	}
</script>

