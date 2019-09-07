package mx.marposs.electronm1.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.marposs.electronm1.bean.BeanElectron;
import mx.marposs.electronm1.bean.BeanResult;
import mx.marposs.electronm1.bo.BOElectron;
import mx.marposs.electronm1.dao.DAOElectron;
import mx.marposs.electronm1.exception.BusinessException;

@Component("boElectron")
public class BOElectronImpl  implements BOElectron{

	@Autowired
	private DAOElectron daoElectron;

	public List<BeanResult> opcionesValorC(double min, double max) throws BusinessException {
		
		return null;
	}

	public BeanElectron consultarMedidas(double min, double max, double c) throws BusinessException {
		
		return null;
	}

	public BeanResult generarExcel(BeanElectron bean) throws BusinessException {
		
		return null;
	}

	public BeanResult generarRespaldoBD() throws BusinessException {
		
		return null;
	}

	public BeanResult cargarBD(String direccionArchivo) throws BusinessException {
		
		return null;
	}
}
