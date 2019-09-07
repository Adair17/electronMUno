package mx.marposs.electronm1.vista;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CBanner;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;


public class Principal extends Composite {
	private Text text;
	private Text text_1;
	private Text text_2;
	private Label lblNewLabel_1;
	private Text text_3;
	private Label lblPiezas;
	private Label lblPieza;
	private Label label_2;
	private Text text_4;
	private Label lblC;
	private Label lblCuerpoConCabl;
	private Label lblCuerpoConCable;
	private Label lblOjiva;
	private Label lblEscarpetasCarburo;
	private Label lblPalpadorescarburo;
	private Label lblBrazoParaPalpadores;
	private Label lblTapa;
	private Label lblLlaveParaBrazo;
	private Label lblLlavePalpador;
	private Text text_5;
	private Text text_6;
	private Text text_7;
	private Text text_8;
	private Text text_9;
	private Text text_10;
	private Text text_11;
	private Text text_12;
	private Text text_13;
	private Text text_14;
	private Label label_3;
	private Label label_4;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Principal(Composite parent, int style) {
		super(parent, style);
        initGUI(this);
        
        Label label = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
        label.setBounds(10, 510, 709, 0);
        
        Label label_1 = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
        label_1.setBackground(new Color(null,135, 206, 235));
        label_1.setBounds(20, 516, 646, 9);
        
        label_2 = new Label(this, SWT.CENTER);
        label_2.setText("Diametro M\u00EDnimo");
        label_2.setBackground(new Color(null,100, 149, 237));
        label_2.setBounds(40, 70, 120, 20);
        
        text_4 = new Text(this, SWT.BORDER);
        text_4.setBounds(40, 227, 120, 20);
        
        lblC = new Label(this, SWT.CENTER);
        lblC.setText("C");
        lblC.setBackground(new Color(null,135, 206, 235));
        lblC.setBounds(200, 201, 120, 20);
        
        lblCuerpoConCabl = new Label(this, SWT.CENTER);
        lblCuerpoConCabl.setText("Cuerpo con cabl de 2m");
        lblCuerpoConCabl.setBackground(new Color(null,135, 206, 235));
        lblCuerpoConCabl.setBounds(350, 186, 120, 35);
        
        lblCuerpoConCable = new Label(this, SWT.CENTER);
        lblCuerpoConCable.setText("Cuerpo con cable de 5m");
        lblCuerpoConCable.setBackground(new Color(null,135, 206, 235));
        lblCuerpoConCable.setBounds(500, 186, 120, 34);
        
        lblOjiva = new Label(this, SWT.CENTER);
        lblOjiva.setText("Ojiva");
        lblOjiva.setBackground(new Color(null,135, 206, 235));
        lblOjiva.setBounds(40, 253, 120, 20);
        
        lblEscarpetasCarburo = new Label(this, SWT.CENTER);
        lblEscarpetasCarburo.setText("Escarpetas Carburo");
        lblEscarpetasCarburo.setBackground(new Color(null,135, 206, 235));
        lblEscarpetasCarburo.setBounds(40, 366, 120, 20);
        
        lblPalpadorescarburo = new Label(this, SWT.CENTER);
        lblPalpadorescarburo.setText("Palpadores (Carburo)");
        lblPalpadorescarburo.setBackground(new Color(null,135, 206, 235));
        lblPalpadorescarburo.setBounds(40, 403, 120, 20);
        
        lblBrazoParaPalpadores = new Label(this, SWT.CENTER);
        lblBrazoParaPalpadores.setText("Brazo para palpadores");
        lblBrazoParaPalpadores.setBackground(new Color(null,135, 206, 235));
        lblBrazoParaPalpadores.setBounds(40, 443, 120, 20);
        
        lblTapa = new Label(this, SWT.CENTER);
        lblTapa.setText("Tapa");
        lblTapa.setBackground(new Color(null,135, 206, 235));
        lblTapa.setBounds(361, 366, 120, 20);
        
        lblLlaveParaBrazo = new Label(this, SWT.CENTER);
        lblLlaveParaBrazo.setText("Llave para brazo palpador");
        lblLlaveParaBrazo.setBackground(new Color(null,135, 206, 235));
        lblLlaveParaBrazo.setBounds(361, 403, 120, 34);
        
        lblLlavePalpador = new Label(this, SWT.CENTER);
        lblLlavePalpador.setText("Llave palpador");
        lblLlavePalpador.setBackground(new Color(null,135, 206, 235));
        lblLlavePalpador.setBounds(361, 443, 120, 20);
        
        text_5 = new Text(this, SWT.BORDER);
        text_5.setBounds(200, 227, 120, 20);
        
        text_6 = new Text(this, SWT.BORDER);
        text_6.setBounds(350, 227, 120, 20);
        
        text_7 = new Text(this, SWT.BORDER);
        text_7.setBounds(40, 274, 120, 20);
        
        text_8 = new Text(this, SWT.BORDER);
        text_8.setBounds(200, 366, 120, 20);
        
        text_9 = new Text(this, SWT.BORDER);
        text_9.setBounds(200, 403, 120, 20);
        
        text_10 = new Text(this, SWT.BORDER);
        text_10.setBounds(200, 443, 120, 20);
        
        text_11 = new Text(this, SWT.BORDER);
        text_11.setBounds(500, 443, 120, 20);
        
        text_12 = new Text(this, SWT.BORDER);
        text_12.setBounds(500, 403, 120, 20);
        
        text_13 = new Text(this, SWT.BORDER);
        text_13.setBounds(500, 226, 120, 20);
        
        text_14 = new Text(this, SWT.BORDER);
        text_14.setBounds(500, 366, 120, 20);
        
        label_3 = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
        label_3.setBackground(new Color(null,135, 206, 235));
        label_3.setBounds(15, 300, 646, 9);
        
        label_4 = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
        label_4.setBackground(new Color(null,135, 206, 235));
        label_4.setBounds(20, 161, 631, 9);
        
        Label label_5 = new Label(this, SWT.SEPARATOR | SWT.VERTICAL);
        label_5.setBounds(335, 337, -11, 167);
        
        Label label_6 = new Label(this, SWT.SEPARATOR | SWT.VERTICAL);
        label_6.setBackground(new Color(null,135, 206, 235));
        label_6.setBounds(326, 363, 29, 101);
		
		
		
	}

	public void initGUI(Composite parent) {
		setBackground(new Color(null,135, 206, 235));
//		d = new Display();
//		s = new Shell(d);
//	    s.setSize(400, 400);
	    
//	    s.setText("A MessageBox Example");
		CBanner banner = new CBanner(this, SWT.NONE);
		banner.setBounds(179, 51, 0, 0);
		
		Label lblNewLabel = new Label(this, SWT.CENTER);
		lblNewLabel.setBackground(new Color(null,135, 206, 235));
		lblNewLabel.setBounds(40, 201, 120, 20);
		lblNewLabel.setText("Campo de Medici\u00F3n");
		
		Label lblDiametroMximo = new Label(this, SWT.CENTER);
		lblDiametroMximo.setBackground(new Color(null,100, 149, 237));
		lblDiametroMximo.setBounds(200, 70, 120, 20);
		lblDiametroMximo.setText("Diametro M\u00E1ximo");
		
		Label lblDiametroRectificado = new Label(this, SWT.CENTER);
		lblDiametroRectificado.setBackground(new Color(null,50, 205, 50));
		lblDiametroRectificado.setBounds(500, 70, 120, 20);
		lblDiametroRectificado.setText("Diametro Rectificado");
		
		text = new Text(this, SWT.BORDER);
		text.setBounds(40, 90, 120, 20);
		
		text_1 = new Text(this, SWT.BORDER);
		text_1.setBounds(200, 90, 120, 20);
		
		text_2 = new Text(this, SWT.BORDER);
		text_2.setBounds(500, 90, 120, 20);
		
		lblNewLabel_1 = new Label(this, SWT.CENTER);
		lblNewLabel_1.setBackground(new Color(null,100, 149, 237));
		lblNewLabel_1.setBounds(350, 70, 120, 20);
		lblNewLabel_1.setText("X");
		
		text_3 = new Text(this, SWT.BORDER);
		text_3.setBounds(350, 90, 120, 20);
		
		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.setBounds(40, 130, 120, 25);
		btnNewButton.setText("Calcular");
		
		Button btnLimpiar = new Button(this, SWT.NONE);
		btnLimpiar.setText("Limpiar");
		btnLimpiar.setBounds(200, 130, 120, 25);
		
		Button btnNewButton_1 = new Button(this, SWT.NONE);
		btnNewButton_1.setText("Cargar Layout");
		btnNewButton_1.setBounds(350, 130, 120, 25);
		
		Button btnSalir = new Button(this, SWT.NONE);
		btnSalir.setText("Salir");
		btnSalir.setBounds(500, 130, 120, 25);
		
		lblPiezas = new Label(this, SWT.NONE);
		lblPiezas.setFont(new Font(null,"Segoe UI", 12, SWT.BOLD));
		lblPiezas.setBackground(new Color(null,135, 206, 235));
		lblPiezas.setText("2 Piezas");
		lblPiezas.setBounds(40, 315, 120, 20);
		
		lblPieza = new Label(this, SWT.NONE);
		lblPieza.setFont(new Font(null,"Segoe UI", 12, SWT.BOLD));
		lblPieza.setBackground(new Color(null,135, 206, 235));
		lblPieza.setText("1 Pieza");
		lblPieza.setBounds(361, 315, 120, 20);
    }

    public static Composite show(Shell shell){
        shell = new Shell();
        shell.setSize(600, 600);
        Principal wid = new Principal(shell, SWT.NONE);
        return wid;
    }

    public void cargarArchivo() {
    	JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		int returnValue = jfc.showOpenDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			System.out.println(selectedFile.getAbsolutePath());
		}
    }
}
