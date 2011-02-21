

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
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
public class formListOrdCedula extends javax.swing.JFrame {
	private JPanel pnLisOrdeCedula;
	private JPanel pnOrdCedula;
	private JButton jButton1;
	private JButton jButton2;
	private JTable tbOrdCedula;
	private JButton btarchivotexto;
	private JButton btSalir;
	private JButton btVerListado;
	private JTextField txtProfesor;
	private JTextField txtSeccion;
	private JLabel lbProfesor;
	private JLabel lbSeccion;
	private Seccion seccion;
	private JOptionPane mensaje;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public formListOrdCedula(Seccion seccion) {
		super();
		this.seccion= seccion;
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Simular Asignatura/Listados/Ordenados por Cedula");
			{
				pnLisOrdeCedula = new JPanel();
				pnLisOrdeCedula.setLayout(null);
				getContentPane().add(pnLisOrdeCedula, BorderLayout.CENTER);
				pnLisOrdeCedula.setPreferredSize(new java.awt.Dimension(453, 340));
				pnLisOrdeCedula.setBackground(new java.awt.Color(173,219,231));
				pnLisOrdeCedula.setEnabled(false);
				{
					pnOrdCedula = new JPanel();
					pnOrdCedula.setLayout(null);
					pnLisOrdeCedula.add(pnOrdCedula);
					pnOrdCedula.setBounds(18, 12, 444, 276);
					pnOrdCedula.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
					pnOrdCedula.setBackground(new java.awt.Color(255,255,255));
					{
						lbSeccion = new JLabel();
						pnOrdCedula.add(lbSeccion);
						lbSeccion.setText("Sección:");
						lbSeccion.setBounds(22, 34, 77, 14);
						lbSeccion.setFont(new java.awt.Font("URW Chancery L",0,16));
					}
					{
						lbProfesor = new JLabel();
						pnOrdCedula.add(lbProfesor);
						lbProfesor.setText("Profesor:");
						lbProfesor.setBounds(155, 31, 77, 18);
						lbProfesor.setFont(new java.awt.Font("URW Chancery L",0,16));
					}
					{
						txtSeccion = new JTextField();
						pnOrdCedula.add(txtSeccion);
						txtSeccion.setBounds(74, 34, 53, 21);
						txtSeccion.setFont(new java.awt.Font("URW Chancery L",0,16));
						txtSeccion.setEditable(false);
					}
					{
						txtProfesor = new JTextField();
						pnOrdCedula.add(txtProfesor);
						txtProfesor.setBounds(244, 29, 114, 24);
						txtProfesor.setFont(new java.awt.Font("URW Chancery L",0,16));
						txtProfesor.setEditable(false);
					}
				}
				{
					btVerListado = new JButton();
					pnLisOrdeCedula.add(btVerListado);
					btVerListado.setText("Ver Listado");
					btVerListado.setBounds(18, 300, 140, 21);
					btVerListado.setFont(new java.awt.Font("URW Chancery L",0,16));
					btVerListado.setBackground(new java.awt.Color(255,255,255));
					btVerListado.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/application_view_list.png")));
					btVerListado.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btVerListadoActionPerformed(evt);
						}
					});
				}
				{
					btSalir = new JButton();
					pnLisOrdeCedula.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setBounds(356, 300, 106, 21);
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
					btarchivotexto = new JButton();
					pnLisOrdeCedula.add(btarchivotexto);
					btarchivotexto.setText("Generar Archivo");
					btarchivotexto.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/pencil.png")));
					btarchivotexto.setFont(new java.awt.Font("URW Chancery L",2,16));
					btarchivotexto.setBackground(new java.awt.Color(255,255,255));
					btarchivotexto.setBounds(163, 300, 182, 22);
					btarchivotexto.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							try {
								btarchivotextoActionPerformed(evt);
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					});
				}
			}
			pack();
			this.setSize(485, 371);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void btVerListadoActionPerformed(ActionEvent evt) {
		String[][] datos={{ "Cedula", "Nombre", "Apellido" }};
		String[] columnas={ "Cedula", "Nombre", "Apellido" };
		TableModel tbOrdCedulaModel = 	new DefaultTableModel(datos,columnas);
		tbOrdCedula = new JTable(tbOrdCedulaModel);
		Vector<Estudiante> auxiliar = new Vector<Estudiante>();
		pnOrdCedula.add(tbOrdCedula);
		tbOrdCedula.setModel(tbOrdCedulaModel);
		tbOrdCedula.setBounds(50, 86, 342, 126);
		tbOrdCedula.setFont(new java.awt.Font("URW Chancery L",2,16));
		String cedula;
		String num = Integer.toString(seccion.getNumero());
		txtSeccion.setText(num);
		auxiliar=this.seccion.OrdenarEstCedula();
		txtProfesor.setText(seccion.getProfesor().getNombre());
		for (int i=0;i<auxiliar.size();i++){
				cedula=Long.toString(auxiliar.get(i).getCedula());
				String[] newRow= {cedula,auxiliar.get(i).getNombre(),auxiliar.get(i).getApellido()};
				((DefaultTableModel) tbOrdCedulaModel).addRow(newRow);
		}
	}
	
	private void btSalirActionPerformed(ActionEvent evt) {
		dispose();
	}
	
	private void btarchivotextoActionPerformed(ActionEvent evt) throws IOException {
		Vector<Estudiante> auxiliar= new Vector<Estudiante>();
		auxiliar=seccion.OrdenarEstCedula();
		FileWriter fw = new FileWriter("Listado.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter salida = new PrintWriter(bw);
		salida.println("Listado de Estudiantes Ordenados por Cedula");
		salida.println();
		salida.println("Cedula		"+ "Nombre		"+ "Apellido		");
		for(int i=0; i<auxiliar.size(); i++){
			salida.println(auxiliar.get(i).getCedula()+"		"+auxiliar.get(i).getNombre()+"		"
							  +auxiliar.get(i).getApellido()+"			");
		}
		salida.close();
		mensaje.showMessageDialog(btarchivotexto, "Archivo Generado");
	}
}

