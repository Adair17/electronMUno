package mx.marposs.electronm1.bean;

import java.io.Serializable;

import mx.marposs.electronm1.util.Constantes;

public class BeanElectron implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String CampoMedicion = Constantes.CADENA_VACIA;
	
	private String parametroC =Constantes.CADENA_VACIA;
	
	private String cuerpoCable2m = Constantes.CADENA_VACIA;
	
	private String cuerpoCable5m = Constantes.CADENA_VACIA;
	
	private String ojiva = Constantes.CADENA_VACIA;
	
	private String escarpetas = Constantes.CADENA_VACIA;
	
	private String palpadores = Constantes.CADENA_VACIA;
	
	private String brazoPalpadores = Constantes.CADENA_VACIA;
	
	private String tapa = Constantes.CADENA_VACIA;
	
	private String llaveBrazoPalpador = Constantes.CADENA_VACIA;
	
	private String llavePalpador = Constantes.CADENA_VACIA;

	public String getCampoMedicion() {
		return CampoMedicion;
	}

	public void setCampoMedicion(String campoMedicion) {
		CampoMedicion = campoMedicion;
	}

	public String getParametroC() {
		return parametroC;
	}

	public void setParametroC(String parametroC) {
		this.parametroC = parametroC;
	}

	public String getCuerpoCable2m() {
		return cuerpoCable2m;
	}

	public void setCuerpoCable2m(String cuerpoCable2m) {
		this.cuerpoCable2m = cuerpoCable2m;
	}

	public String getCuerpoCable5m() {
		return cuerpoCable5m;
	}

	public void setCuerpoCable5m(String cuerpoCable5m) {
		this.cuerpoCable5m = cuerpoCable5m;
	}

	public String getOjiva() {
		return ojiva;
	}

	public void setOjiva(String ojiva) {
		this.ojiva = ojiva;
	}

	public String getEscarpetas() {
		return escarpetas;
	}

	public void setEscarpetas(String escarpetas) {
		this.escarpetas = escarpetas;
	}

	public String getPalpadores() {
		return palpadores;
	}

	public void setPalpadores(String palpadores) {
		this.palpadores = palpadores;
	}

	public String getBrazoPalpadores() {
		return brazoPalpadores;
	}

	public void setBrazoPalpadores(String brazoPalpadores) {
		this.brazoPalpadores = brazoPalpadores;
	}

	public String getTapa() {
		return tapa;
	}

	public void setTapa(String tapa) {
		this.tapa = tapa;
	}

	public String getLlaveBrazoPalpador() {
		return llaveBrazoPalpador;
	}

	public void setLlaveBrazoPalpador(String llaveBrazoPalpador) {
		this.llaveBrazoPalpador = llaveBrazoPalpador;
	}

	public String getLlavePalpador() {
		return llavePalpador;
	}

	public void setLlavePalpador(String llavePalpador) {
		this.llavePalpador = llavePalpador;
	}

	
}
