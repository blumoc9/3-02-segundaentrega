import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;


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
public class formInsEst extends javax.swing.JFrame {
	private JPanel pnRegistrar;
	private JButton btsalir;
	private JButton btinscribir;
	private JTextField txtapellido;
	private JLabel lbapellido;
	private JLabel lbnombre;
	private JTextField txtnombre;
	private JTextField txtcedula;
	private JLabel lbcedula;
	private JPanel pnDatos;
	private Seccion seccion;
	private JOptionPane mensaje;

	public formInsEst(Seccion seccion) {
		super();
		this.seccion=seccion;
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				this.setSize(479, 260);
			}
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Simular Asignatura/Inscribir Estudiante");
			{
				pnRegistrar = new JPanel();
				getContentPane().add(pnRegistrar, BorderLayout.CENTER);
				pnRegistrar.setLayout(null);
				pnRegistrar.setPreferredSize(new java.awt.Dimension(393, 226));
				pnRegistrar.setBackground(new java.awt.Color(173,216,230));
				{
					btsalir = new JButton();
					pnRegistrar.add(btsalir);
					btsalir.setText("Salir");
					btsalir.setBounds(231, 177, 92, 22);
					btsalir.setFont(new java.awt.Font("URW Chancery L",0,16));
					btsalir.setBackground(new java.awt.Color(255,255,255));
					btsalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
					btsalir.addKeyListener(new KeyAdapter() {
						public void keyPressed(KeyEvent evt) {
							btsalirKeyPressed(evt);
						}
					});
					btsalir.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btsalirActionPerformed(evt);
						}
					});
				}
				{
					pnDatos = new JPanel();
					pnDatos.setLayout(null);
					pnRegistrar.add(pnDatos);
					pnDatos.setBounds(17, 12, 306, 152);
					pnDatos.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
					pnDatos.setBackground(new java.awt.Color(255,255,255));
					{
						lbcedula = new JLabel();
						pnDatos.add(lbcedula);
						lbcedula.setText("Cedula");
						lbcedula.setBounds(18, 24, 73, 15);
						lbcedula.setFont(new java.awt.Font("URW Chancery L",0,16));
					}
					{
						txtcedula = new JTextField();
						pnDatos.add(txtcedula);
						txtcedula.setBounds(79, 21, 179, 22);
					}
					{
						txtnombre = new JTextField();
						txtcedula.setNextFocusableComponent(txtnombre);
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
						pnDatos.add(txtnombre);
						txtnombre.setBounds(79, 60, 182, 22);
					}
					{
						lbnombre = new JLabel();
						pnDatos.add(lbnombre);
						lbnombre.setText("Nombre");
						lbnombre.setBounds(18, 63, 83, 15);
						lbnombre.setFont(new java.awt.Font("URW Chancery L",0,16));
					}
					{
						lbapellido = new JLabel();
						pnDatos.add(lbapellido);
						lbapellido.setText("Apellido");
						lbapellido.setBounds(18, 103, 82, 15);
						lbapellido.setFont(new java.awt.Font("URW Chancery L",0,16));
					}
					{
						txtapellido = new JTextField();
						txtnombre.setNextFocusableComponent(txtapellido);
						txtnombre.addKeyListener(new KeyAdapter() {
							public void keyTyped(KeyEvent evt) {
								txtnombreKeyTyped(evt);
							}
						});
						pnDatos.add(txtapellido);
						txtapellido.setBounds(79, 100, 184, 22);
						txtapellido.setNextFocusableComponent(btinscribir);
						txtapellido.addKeyListener(new KeyAdapter() {
							public void keyTyped(KeyEvent evt) {
								txtapellidoKeyTyped(evt);
							}
						});
					}
				}
				{
					btinscribir = new JButton();
					pnRegistrar.add(btinscribir);
					btinscribir.setText("Inscribir");
					btinscribir.setBounds(17, 177, 131, 22);
					btinscribir.setFont(new java.awt.Font("URW Chancery L",2,16));
					btinscribir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/add.png")));
					btinscribir.setBackground(new java.awt.Color(255,255,255));
					btinscribir.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btinscribirActionPerformed(evt);
						}
					});
				}
			}
			pack();
			this.setSize(348, 248);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	public boolean ValidarFormulario(){
		return (!txtcedula.getText().equals(""))&&(!txtnombre.getText().equals(""))&&(!txtapellido.getText().equals(""));
	}
	
	private void btsalirActionPerformed(ActionEvent evt) {
		dispose();
	}
	
	private void btsalirKeyPressed(KeyEvent evt) {
		dispose();
	}
	
	private void txtcedulaFocusLost(FocusEvent evt) {
		if (!txtcedula.getText().equals("")){
			long cedula = Long.parseLong(txtcedula.getText());
			if(seccion.BuscarEstuporCedula(cedula)==null){
				txtnombre.setFocusable(true);
			}
			else{
				mensaje.showMessageDialog(txtcedula, "Ya Existe un Estudiante con esa Cedula");
				dispose();
			}
		}
	}
	
	private void btinscribirActionPerformed(ActionEvent evt) {
		if (ValidarFormulario()){
			long cedula = Long.parseLong(txtcedula.getText());
			if(seccion.getProfesor()!=null){
				if(seccion.getProfesor().getCedula()!=cedula){
					Estudiante estudiante = new Estudiante();
					cedula = Long.parseLong(txtcedula.getText());
					estudiante.setCedula(cedula);
					estudiante.setNombre(txtnombre.getText());
					estudiante.setApellido(txtapellido.getText());
					seccion.InscribirEstudiante(estudiante);
					mensaje.showMessageDialog(btinscribir, "Estudiante Inscrito Exitosamente");
				}
				else {
					mensaje.showMessageDialog(btinscribir, "Existe un Profesor con esa Cedula");
				}
			}
			else {
				Estudiante estudiante = new Estudiante();
				cedula = Long.parseLong(txtcedula.getText());
				estudiante.setCedula(cedula);
				estudiante.setNombre(txtnombre.getText());
				estudiante.setApellido(txtapellido.getText());
				seccion.InscribirEstudiante(estudiante);
				mensaje.showMessageDialog(btinscribir, "Estudiante Inscrito Exitosamente");
			}
		}
		else{
			mensaje.showMessageDialog(btinscribir, "Debe Llenar Todos los Campos");
		}
		txtcedula.setText("");
		txtnombre.setText("");
		txtapellido.setText("");
	}
	
	private void txtcedulaKeyTyped(KeyEvent evt) {
		 char caracter = evt.getKeyChar();
		 if(((caracter < '0') || (caracter > '9')) &&(caracter != KeyEvent.VK_BACK_SPACE)){
		         evt.consume();  // ignorar el evento de teclado
		 }
	}
	
	private void txtnombreKeyTyped(KeyEvent evt) {
		char caracter = evt.getKeyChar();
		 if(!(((caracter < '0') || (caracter > '9')) &&(caracter != KeyEvent.VK_BACK_SPACE))){
		         evt.consume();  // ignorar el evento de teclado
		 }
	}
	
	private void txtapellidoKeyTyped(KeyEvent evt) {
		char caracter = evt.getKeyChar();
		 if(!(((caracter < '0') || (caracter > '9')) &&(caracter != KeyEvent.VK_BACK_SPACE))){
		         evt.consume();  // ignorar el evento de teclado
		 }
	}
}
