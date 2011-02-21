
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
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
public class formPromNotas extends javax.swing.JFrame {
	private JPanel pnPromNotas; //ojo
	private JPanel pnProme; //ojo
	private JButton btPromedio; 
	private JTable tbPromNotas;
	private JButton btSalir; //ojo
	private JTextField txtPromeNotas; //ojo
	private JLabel lpPromNotas; //ojo
	private Seccion seccion; //ojo

	/**
	* Auto-generated main method to display this JFrame
	*/
	
	public formPromNotas(Seccion seccion) {
		super();
		this.seccion = seccion;
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Simular Asignatura/Promedio de Notas");
			{
				pnPromNotas = new JPanel();
				pnPromNotas.setLayout(null);
				getContentPane().add(pnPromNotas, BorderLayout.CENTER);
				pnPromNotas.setBackground(new java.awt.Color(173,216,230));
				{
					pnProme = new JPanel();
					pnPromNotas.add(pnProme);
					pnProme.setBounds(18, 12, 472, 246);
					pnProme.setLayout(null);
					pnProme.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
					pnProme.setBackground(new java.awt.Color(255,255,255));
					{
						lpPromNotas = new JLabel();
						pnProme.add(lpPromNotas);
						lpPromNotas.setText("Promedio de Notas");
						lpPromNotas.setBounds(13, 25, 179, 14);
						lpPromNotas.setFont(new java.awt.Font("URW Chancery L",0,16));
					}
					{
						txtPromeNotas = new JTextField();
						pnProme.add(txtPromeNotas);
						txtPromeNotas.setBounds(137, 21, 125, 23);
						txtPromeNotas.setFont(new java.awt.Font("URW Chancery L",0,16));
						txtPromeNotas.setEditable(false);
					}
					/*{
						TableModel tbPromNotasModel = new DefaultTableModel(
									new String[][] { { "Cedula", "Nombre", "Apellido", "Nota Final" } },
									new String[] { "Cedula", "Nombre", "Apellido", "Nota Final"  });
						tbPromNotas = new JTable();
						pnProme.add(tbPromNotas);
						tbPromNotas.setModel(tbPromNotasModel);
						tbPromNotas.setBounds(19, 25, 323, 73);
						tbPromNotas.setFont(new java.awt.Font("URW Chancery L",0,16));
						tbPromNotas = new JTable(tbPromNotasModel);
						tbPromNotas.setModel(tbPromNotasModel);
						tbPromNotas.setBounds(51, 100, 249, 70);
						tbPromNotas.setFont(new java.awt.Font("URW Chancery L",2,16));
						String cedula;
						for (int i=0;i<seccion.getVectorestudiante().size();i++){
							if(seccion.getVectorestudiante().get(i).getNotafinal()!=-1){
								cedula=Long.toString(seccion.getVectorestudiante().get(i).getCedula());
								String[] newRow= {cedula,seccion.getVectorestudiante().get(i).getNombre(),seccion.getVectorestudiante().get(i).getApellido()};
								((DefaultTableModel) tbPromNotasModel).addRow(newRow);
							}
						}
					}*/
				}
				{
					btPromedio = new JButton();
					pnPromNotas.add(btPromedio);
					btPromedio.setText("Promediar Notas");
					btPromedio.setBounds(22, 286, 176, 28);
					btPromedio.setFont(new java.awt.Font("URW Chancery L",0,16));
					btPromedio.setBackground(new java.awt.Color(255,255,255));
					btPromedio.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/calculator_edit.png")));
					btPromedio.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btPromedioActionPerformed(evt);
						}
					});
				}
				{
					btSalir = new JButton();
					pnPromNotas.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setBounds(374, 287, 116, 27);
					btSalir.setFont(new java.awt.Font("URW Chancery L",0,16));
					btSalir.setBackground(new java.awt.Color(255,255,255));
					btSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
					btSalir.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btSalirActionPerformed(evt);
						}
					});
				}
			}
			pack();
			this.setSize(520, 361);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void btSalirActionPerformed(ActionEvent evt) {
		dispose();
	}
	
	private void btPromedioActionPerformed(ActionEvent evt) {
		String promedio;
		promedio= Float.toString(seccion.PromedioNotas());
		txtPromeNotas.setText(promedio);
		TableModel tbPromNotasModel = new DefaultTableModel(
				new String[][] { { "Cedula", "Nombre", "Apellido", "Nota Final" } },
				new String[] { "Cedula", "Nombre", "Apellido", "Nota Final"  });
		tbPromNotas = new JTable();
		pnProme.add(tbPromNotas);
		tbPromNotas.setModel(tbPromNotasModel);
		tbPromNotas.setBounds(13, 70, 432, 129);
		tbPromNotas.setFont(new java.awt.Font("URW Chancery L",0,16));
		tbPromNotas = new JTable(tbPromNotasModel);
		tbPromNotas.setModel(tbPromNotasModel);
		tbPromNotas.setBounds(51, 100, 249, 70);
		tbPromNotas.setFont(new java.awt.Font("URW Chancery L",2,16));
		String cedula,nota;
		for (int i=0;i<seccion.getVectorestudiante().size();i++){
			if(seccion.getVectorestudiante().get(i).getNotafinal()!=-1){
				cedula=Long.toString(seccion.getVectorestudiante().get(i).getCedula());
				nota=Integer.toString(seccion.getVectorestudiante().get(i).getNotafinal());
				String[] newRow= {cedula,seccion.getVectorestudiante().get(i).getNombre(),seccion.getVectorestudiante().get(i).getApellido(),nota};
				((DefaultTableModel) tbPromNotasModel).addRow(newRow);
			}
		}
	}
}
