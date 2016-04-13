package com.telefonica.centroseducativos.ranking;

public class RankingResultado {
	public String centroEducativo;
	public String comunidadAutonoma;
	public String pais;
	public double media1; // Metodologia
	public double media2; // Tecnologia
	public double media3; // Formacion
	public long numEvaluaciones;



	public RankingResultado(String centroEducativo, String comunidadAutonoma, String pais, double media1, double media2,
			double media3, long numEvaluaciones2) {
		super();
		this.centroEducativo = centroEducativo;
		this.comunidadAutonoma = comunidadAutonoma;
		this.pais = pais;
		this.media1 = media1;
		this.media2 = media2;
		this.media3 = media3;
		this.numEvaluaciones = numEvaluaciones2;
	}



	public String getCentroEducativo() {
		return centroEducativo;
	}



	public void setCentroEducativo(String centroEducativo) {
		this.centroEducativo = centroEducativo;
	}



	public String getComunidadAutonoma() {
		return comunidadAutonoma;
	}



	public void setComunidadAutonoma(String comunidadAutonoma) {
		this.comunidadAutonoma = comunidadAutonoma;
	}



	public String getPais() {
		return pais;
	}



	public void setPais(String pais) {
		this.pais = pais;
	}



	public double getMedia1() {
		return media1;
	}



	public void setMedia1(double media1) {
		this.media1 = media1;
	}



	public double getMedia2() {
		return media2;
	}



	public void setMedia2(double media2) {
		this.media2 = media2;
	}



	public double getMedia3() {
		return media3;
	}



	public void setMedia3(double media3) {
		this.media3 = media3;
	}



	public long getNumEvaluaciones() {
		return numEvaluaciones;
	}



	public void setNumEvaluaciones(long numEvaluaciones) {
		this.numEvaluaciones = numEvaluaciones;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RankingResultado [centroEducativo=");
		builder.append(centroEducativo);
		builder.append(", comunidadAutonoma=");
		builder.append(comunidadAutonoma);
		builder.append(", pais=");
		builder.append(pais);
		builder.append(", media1=");
		builder.append(media1);
		builder.append(", media2=");
		builder.append(media2);
		builder.append(", media3=");
		builder.append(media3);
		builder.append(", numEvaluaciones=");
		builder.append(numEvaluaciones);
		builder.append("]");
		return builder.toString();
	}
	
	

}
