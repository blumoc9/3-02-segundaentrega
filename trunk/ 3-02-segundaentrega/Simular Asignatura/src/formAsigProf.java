import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JWindow;

import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.SwingUtilities;



/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class formAsigProf extends javax.swing.JFrame {
	private JPanel pnAsigProf;
	private JButton btsalir;
	private JButton btasignar;
	private JLabel lbCedula;
	private JTextField txtcedula;
	private JTextField txtapellido;
	private JLabel lbapellido;
	private JLabel lbnombre;
	private JTextField txtnombre;
	private JTextField txttitulo;
	private JLabel lbTitulo;
	private JPanel pnDatos;
	private Seccion seccion;
	private JOptionPane mensaje;

	
	public formAsigProf(Seccion seccion) {
		super();
		this.seccion=seccion;
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Simular Asignatura/Asignar Profesor");
			{
				pnAsigProf = new JPanel();
				getContentPane().add(pnAsigProf, BorderLayout.CENTER);
				pnAsigProf.setLayout(null);
				pnAsigProf.setPreferredSize(new java.awt.Dimension(418, 259));
				pnAsigProf.setBackground(new java.awt.Color(173,216,230));
				{
					pnDatos = new JPanel();
					pnAsigProf.add(pnDatos);
					pnDatos.setBounds(11, 12, 378, 202);
					pnDatos.setLayout(null);
					pnDatos.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
					pnDatos.setBackground(new java.awt.Color(255,255,255));
					{
						lbTitulo = new JLabel();
						pnDatos.add(lbTitulo);
						lbTitulo.setText("Titulo Academico");
						lbTitulo.setBounds(33, 159, 242, 15);
						lbTitulo.setFont(new java.awt.Font("URW Chancery L",0,16));
					}
					{
						txttitulo = new JTextField();
						pnDatos.add(txttitulo);
						txttitulo.setBounds(155, 156, 149, 22);
						txttitulo.addKeyListener(new KeyAdapter() {
							public void keyTyped(KeyEvent evt) {
								txttituloKeyTyped(evt);
							}
						});
						txttitulo.setEnabled(true);
					}
					{
						txtnombre = new JTextField();
						pnDatos.add(txtnombre);
						txtnombre.setBounds(107, 117, 197, 22);
						txtnombre.addKeyListener(new KeyAdapter() {
							public void keyTyped(KeyEvent evt) {
								txtnombreKeyTyped(evt);
							}
						});
						txtnombre.setEnabled(true);
					}
					{
						lbnombre = new JLabel();
						pnDatos.add(lbnombre);
						lbnombre.setText("Nombre");
						lbnombre.setBounds(37, 120, 127, 15);
						lbnombre.setFont(new java.awt.Font("URW Chancery L",0,16));
					}
					{
						lbapellido = new JLabel();
						pnDatos.add(lbapellido);
						lbapellido.setText("Apellido");
						lbapellido.setBounds(37, 77, 105, 15);
						lbapellido.setFont(new java.awt.Font("URW Chancery L",0,16));
					}
					{
						txtapellido = new JTextField();
						pnDatos.add(txtapellido);
						txtapellido.setBounds(107, 74, 197, 22);
						txtapellido.addKeyListener(new KeyAdapter() {
							public void keyTyped(KeyEvent evt) {
								txtapellidoKeyTyped(evt);
							}
						});
						txtapellido.setEnabled(true);
					}
					{
						txtcedula = new JTextField();
						pnDatos.add(txtcedula);
						txtcedula.setBounds(107, 26, 197, 22);
						txtcedula.addKeyListener(new KeyAdapter() {
							public void keyTyped(KeyEvent evt) {
								txtcedulaKeyTyped(evt);
							}
						});
						txtcedula.addFocusListener(new FocusAdapter() {
							public void focusLost(FocusEvent evt) {
								txtcedulaFocusLost(evt);
							}
						});
					}
					{
						lbCedula = new JLabel();
						pnDatos.add(lbCedula);
						lbCedula.setText("Cedula");
						lbCedula.setBounds(37, 29, 83, 15);
						lbCedula.setFont(new java.awt.Font("URW Chancery L",0,16));
					}
				}
				{
					btasignar = new JButton();
					pnAsigProf.add(btasignar);
					btasignar.setText("Asignar");
					btasignar.setBounds(12, 226, 125, 22);
					btasignar.setFont(new java.awt.Font("URW Chancery L",0,16));
					btasignar.setBackground(new java.awt.Color(255,255,255));
					btasignar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/add.png")));
					btasignar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btasignarActionPerformed(evt);
						}
					});
				}
				{
					btsalir = new JButton();
					pnAsigProf.add(btsalir);
					btsalir.setText("Salir");
					btsalir.setBounds(286, 226, 103, 22);
					btsalir.setFont(new java.awt.Font("URW Chancery L",2,16));
					btsalir.setBackground(new java.awt.Color(255,255,255));
					btsalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
					btsalir.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btsalirActionPerformed(evt);
						}
					});
				}
			}
			pack();
			this.setSize(418, 289);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	public boolean ValidarFormulario(){
		return (!txtcedula.getText().equals(""))&&(!txtnombre.getText().equals(""))
			   &&(!txtapellido.getText().equals(""))&&(!txttitulo.getText().equals(""));
	}
	
	private void btsalirActionPerformed(ActionEvent evt) {
		dispose();
	}
	
	private void btasignarActionPerformed(ActionEvent evt) {
		if (ValidarFormulario()){
			Profesor profesor = new Profesor();
			long cedula = Long.parseLong(txtcedula.getText());
			profesor.setCedula(cedula);
			profesor.setNombre(txtnombre.getText());
			profesor.setApellido(txtapellido.getText());
			profesor.setTitulo(txttitulo.getText());
			seccion.setProfesor(profesor);
			mensaje.showMessageDialog(btasignar, "Profesor Guardado Exitosamente");
			dispose();
		}
		else{
			mensaje.showMessageDialog(btasignar, "Debe Llenar Todos los Campos");
		}
	}
	
	private void txtcedulaFocusLost(FocusEvent evt) {
		if (!txtcedula.getText().equals("")){
			long cedula = Long.parseLong(txtcedula.getText());
			if(seccion.BuscarEstuporCedula(cedula)==null){
				txtnombre.setEnabled(true);
				txtapellido.setEnabled(true);
				txttitulo.setEnabled(true);
			}
			else{
				mensaje.showMessageDialog(btasignar, "Existe un Estudiante con esa Cedula");
			}
		}
	}
	
	private void txtcedulaKeyTyped(KeyEvent evt) {
		char caracter = evt.getKeyChar();
		if(((caracter < '0') || (caracter > '9')) &&(caracter != KeyEvent.VK_BACK_SPACE)){
			 evt.consume();  // ignorar el evento de teclado
		}
	}
	
	private void txtapellidoKeyTyped(KeyEvent evt) {
		 char caracter = evt.getKeyChar();
		 if(!(((caracter < '0') || (caracter > '9')) &&(caracter != KeyEvent.VK_BACK_SPACE))){
		         evt.consume();  // ignorar el evento de teclado
		 }
	}
	
	private void txtnombreKeyTyped(KeyEvent evt) {
		char caracter = evt.getKeyChar();
		 if(!(((caracter < '0') || (caracter > '9')) &&(caracter != KeyEvent.VK_BACK_SPACE))){
		         evt.consume();  // ignorar el evento de teclado
		 }
	}
	
	private void txttituloKeyTyped(KeyEvent evt) {
		char caracter = evt.getKeyChar();
		 if(!(((caracter < '0') || (caracter > '9')) &&(caracter != KeyEvent.VK_BACK_SPACE))){
		         evt.consume();  // ignorar el evento de teclado
		 }
	}
}
