package mx.marposs.electronm1.dao;

import java.util.List;

import mx.marposs.electronm1.bean.BeanCombo;
import mx.marposs.electronm1.bean.BeanElectron;
import mx.marposs.electronm1.bean.BeanResult;

public interface DAOElectron {

	List<BeanCombo> opcionesValorC(double min, double max);
	
	BeanElectron consultarMedidas(double min, double max, double c);
	
	BeanResult generarExcel(BeanElectron bean);
	
	BeanResult generarRespaldoBD();
	
	BeanResult cargarBD(String direccionArchivo);
}
