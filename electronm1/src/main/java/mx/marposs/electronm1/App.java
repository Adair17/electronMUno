package mx.marposs.electronm1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mx.marposs.electronm1.bo.BOElectron;
import mx.marposs.electronm1.configuracion.ConfigElectron;
import mx.marposs.electronm1.exception.BusinessException;
import mx.marposs.electronm1.util.Constantes;
import mx.marposs.electronm1.vista.Principal;

/**
 * Hello world!
 *
 */
public class App {
	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(App.class);
	
	
	static ApplicationContext context = null;
	
	
    public static void main( String[] args )
    {
//    	try {
    		inicializador();
    		initPrincipal();
				BOElectron boElectron = context.getBean("boElectron", BOElectron.class);
				
				
//		} catch (BusinessException e) {
//			LOGGER.error("Ocurrio un error al consultar BD: ".concat(e.getMessage()),e);
//			System.exit(1);
//		}
		System.exit(0);
    }
    
    private static void inicializador() {
    	context = new AnnotationConfigApplicationContext(ConfigElectron.class);
		PropertyConfigurator.configure(Constantes.DIR_LOG);
		
    }
    
    private static void initPrincipal() {
            Display display = new Display();
            Shell shell = new Shell(display);
            shell.setLayout(new GridLayout());
            new Principal(shell, SWT.NONE);
            shell.open();
            shell.setText("Estudio M1 Electron");
            shell.pack();
            while (!shell.isDisposed()) {
                if (!display.readAndDispatch())
                    display.sleep();
            }
            display.dispose();
    }

}
