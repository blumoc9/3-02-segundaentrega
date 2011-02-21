import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
public class formListEstAprob extends javax.swing.JFrame {
	private JPanel pnEstAprob;
	private Seccion seccion;
	private JPanel pnDatos;
	private JButton btVerList;
	private JButton btarchivotexto;
	private JButton btSalir;
	private JTextField txtProfesor;
	private JTextField txtSeccion;
	private JLabel lbProfesor;
	private JLabel lbSeccion;
	private JTable tbAprobados;
	private JOptionPane mensaje;

	public formListEstAprob(Seccion seccion) {
		super();
		this.seccion=seccion;
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Simular Asignatura/Listados/Aprobados");
			{
				pnEstAprob = new JPanel();
				getContentPane().add(pnEstAprob, BorderLayout.CENTER);
				pnEstAprob.setLayout(null);
				pnEstAprob.setBackground(new java.awt.Color(173,216,230));
				{
					pnDatos = new JPanel();
					pnEstAprob.add(pnDatos);
					pnDatos.setBounds(12, 17, 443, 208);
					pnDatos.setLayout(null);
					pnDatos.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
					pnDatos.setBackground(new java.awt.Color(255,255,255));
					{
						lbSeccion = new JLabel();
						pnDatos.add(lbSeccion);
						lbSeccion.setText("Seccion:");
						lbSeccion.setBounds(25, 26, 69, 15);
						lbSeccion.setFont(new java.awt.Font("URW Chancery L",2,16));
					}
					{
						lbProfesor = new JLabel();
						pnDatos.add(lbProfesor);
						lbProfesor.setText("Profesor:");
						lbProfesor.setBounds(157, 26, 83, 15);
						lbProfesor.setFont(new java.awt.Font("URW Chancery L",2,16));
					}
					{
						txtSeccion = new JTextField();
						pnDatos.add(txtSeccion);
						txtSeccion.setBounds(82, 24, 49, 22);
						txtSeccion.setEditable(false);
					}
					{
						txtProfesor = new JTextField();
						pnDatos.add(txtProfesor);
						txtProfesor.setBounds(240, 24, 132, 22);
						txtProfesor.setEditable(false);
					}
				}
				{
					btVerList = new JButton();
					pnEstAprob.add(btVerList);
					btVerList.setText("Ver Listado");
					btVerList.setBounds(14, 237, 148, 22);
					btVerList.setBackground(new java.awt.Color(255,255,255));
					btVerList.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/application_view_list.png")));
					btVerList.setFont(new java.awt.Font("URW Chancery L",2,16));
					btVerList.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btVerListActionPerformed(evt);
						}
					});
				}
				{
					btSalir = new JButton();
					pnEstAprob.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setBounds(355, 237, 100, 22);
					btSalir.setBackground(new java.awt.Color(255,255,255));
					btSalir.setFont(new java.awt.Font("URW Chancery L",2,16));
					btSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
					btSalir.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btSalirActionPerformed(evt);
						}
					});
				}
				{
					btarchivotexto = new JButton();
					pnEstAprob.add(btarchivotexto);
					btarchivotexto.setText("Generar Archivo");
					btarchivotexto.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/pencil.png")));
					btarchivotexto.setFont(new java.awt.Font("URW Chancery L",2,16));
					btarchivotexto.setBackground(new java.awt.Color(255,255,255));
					btarchivotexto.setBounds(169, 237, 177, 22);
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
			this.setSize(487, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void btVerListActionPerformed(ActionEvent evt) {
			String[][] datos={{ "Cedula", "Nombre", "Apellido","Nota Final" }};
			String[] columnas={ "Cedula", "Nombre", "Apellido","Nota Final" };
			TableModel tbAprobadosModel = 	new DefaultTableModel(datos,columnas);
			tbAprobados = new JTable(tbAprobadosModel);
			Vector<Estudiante> auxiliar = new Vector<Estudiante>();
			pnDatos.add(tbAprobados);
			tbAprobados.setModel(tbAprobadosModel);
			tbAprobados.setBounds(25, 77, 358, 102);
			tbAprobados.setFont(new java.awt.Font("URW Chancery L",2,16));
			String cedula,Nota;
			String num = Integer.toString(seccion.getNumero());
			txtSeccion.setText(num);
			auxiliar=seccion.ListadoEstuAprobados(auxiliar);
			txtProfesor.setText(seccion.getProfesor().getNombre());
			for (int i=0;i<auxiliar.size();i++){
				if(auxiliar.get(i).getNotafinal()!=-1){
					cedula=Long.toString(auxiliar.get(i).getCedula());
					Nota = Long.toString(auxiliar.get(i).getNotafinal());
					   String[] newRow= {cedula,auxiliar.get(i).getNombre(),auxiliar.get(i).getApellido(),Nota};
					   ((DefaultTableModel) tbAprobadosModel).addRow(newRow);
				}
			}
		}
	
	private void btSalirActionPerformed(ActionEvent evt) {
		dispose();
	}
	
	private void btarchivotextoActionPerformed(ActionEvent evt) throws IOException {
		Vector<Estudiante> auxiliar= new Vector<Estudiante>();
		auxiliar=seccion.ListadoEstuAprobados(auxiliar);
		FileWriter fw = new FileWriter("Listado.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter salida = new PrintWriter(bw);
		salida.println("Listado de Estudiantes Aprobados");
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

