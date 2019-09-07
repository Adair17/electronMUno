package mx.marposs.electronm1.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import mx.marposs.electronm1.bean.BeanElectron;
import mx.marposs.electronm1.exception.BusinessException;

public class UtilElectron {

	private static final Logger LOGGER = Logger.getLogger(UtilElectron.class);
	private final static String ERROR = "Error al generar archivo: "; 
	
	public static String getBD(String keyConf) {
		Properties prop = new Properties();
		String config = Constantes.CADENA_VACIA;
		try {
			
				prop.load(new FileInputStream(Constantes.DIR_PROG.concat(Constantes.SLASH).concat(Constantes.NOMBRE_BD)));
			
			config = prop.getProperty(keyConf);
		} catch (FileNotFoundException e) {
			LOGGER.error(
					"No se ha podido obtener el archivo de configuracion: " + e.getMessage(), e);
			config = Constantes.CADENA_VACIA;
		} catch (IOException e) {
			LOGGER.error("Hubo un error al leer el archivo de propiedades: " + e.getMessage(), e);
			config = Constantes.CADENA_VACIA;
		}
		return config;
	}
	
	public static String getConf(String keyConf) {
		Properties prop = new Properties();
		String config = Constantes.CADENA_VACIA;
		try {
			
				prop.load(new FileInputStream("C:\\planElectron\\procesos\\properties\\cfgElectron.properties"));
			
			config = prop.getProperty(keyConf);
		} catch (FileNotFoundException e) {
			LOGGER.error(
					"No se ha podido obtener el archivo de configuracion: " + e.getMessage(), e);
			config = Constantes.CADENA_VACIA;
		} catch (IOException e) {
			LOGGER.error("Hubo un error al leer el archivo de propiedades: " + e.getMessage(), e);
			config = Constantes.CADENA_VACIA;
		}
		return config;
	}
	
	public static void crearCelda(int renglon, int columna, HSSFSheet sheet, String valor) {
		int rowCount = 0;
        int columnCount = 0;
        Row row = sheet.createRow(++rowCount);
        Cell cell = row.createCell(++columnCount);
        cell.setCellValue(valor);
	}

	public static void generarBaseDatos(List<BeanElectron> baseDatos) throws BusinessException {
		File archivo = new File(Constantes.DIR_PROG.concat(Constantes.SLASH).concat(Constantes.NOMBRE_BD));
		try (FileWriter writer = new FileWriter(archivo); BufferedWriter bw = new BufferedWriter(writer)) {
			int i = 0;
			for (BeanElectron registro : baseDatos) {
					bw.write(Constantes.MEDIDAS+i+" = ".concat(registro.getCampoMedicion())
							.concat(Constantes.SEPARADOR).concat(registro.getParametroC())
							.concat(Constantes.SEPARADOR).concat(registro.getCuerpoCable2m())
							.concat(Constantes.SEPARADOR).concat(registro.getCuerpoCable5m())
							.concat(Constantes.SEPARADOR).concat(registro.getOjiva())
							.concat(Constantes.SEPARADOR).concat(registro.getEscarpetas())
							.concat(Constantes.SEPARADOR).concat(registro.getPalpadores())
							.concat(Constantes.SEPARADOR).concat(registro.getBrazoPalpadores())
							.concat(Constantes.SEPARADOR).concat(registro.getTapa())
							.concat(Constantes.SEPARADOR).concat(registro.getLlaveBrazoPalpador())
							.concat(Constantes.SEPARADOR).concat(registro.getLlavePalpador()));
					i++;
			}
			bw.write(Constantes.TAMANIO_LISTA.concat(" = ")+i);
			bw.close();
		} catch (IOException e) {
			LOGGER.error(ERROR.concat(e.getMessage()), e);
			throw new BusinessException(ERROR.concat(e.getMessage()),e);
		}
	}
}
