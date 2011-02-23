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
public class formListEstuAplaz extends javax.swing.JFrame {
	private JPanel pnListAplazados;
	private JButton btarchivo;
	private JButton btSalir;
	private JButton btVerListado;
	private JTable tbListAplazados;
	private JTextField txtProfesor;
	private JTextField txtSeccion;
	private JLabel lbProfesor;
	private JLabel lbSeccion;
	private JPanel pnDatos;
	private Seccion seccion;
	private JOptionPane mensaje;
	
	public formListEstuAplaz(Seccion seccion) {
		super();
		this.seccion= seccion;
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Simular Asignatura/Listados/Aplazados");
			{
				pnListAplazados = new JPanel();
				getContentPane().add(pnListAplazados, BorderLayout.CENTER);
				pnListAplazados.setLayout(null);
				pnListAplazados.setBackground(new java.awt.Color(173,219,231));
				{
					pnDatos = new JPanel();
					pnDatos.setLayout(null);
					pnListAplazados.add(pnDatos);
					pnDatos.setBounds(19, 15, 456, 270);
					pnDatos.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
					pnDatos.setBackground(new java.awt.Color(255,255,255));
					{
						lbSeccion = new JLabel();
						pnDatos.add(lbSeccion);
						lbSeccion.setText("Sección:");
						lbSeccion.setBounds(28, 33, 51, 14);
						lbSeccion.setFont(new java.awt.Font("URW Chancery L",0,16));
					}
					{
						lbProfesor = new JLabel();
						pnDatos.add(lbProfesor);
						lbProfesor.setText("Profesor:");
						lbProfesor.setBounds(166, 33, 56, 14);
						lbProfesor.setFont(new java.awt.Font("URW Chancery L",0,16));
					}
					{
						txtSeccion = new JTextField();
						pnDatos.add(txtSeccion);
						txtSeccion.setBounds(79, 31, 47, 20);
						txtSeccion.setFont(new java.awt.Font("URW Chancery L",0,16));
						txtSeccion.setEditable(false);
					}
					{
						txtProfesor = new JTextField();
						pnDatos.add(txtProfesor);
						txtProfesor.setBounds(222, 30, 160, 21);
						txtProfesor.setFont(new java.awt.Font("URW Chancery L",0,16));
						txtProfesor.setEditable(false);
					}
				}
				{
					btVerListado = new JButton();
					pnListAplazados.add(btVerListado);
					btVerListado.setText("Ver Listado");
					btVerListado.setBounds(19, 300, 138, 21);
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
					pnListAplazados.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setBounds(366, 300, 103, 21);
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
					btarchivo = new JButton();
					pnListAplazados.add(btarchivo);
					btarchivo.setText("Generar Archivo");
					btarchivo.setBounds(168, 300, 180, 22);
					btarchivo.setBackground(new java.awt.Color(255,255,255));
					btarchivo.setFont(new java.awt.Font("URW Chancery L",2,16));
					btarchivo.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/pencil.png")));
					btarchivo.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							try {
								btarchivoActionPerformed(evt);
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					});
				}
			}
			pack();
			this.setSize(504, 365);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void btVerListadoActionPerformed(ActionEvent evt) {
		String[][] datos={{ "Cedula", "Nombre", "Apellido","Nota Final" }};
		String[] columnas={ "Cedula", "Nombre", "Apellido","Nota Final" };
		TableModel tbListAplazadosModel = 	new DefaultTableModel(datos,columnas);
		tbListAplazados = new JTable(tbListAplazadosModel);
		Vector<Estudiante> auxiliar = new Vector<Estudiante>();
		pnDatos.add(tbListAplazados);
		tbListAplazados.setModel(tbListAplazadosModel);
		tbListAplazados.setBounds(23, 77, 402, 134);
		tbListAplazados.setFont(new java.awt.Font("URW Chancery L",2,16));
		String cedula,Nota,Estado;
		String num = Integer.toString(seccion.getNumero());
		txtSeccion.setText(num);
		auxiliar=seccion.ListaAplazados(auxiliar);
		txtProfesor.setText(seccion.getProfesor().getNombre());
		for (int i=0;i<auxiliar.size();i++){
			if(auxiliar.get(i).getNotafinal()!=-1){
				cedula=Long.toString(auxiliar.get(i).getCedula());
				Nota = Float.toString(auxiliar.get(i).getNotafinal());
				   String[] newRow= {cedula,auxiliar.get(i).getNombre(),auxiliar.get(i).getApellido(),Nota};
				   ((DefaultTableModel) tbListAplazadosModel).addRow(newRow);
			}
		}
	}
	
	private void btSalirActionPerformed(ActionEvent evt) {
		dispose();
	}
	
	private void btarchivoActionPerformed(ActionEvent evt) throws IOException {
		Vector<Estudiante> auxiliar= new Vector<Estudiante>();
		auxiliar=seccion.ListaAplazados(auxiliar);
		FileWriter fw = new FileWriter("Listado.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter salida = new PrintWriter(bw);
		salida.println("Listado de Estudiantes Aplazados");
		salida.println();
		salida.println("Cedula		"+ "Nombre		"+ "Apellido		");
		for(int i=0; i<auxiliar.size(); i++){
			salida.println(auxiliar.get(i).getCedula()+"		"+auxiliar.get(i).getNombre()+"		"
							  +auxiliar.get(i).getApellido()+"			");
		}
		salida.close();
		mensaje.showMessageDialog(btarchivo, "Archivo Generado");
	}
}
