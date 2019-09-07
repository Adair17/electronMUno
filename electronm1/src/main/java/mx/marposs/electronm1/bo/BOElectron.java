package mx.marposs.electronm1.bo;

import java.util.List;

import mx.marposs.electronm1.bean.BeanElectron;
import mx.marposs.electronm1.bean.BeanResult;
import mx.marposs.electronm1.exception.BusinessException;

public interface BOElectron {

		List<BeanResult> opcionesValorC(double min, double max) throws BusinessException;
		
		BeanElectron consultarMedidas(double min, double max, double c)throws BusinessException;
		
		BeanResult generarExcel(BeanElectron bean) throws BusinessException;
		
		BeanResult generarRespaldoBD() throws BusinessException;
		
		BeanResult cargarBD(String direccionArchivo)throws BusinessException;
		
}
