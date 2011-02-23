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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
public class formBusEst extends javax.swing.JFrame {
	private JPanel pnBuscar;
	private JLabel lbcedula;
	private JTextField txtcedula;
	private JLabel lbnombre;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JLabel lbapellido;
	private JPanel pnDatos;
	private Seccion seccion;
	private JLabel lbnota; 
	private JButton btRetirar; 
	private JButton btSalir;
	private JButton btBuscar; 
	private JLabel lbestado; 
	private JPanel pnnota;
	private JOptionPane mensaje;
	private JButton btbuscar;
	private JLabel lbAprobado;
	private JButton btCancelar;

	public formBusEst(Seccion seccion) {
		super();
		this.seccion=seccion;
		initGUI();
	}
	
	public JButton getBtCancelar() {
		return btCancelar;
	}

	public void setBtCancelar(JButton btCancelar) {
		this.btCancelar = btCancelar;
	}

	public JButton getBtRetirar() {
		return btRetirar;
	}

	public void setBtRetirar(JButton btRetirar) {
		this.btRetirar = btRetirar;
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Simular Asignatura/Buscar Estudiante");
			this.setFont(new java.awt.Font("URW Chancery L",0,16));
			{
				pnBuscar = new JPanel();
				getContentPane().add(pnBuscar, BorderLayout.CENTER);
				pnBuscar.setLayout(null);
				pnBuscar.setPreferredSize(new java.awt.Dimension(402, 266));
				pnBuscar.setBackground(new java.awt.Color(173,216,230));
				{
					pnDatos = new JPanel();
					pnBuscar.add(pnDatos);
					pnDatos.setLayout(null);
					pnDatos.setBounds(12, 12, 366, 215);
					pnDatos.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
					pnDatos.setBackground(new java.awt.Color(255,255,255));
					{
						lbapellido = new JLabel();
						pnDatos.add(lbapellido);
						lbapellido.setText("Apellido:");
						lbapellido.setBounds(13, 87, 68, 23);
						lbapellido.setFont(new java.awt.Font("URW Chancery L",0,16));
					}
					{
						txtapellido = new JTextField();
						pnDatos.add(txtapellido);
						txtapellido.setBounds(88, 89, 205, 22);
					}
					{
						lbnombre = new JLabel();
						pnDatos.add(lbnombre);
						lbnombre.setText("Nombre:");
						lbnombre.setBounds(14, 50, 100, 15);
						lbnombre.setFont(new java.awt.Font("URW Chancery L",0,16));
					}
					{
						txtcedula = new JTextField();
						pnDatos.add(txtcedula);
						txtcedula.setBounds(88, 14, 205, 22);
						txtcedula.addKeyListener(new KeyAdapter() {
							public void keyTyped(KeyEvent evt) {
								txtcedulaKeyTyped(evt);
							}
						});
					}
					{
						txtnombre = new JTextField();
						pnDatos.add(txtnombre);
						txtnombre.setBounds(88, 49, 204, 22);
					}
					{
						lbcedula = new JLabel();
						pnDatos.add(lbcedula);
						lbcedula.setText("Cedula:");
						lbcedula.setBounds(18, 16, 113, 15);
						lbcedula.setFont(new java.awt.Font("URW Chancery L",0,16));
					}
					{
						pnnota = new JPanel();
						pnDatos.add(pnnota);
						pnnota.setLayout(null);
						pnnota.setBounds(41, 132, 274, 65);
						pnnota.setBorder(new LineBorder(new java.awt.Color(0,0,0),1,false));
						pnnota.setBackground(new java.awt.Color(255,255,255));
						pnnota.setVisible(true);
						{
							lbnota = new JLabel();
							pnnota.add(lbnota);
							lbnota.setText("Nota Final");
							lbnota.setBounds(13, 13, 111, 15);
							lbnota.setFont(new java.awt.Font("URW Chancery L",0,16));
						}
						{
							lbestado = new JLabel();
							pnnota.add(lbestado);
							lbestado.setText("Estado");
							lbestado.setBounds(13, 40, 165, 16);
							lbestado.setFont(new java.awt.Font("URW Chancery L",0,16));
							lbestado.setText("Estado: ");
						}
						{
							lbAprobado = new JLabel();
							pnnota.add(lbAprobado);
							lbAprobado.setBounds(125, 43, 16, 14);
						}
					}
					{
						btbuscar = new JButton();
						pnDatos.add(btbuscar);
						btbuscar.setBounds(299, 14, 34, 22);
						btbuscar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/zoom.png")));
						btbuscar.setBackground(new java.awt.Color(255,255,255));
						btbuscar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								btbuscarActionPerformed(evt);
							}
						});
					}
				}
				{
					btBuscar = new JButton();
					pnBuscar.add(btBuscar);
					btBuscar.setText("Buscar");
					btBuscar.setBounds(12, 222, 98, 22);
					btBuscar.setVisible(false);
				}
				{
					btSalir = new JButton();
					pnBuscar.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setBounds(251, 232, 127, 24);
					btSalir.setFont(new java.awt.Font("URW Chancery L",0,16));
					btSalir.setBackground(new java.awt.Color(255,255,255));
					btSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
					btSalir.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btSalirActionPerformed(evt);
						}
					});
					btSalir.addKeyListener(new KeyAdapter() {
						public void keyPressed(KeyEvent evt) {
							btSalirKeyPressed(evt);
						}
					});
				}
				{
					btRetirar = new JButton();
					pnBuscar.add(btRetirar);
					btRetirar.setText("Retirar");
					btRetirar.setBounds(12, 232, 113, 24);
					btRetirar.setVisible(false);
					btRetirar.setFont(new java.awt.Font("URW Chancery L",2,16));
					btRetirar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/delete.png")));
					btRetirar.setBackground(new java.awt.Color(255,255,255));
					btRetirar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btRetirarActionPerformed(evt);
						}
					});
				}
				{
					btCancelar = new JButton();
					pnBuscar.add(btCancelar);
					btCancelar.setText("Cancelar");
					btCancelar.setBounds(128, 233, 121, 22);
					btCancelar.setBackground(new java.awt.Color(255,255,255));
					btCancelar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/cancel.png")));
					btCancelar.setFont(new java.awt.Font("URW Chancery L",2,16));
					btCancelar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btCancelarActionPerformed(evt);
						}
					});
				}
			}
			pack();
			this.setSize(405, 296);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	private void btSalirKeyPressed(KeyEvent evt) {
		dispose();
	}
	
	private void btRetirarActionPerformed(ActionEvent evt) {
		btCancelar.setVisible(false);
		if(! txtcedula.getText().equals("")){
			long cedula = Long.parseLong(txtcedula.getText());
			if(seccion.BuscarEstuporCedula(cedula)!=null){
				seccion.RetirarEstudiante(seccion.BuscarEstuporCedula(cedula));
				mensaje.showMessageDialog(btRetirar, "El Estudiante ha sido retirado");
				txtcedula.setText(" ");
				txtnombre.setText(" ");
				txtapellido.setText(" ");
				lbnota.setText("Nota Final :");
				lbestado.setText("Estado:");
				lbAprobado.setVisible(false);
			}
			else {
				mensaje.showMessageDialog(btRetirar, "El Estudiante no esta Inscrito");
			}
		}
		else {
			mensaje.showMessageDialog(btRetirar, "Debe Introducir una Cedula");
		}	
	}
	
	private void btSalirActionPerformed(ActionEvent evt) {
		dispose();
	}
	
	private void btbuscarActionPerformed(ActionEvent evt) {
		if(!txtcedula.getText().equals("")){
			long cedula = Long.parseLong(txtcedula.getText());
			if (seccion.BuscarEstuporCedula(cedula)!=null){
				txtnombre.setText(seccion.BuscarEstuporCedula(cedula).getNombre());
				txtnombre.setEditable(false);
				txtapellido.setText(seccion.BuscarEstuporCedula(cedula).getApellido());
				txtapellido.setEditable(false);
				pnnota.setVisible(true);
				lbAprobado.setVisible(true);
				if (seccion.BuscarEstuporCedula(cedula).getNotafinal()!=-1){
					pnnota.setVisible(true);
					lbnota.setText("Nota Final: "+seccion.BuscarEstuporCedula(cedula).getNotafinal());
					if(seccion.BuscarEstuporCedula(cedula).getAprobado()){
						lbestado.setText("Estado: Aprobado");
						lbAprobado.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/emoticon_evilgrin.png")));
					}
					else{
						lbestado.setText("Estado: Aplazado");
						lbAprobado.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/emoticon_unhappy.png")));
					}
				}
				else{
					lbnota.setText("Nota Final :");
					lbestado.setText("Estado:");
					lbAprobado.setVisible(false);
				}
			}
			else{
				mensaje.showMessageDialog(txtcedula, "Estudiante no Encontrado");
			}
		}
		else{
			mensaje.showMessageDialog(txtcedula, "Debe Introducir una Cedula");
		}	
	}
	
	private void txtcedulaKeyTyped(KeyEvent evt) {
		 char caracter = evt.getKeyChar();
		 if(((caracter < '0') || (caracter > '9')) &&(caracter != KeyEvent.VK_BACK_SPACE)){
		         evt.consume();  // ignorar el evento de teclado
		 }
	}
	
	private void btCancelarActionPerformed(ActionEvent evt) {
		txtcedula.setText("");
		txtnombre.setText("");
		txtapellido.setText("");
		lbnota.setText("Nota Final :");
		lbestado.setText("Estado:");
		lbAprobado.setVisible(false);
	}
}
