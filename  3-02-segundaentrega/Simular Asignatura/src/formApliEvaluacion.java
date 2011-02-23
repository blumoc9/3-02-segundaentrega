import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
public class formApliEvaluacion extends javax.swing.JFrame {
	private JPanel pnApliEvaluacion;
	private JButton btApliEvaluacion;
	private JButton btSalir;
	private JTextField txtprofesor;
	private JTextField txtseccion;
	private JTable tbApliEvaluacion;
	private JLabel lbProfesor;
	private JLabel lbSeccion;
	private JPanel pnDatos;
	private Seccion seccion;
	private JOptionPane mensaje;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public formApliEvaluacion(Seccion seccion) {
		super();
		this.seccion=seccion;
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Simular Asignatura/Aplicar Evaluacion");
			getContentPane().setBackground(new java.awt.Color(173,216,230));
			{
				pnApliEvaluacion = new JPanel();
				getContentPane().add(pnApliEvaluacion, BorderLayout.CENTER);
				pnApliEvaluacion.setLayout(null);
				pnApliEvaluacion.setPreferredSize(new java.awt.Dimension(399, 270));
				pnApliEvaluacion.setBackground(new java.awt.Color(173,216,230));
				{
					pnDatos = new JPanel();
					pnApliEvaluacion.add(pnDatos);
					pnDatos.setBounds(32, 21, 449, 227);
					pnDatos.setLayout(null);
					pnDatos.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
					pnDatos.setBackground(new java.awt.Color(255,255,255));
					{
						lbSeccion = new JLabel();
						pnDatos.add(lbSeccion);
						lbSeccion.setText("Seccion:");
						lbSeccion.setBounds(38, 33, 65, 18);
						lbSeccion.setFont(new java.awt.Font("URW Chancery L",2,16));
					}
					{
						lbProfesor = new JLabel();
						pnDatos.add(lbProfesor);
						lbProfesor.setText("Profesor:");
						lbProfesor.setBounds(174, 29, 81, 22);
						lbProfesor.setFont(new java.awt.Font("URW Chancery L",2,16));
					}
					{
						txtseccion = new JTextField();
						pnDatos.add(txtseccion);
						txtseccion.setBounds(94, 33, 58, 20);
						txtseccion.setEditable(false);
					}
					{
						txtprofesor = new JTextField();
						pnDatos.add(txtprofesor);
						txtprofesor.setBounds(246, 31, 159, 22);
						txtprofesor.setEditable(false);
					}
				}
				{
					btSalir = new JButton();
					pnApliEvaluacion.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setBounds(365, 275, 116, 21);
					btSalir.setFont(new java.awt.Font("URW Chancery L",0,16));
					btSalir.setBackground(new java.awt.Color(255,255,255));
					btSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
					btSalir.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btSalirActionPerformed(evt);
						}
					});
				}
				{
					btApliEvaluacion = new JButton();
					pnApliEvaluacion.add(btApliEvaluacion);
					btApliEvaluacion.setText("Aplicar Evaluacion");
					btApliEvaluacion.setBounds(32, 273, 216, 22);
					btApliEvaluacion.setFont(new java.awt.Font("URW Chancery L",2,16));
					btApliEvaluacion.setBackground(new java.awt.Color(255,255,255));
					btApliEvaluacion.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/accept.png")));
					btApliEvaluacion.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btApliEvaluacionActionPerformed(evt);
						}
					});
				}
			}
			pack();
			this.setSize(535, 348);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void btApliEvaluacionActionPerformed(ActionEvent evt) {
		txtseccion.setText("1");
		txtprofesor.setText(seccion.getProfesor().getNombre());
		String[][] datos={{ "    Cedula     ", "    Nombre    ", "	  Apellido 	 " }};
		String[] columnas={ "Cedula", "Nombre", "Apellido" };
		TableModel tbApliEvaluacionModel = 	new DefaultTableModel(datos,columnas);
		tbApliEvaluacion = new JTable(tbApliEvaluacionModel);
		pnDatos.add(tbApliEvaluacion);
		tbApliEvaluacion.setModel(tbApliEvaluacionModel);
		tbApliEvaluacion.setBounds(51, 100, 357, 98);
		tbApliEvaluacion.setFont(new java.awt.Font("URW Chancery L",2,16));
		String cedula;
		seccion.AplicarEvaluaciones();
		for (int i=0;i<seccion.getVectorestudiante().size();i++){
			cedula=Long.toString(seccion.getVectorestudiante().get(i).getCedula());
			String[] newRow= {cedula,seccion.getVectorestudiante().get(i).getNombre(),seccion.getVectorestudiante().get(i).getApellido()};
			((DefaultTableModel) tbApliEvaluacionModel).addRow(newRow);
		}
		mensaje.showMessageDialog(btApliEvaluacion, "Evaluacion Aplicada con Exito");
	}
	
	private void btSalirActionPerformed(ActionEvent evt) {
		dispose();
	}
}
