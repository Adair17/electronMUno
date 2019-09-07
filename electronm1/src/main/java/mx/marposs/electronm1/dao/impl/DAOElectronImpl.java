package mx.marposs.electronm1.dao.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Component;

import mx.marposs.electronm1.bean.BeanCombo;
import mx.marposs.electronm1.bean.BeanElectron;
import mx.marposs.electronm1.bean.BeanResult;
import mx.marposs.electronm1.dao.DAOElectron;
import mx.marposs.electronm1.exception.BusinessException;
import mx.marposs.electronm1.util.Constantes;
import mx.marposs.electronm1.util.UtilElectron;

@Component
public class DAOElectronImpl implements DAOElectron{

	private static final Logger LOGGER = Logger.getLogger(DAOElectronImpl.class);
	
	
	public List<BeanCombo> opcionesValorC(double min, double max) {
		List<BeanCombo> result = new ArrayList<BeanCombo>();
		int tamanioLista = Integer.parseInt(UtilElectron.getBD(Constantes.TAMANIO_LISTA));
		double diametro = min-((min+12)*0.00007);
		String trama = Constantes.CADENA_VACIA;
		for(int i=0; i<tamanioLista;i++) {
			trama = UtilElectron.getBD(Constantes.MEDIDAS+(i+1));
			String[] registros = trama.split(".,.");
			String[] campoMedicion= registros[0].split("-");
			int limiteInf = Integer.parseInt(campoMedicion[0]);
			int limiteSup = Integer.parseInt(campoMedicion[1]);
			if(diametro >= limiteInf && diametro <= limiteSup) {
				BeanCombo c = new BeanCombo();
				c.setKey(registros[1]);
				c.setValue(registros[1]);
				result.add(c);
			}
		}
		return result;
	}

	public BeanElectron consultarMedidas(double min, double max, double c) {
		BeanElectron result = new BeanElectron();
		int tamanioLista = Integer.parseInt(UtilElectron.getBD(Constantes.TAMANIO_LISTA));
		double diametro = min-((min+12)*0.00007);
		String trama = Constantes.CADENA_VACIA;
		for(int i=0; i<tamanioLista;i++) {
			trama = UtilElectron.getBD(Constantes.MEDIDAS+(i));
			String[] registros = trama.split(".,.");
			String[] campoMedicion= registros[0].split("-");
			int limiteInf = Integer.parseInt(campoMedicion[0]);
			int limiteSup = Integer.parseInt(campoMedicion[1]);
			if(diametro >= limiteInf && diametro <= limiteSup && Integer.parseInt(registros[1]) == c) {
				result.setCampoMedicion(registros[0]);
				result.setParametroC(registros[1]);
				result.setCuerpoCable2m(registros[2]);
				result.setCuerpoCable5m(registros[3]);
				result.setOjiva(registros[4]);
				result.setEscarpetas(registros[5]);
				result.setPalpadores(registros[6]);
				result.setBrazoPalpadores(registros[7]);
				result.setTapa(registros[8]);
				result.setLlaveBrazoPalpador(registros[9]);
				result.setLlavePalpador(registros[10]);
				break;
			}
		}
		return result;
	}

	public BeanResult generarExcel(BeanElectron bean) {
		BeanResult result = new BeanResult();
		@SuppressWarnings("resource")
		HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Electron M1");

        int renglon = 0;
        int columna = 0;
        String titulos = "CAMPO DE MEDICIÓN.-.C.-.CUERPO CON CABLE DE (2 m).-.CUERPO CON CABLE DE (5 m).-.OJIVA.-.ESCARPETAS (CARBURO).-.PALPADORES (CARBURO).-.BRAZO PARA PALPADORES.-.TAPA.-.LLAVE PARA BRAZO PLAPADOR.-.LLAVE PALPADOR";
        String[] tit = titulos.split(".-.");
        UtilElectron.crearCelda(renglon, ++columna, sheet, tit[0]);
        UtilElectron.crearCelda(renglon, ++columna, sheet, tit[1]);
        UtilElectron.crearCelda(renglon, ++columna, sheet, tit[2]);
        UtilElectron.crearCelda(renglon, ++columna, sheet, tit[3]);
        UtilElectron.crearCelda(renglon, ++columna, sheet, tit[4]);
        UtilElectron.crearCelda(renglon, ++columna, sheet, tit[5]);
        UtilElectron.crearCelda(renglon, ++columna, sheet, tit[6]);
        UtilElectron.crearCelda(renglon, ++columna, sheet, tit[7]);
        UtilElectron.crearCelda(renglon, ++columna, sheet, tit[8]);
        UtilElectron.crearCelda(renglon, ++columna, sheet, tit[9]);
        UtilElectron.crearCelda(renglon, ++columna, sheet, tit[10]);
        
        UtilElectron.crearCelda(renglon, ++columna, sheet, bean.getCampoMedicion());
        UtilElectron.crearCelda(renglon, ++columna, sheet, bean.getParametroC());
        UtilElectron.crearCelda(renglon, ++columna, sheet, bean.getCuerpoCable2m());
        UtilElectron.crearCelda(renglon, ++columna, sheet, bean.getCuerpoCable5m());
        UtilElectron.crearCelda(renglon, ++columna, sheet, bean.getOjiva());
        UtilElectron.crearCelda(renglon, ++columna, sheet, bean.getEscarpetas());
        UtilElectron.crearCelda(renglon, ++columna, sheet, bean.getPalpadores());
        UtilElectron.crearCelda(renglon, ++columna, sheet, bean.getBrazoPalpadores());
        UtilElectron.crearCelda(renglon, ++columna, sheet, bean.getTapa());
        UtilElectron.crearCelda(renglon, ++columna, sheet, bean.getLlaveBrazoPalpador());
        UtilElectron.crearCelda(renglon, ++columna, sheet, bean.getLlavePalpador());
         
        try (FileOutputStream outputStream = new FileOutputStream("ReporteElectron.xlsx")) {
            workbook.write(outputStream);
        } catch (IOException e) {
        	LOGGER.error(e.getMessage(),e);
		}
		return result;
	}

	public BeanResult generarRespaldoBD() {
		BeanResult result = new BeanResult();
		File baseDatos = new File(Constantes.DIR_PROG.concat(Constantes.SLASH).concat("Electron.properties"));
		InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream(baseDatos);
	        os = new FileOutputStream(new File(Constantes.DIR_PROG.concat(Constantes.SLASH).concat("Electron.properties.backup")));
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } catch (IOException e) {
	    	LOGGER.error(e.getMessage(),e);
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				LOGGER.error(e.getMessage(),e);
			}
	        
	    }
		return result;
	}

	public BeanResult cargarBD(String direccionArchivo) {
		// Creating a Workbook from an Excel file (.xls or .xlsx)
		List<BeanElectron> baseDatos = new ArrayList<>();
		BeanResult result = new BeanResult();
        try (Workbook workbook = WorkbookFactory.create(new File(direccionArchivo))){
        	// Getting the Sheet at index zero
            Sheet sheet = workbook.getSheetAt(0);
         // Create a DataFormatter to format and get each cell's value as String
            DataFormatter dataFormatter = new DataFormatter();
            System.out.println("\n\nIterating over Rows and Columns using Java 8 forEach with lambda\n");
            sheet.forEach(row -> {
            	row.getRowNum();
                row.forEach(cell -> {
                    cell.getColumnIndex();
                	String cellValue = dataFormatter.formatCellValue(cell);
                    System.out.print(cellValue + "\t");
                });
                System.out.println();
            });
            UtilElectron.generarBaseDatos(baseDatos);
            result.setEjecucionCorrecta(true);
		} catch (EncryptedDocumentException | IOException | BusinessException e) {
			result.setEjecucionCorrecta(false);
			result.setMensaje(e.getMessage());
			LOGGER.error(e.getMessage(),e);
		}
        
		return result;
	}

}
