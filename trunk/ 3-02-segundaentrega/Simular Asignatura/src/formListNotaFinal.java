import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.SwingUtilities;
import java.util.Vector;


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
public class formListNotaFinal extends javax.swing.JFrame {
	private JPanel pnListNotFinal;
	private JPanel pnDatos;
	private JButton btNotaFinal;
	private JButton btListaNota;
	private JButton btSalir;
	private JTextField txtProfesor;
	private JTextField txtSeccion;
	private JTable tbNotaFinal;
	private JLabel lbProfesor;
	private JLabel lbSeccion;
	private Seccion seccion;
	private JButton btarchivotexto;
	private JOptionPane mensaje;

	
	public formListNotaFinal(Seccion seccion) {
		super();
		this.seccion=seccion;
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Simular Asignatura/Listado/Ordenados por Nota Final");
			{
				pnListNotFinal = new JPanel();
				getContentPane().add(pnListNotFinal, BorderLayout.CENTER);
				pnListNotFinal.setLayout(null);
				pnListNotFinal.setBackground(new java.awt.Color(173,216,230));
				pnListNotFinal.setPreferredSize(new java.awt.Dimension(430, 270));
				{
					pnDatos = new JPanel();
					pnListNotFinal.add(pnDatos);
					pnDatos.setBounds(20, 12, 444, 256);
					pnDatos.setLayout(null);
					pnDatos.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
					pnDatos.setBackground(new java.awt.Color(255,255,255));
					{
						lbSeccion = new JLabel();
						pnDatos.add(lbSeccion);
						lbSeccion.setText("Seccion:");
						lbSeccion.setBounds(23, 46, 70, 15);
						lbSeccion.setFont(new java.awt.Font("URW Chancery L",2,16));
					}
					{
						lbProfesor = new JLabel();
						pnDatos.add(lbProfesor);
						lbProfesor.setText("Profesor:");
						lbProfesor.setBounds(169, 47, 70, 15);
						lbProfesor.setFont(new java.awt.Font("URW Chancery L",2,16));
					}
					{
						txtSeccion = new JTextField();
						pnDatos.add(txtSeccion);
						txtSeccion.setBounds(76, 45, 60, 21);
						txtSeccion.setEditable(false);
					}
					{
						txtProfesor = new JTextField();
						pnDatos.add(txtProfesor);
						txtProfesor.setBounds(231, 45, 175, 22);
						txtProfesor.setEditable(false);
					}
				}
				{
					btSalir = new JButton();
					pnListNotFinal.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setBounds(351, 279, 119, 24);
					btSalir.setFont(new java.awt.Font("URW Chancery L",2,16));
					btSalir.setBackground(new java.awt.Color(255,255,255));
					btSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
					btSalir.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							btSalirMouseClicked(evt);
							dispose();
						}
					});
				}
				{
					btListaNota = new JButton();
					pnListNotFinal.add(btListaNota);
					btListaNota.setText("Ver Listado");
					btListaNota.setBounds(26, 280, 146, 22);
					btListaNota.setFont(new java.awt.Font("URW Chancery L",2,16));
					btListaNota.setBackground(new java.awt.Color(255,255,255));
					btListaNota.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/application_view_list.png")));
					btListaNota.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btListaNotaActionPerformed(evt);
						}
					});
				}
				{
					btarchivotexto = new JButton();
					pnListNotFinal.add(btarchivotexto);
					btarchivotexto.setText("Generar Archivo");
					btarchivotexto.setBounds(177, 280, 169, 22);
					btarchivotexto.setFont(new java.awt.Font("URW Chancery L",2,16));
					btarchivotexto.setBackground(new java.awt.Color(255,255,255));
					btarchivotexto.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/pencil.png")));
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
			this.setSize(504, 350);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void btSalirMouseClicked(MouseEvent evt) {
		dispose();
	}
	
	private void btListaNotaActionPerformed(ActionEvent evt) {
		String[][] datos={{ "Cedula", "Nombre", "Apellido","Nota Final" }};
		String[] columnas={ "Cedula", "Nombre", "Apellido","Nota Final" };
		TableModel tbNotaFinalModel = 	new DefaultTableModel(datos,columnas);
		tbNotaFinal = new JTable(tbNotaFinalModel);
		Vector<Estudiante> auxiliar = new Vector<Estudiante>();
		pnDatos.add(tbNotaFinal);
		tbNotaFinal.setModel(tbNotaFinalModel);
		tbNotaFinal.setBounds(23, 109, 397, 123);
		tbNotaFinal.setFont(new java.awt.Font("URW Chancery L",2,16));
		String cedula,Nota;
		String num = Integer.toString(seccion.getNumero());
		txtSeccion.setText(num);
		auxiliar=seccion.OrdenarEstNota();
		txtProfesor.setText(seccion.getProfesor().getNombre());
		for (int i=0;i<auxiliar.size();i++){
			if(auxiliar.get(i).getNotafinal()!=-1){
				cedula=Long.toString(auxiliar.get(i).getCedula());
				Nota = Long.toString(auxiliar.get(i).getNotafinal());
				String[] newRow= {cedula,auxiliar.get(i).getNombre(),auxiliar.get(i).getApellido(),Nota};
				((DefaultTableModel) tbNotaFinalModel).addRow(newRow);
			}
		}
	}
	
	private void btarchivotextoActionPerformed(ActionEvent evt) throws IOException {
		seccion.OrdenarEstNota();
		FileWriter fw = new FileWriter("Listado.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter salida = new PrintWriter(bw);
		salida.println("Listado de Estudiantes por Nota Final");
		salida.println();
		salida.println("Cedula		"+ "Nombre		"+ "Apellido		");
		for(int i=0; i<seccion.getVectorestudiante().size(); i++){
			salida.println(seccion.getVectorestudiante().get(i).getCedula()+"		"+seccion.getVectorestudiante().get(i).getNombre()+"		"
							  +seccion.getVectorestudiante().get(i).getApellido()+"			");
		}
		salida.close();
		mensaje.showMessageDialog(btarchivotexto, "Archivo Generado");
	}
}