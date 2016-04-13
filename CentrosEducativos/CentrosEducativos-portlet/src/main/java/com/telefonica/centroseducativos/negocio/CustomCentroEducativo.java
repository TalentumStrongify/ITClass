package com.telefonica.centroseducativos.negocio;

public class CustomCentroEducativo {
	int idce;
	String nombreCentroEducativo;
	String nombreComunidadAutonoma;
	String nombrePais;
	public int getIdce() {
		return idce;
	}
	public void setIdce(int idce) {
		this.idce = idce;
	}
	public String getNombreCentroEducativo() {
		return nombreCentroEducativo;
	}
	public void setNombreCentroEducativo(String nombreCentroEducativo) {
		this.nombreCentroEducativo = nombreCentroEducativo;
	}
	public String getNombreComunidadAutonoma() {
		return nombreComunidadAutonoma;
	}
	public void setNombreComunidadAutonoma(String nombreComunidadAutonoma) {
		this.nombreComunidadAutonoma = nombreComunidadAutonoma;
	}
	public String getNombrePais() {
		return nombrePais;
	}
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	@Override
	public String toString() {
		return "CustomCentroEducativo [idce=" + idce + ", nombreCentroEducativo=" + nombreCentroEducativo
				+ ", nombreComunidadAutonoma=" + nombreComunidadAutonoma + ", nombrePais=" + nombrePais + "]";
	}
	
	
	
}
