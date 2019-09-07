package mx.marposs.electronm1.bean;

import java.io.Serializable;

import mx.marposs.electronm1.util.Constantes;

public class BeanResult implements Serializable{

	  /** The Constant serialVersionUID. */
	  private static final long serialVersionUID = 1L;
	  
	  /** The ejecucion correcta. */
	  private boolean ejecucionCorrecta = true;
	  
	  /** The mensaje. */
	  private String mensaje = Constantes.CADENA_VACIA;
	  
	  /** The codigo. */
	  private String codigo = Constantes.CADENA_VACIA;

	  /**
	   * Checks if is ejecucion correcta.
	   *
	   * @return true, if is ejecucion correcta
	   */
	  public boolean isEjecucionCorrecta() {
	    return ejecucionCorrecta;
	  }

	  /**
	   * Sets the ejecucion correcta.
	   *
	   * @param ejecucionCorrecta the new ejecucion correcta
	   */
	  public void setEjecucionCorrecta(boolean ejecucionCorrecta) {
	    this.ejecucionCorrecta = ejecucionCorrecta;
	  }

	  /**
	   * Gets the mensaje.
	   *
	   * @return the mensaje
	   */
	  public String getMensaje() {
	    return mensaje;
	  }

	  /**
	   * Sets the mensaje.
	   *
	   * @param mensaje the new mensaje
	   */
	  public void setMensaje(String mensaje) {
	    this.mensaje = mensaje;
	  }

	  /**
	   * Gets the codigo.
	   *
	   * @return the codigo
	   */
	  public String getCodigo() {
	    return codigo;
	  }

	  /**
	   * Sets the codigo.
	   *
	   * @param codigo the new codigo
	   */
	  public void setCodigo(String codigo) {
	    this.codigo = codigo;
	  }
	}
