import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
public class formHome extends javax.swing.JFrame {
	private JMenuBar mnuPantalla;
	private JMenu jMenu1;
	private JMenuItem mnuListEstAplazados;
	private JMenuItem mnuListOrdCedula;
	private JMenuItem mnuLisEstAprob;
	private JMenu mnuSalir;
	private JPanel pnImagen;
	private JMenuItem mnuSecAsigProf;
	private JMenuItem mnuListOrdNotFinal;
	private JMenu mnuListEstudiante;
	private JMenuItem mnuPromeNotas;
	private JMenuItem mnuSecApliEva;
	private JMenuItem mnuRetEstudiante;
	private JMenuItem mnuSecBusEst;
	private JMenuItem mnuSecInsEst;
	private  Seccion seccion; //ojo
	private JOptionPane mensaje;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				formHome inst = new formHome();
				Seccion seccion = new Seccion();
				inst.seccion=seccion;
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public formHome() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Simular Seccion de Laboratorio I 2010-II");
			{
				pnImagen = new JPanel();
				getContentPane().add(pnImagen, BorderLayout.CENTER);
				pnImagen.setLayout(null);
				pnImagen.setBackground(new java.awt.Color(173,216,230));
			}
			{
				mnuPantalla = new JMenuBar();
				setJMenuBar(mnuPantalla);
				mnuPantalla.setBackground(new java.awt.Color(255,255,255));
				{
					jMenu1 = new JMenu();
					mnuPantalla.add(jMenu1);
					jMenu1.setText("Seccion");
					{
						mnuSecAsigProf = new JMenuItem();
						jMenu1.add(mnuSecAsigProf);
						mnuSecAsigProf.setText("Asignar Profesor");
						mnuSecAsigProf.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/add.png")));
						mnuSecAsigProf.addMouseListener(new MouseAdapter() {
							public void mousePressed(MouseEvent evt) {
								mnuSecAsigProfMousePressed(evt);
							}
						});
					}
					{
						mnuSecInsEst = new JMenuItem();
						jMenu1.add(mnuSecInsEst);
						mnuSecInsEst.setText("Inscribir Estudiante");
						mnuSecInsEst.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/user_add.png")));
						mnuSecInsEst.addMouseListener(new MouseAdapter() {
							public void mousePressed(MouseEvent evt) {
								mnuSecInsEstMousePressed(evt);
							}
						});
					}
					{
						mnuSecBusEst = new JMenuItem();
						jMenu1.add(mnuSecBusEst);
						mnuSecBusEst.setText("Buscar Estudiante");
						mnuSecBusEst.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/zoom.png")));
						mnuSecBusEst.addMouseListener(new MouseAdapter() {
							public void mousePressed(MouseEvent evt) {
								mnuSecBusEstMousePressed(evt);
							}
						});
					}
					{
						mnuRetEstudiante = new JMenuItem();
						jMenu1.add(mnuRetEstudiante);
						mnuRetEstudiante.setText("Retirar Estudiante");
						mnuRetEstudiante.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/user_delete.png")));
						mnuRetEstudiante.addMouseListener(new MouseAdapter() {
							public void mousePressed(MouseEvent evt) {
								mnuRetEstudianteMousePressed(evt);
							}
						});
					}
					{
						mnuSecApliEva = new JMenuItem();
						jMenu1.add(mnuSecApliEva);
						mnuSecApliEva.setText("Aplicar Evaluaciones");
						mnuSecApliEva.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/building_edit.png")));
						mnuSecApliEva.addMouseListener(new MouseAdapter() {
							public void mousePressed(MouseEvent evt) {
								mnuSecApliEvaMousePressed(evt);
							}
						});
					}
					{
						mnuPromeNotas = new JMenuItem();
						jMenu1.add(mnuPromeNotas);
						mnuPromeNotas.setText("Promedio de Notas");
						mnuPromeNotas.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/calculator_edit.png")));
						mnuPromeNotas.addMouseListener(new MouseAdapter(){
							public void mousePressed(MouseEvent evt){
								mnuPromeNotasMousePressed(evt);
							}
						});
					}
					{
						mnuListEstudiante = new JMenu();
						jMenu1.add(mnuListEstudiante);
						mnuListEstudiante.setText("Listado de Estudiantes");
						mnuListEstudiante.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/report_user.png")));
						{
							mnuListOrdNotFinal = new JMenuItem();
							mnuListEstudiante.add(mnuListOrdNotFinal);
							mnuListOrdNotFinal.setText("Ordenado por Nota Final");
							mnuListOrdNotFinal.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/application_side_list.png")));
							mnuListOrdNotFinal.addMouseListener(new MouseAdapter() {
								public void mousePressed(MouseEvent evt) {
									mnuListOrdNotFinalMousePressed(evt);
								}
							});
						}
						{
							mnuListOrdCedula = new JMenuItem();
							mnuListEstudiante.add(mnuListOrdCedula);
							mnuListOrdCedula.setText("Ordenado por Cedula");
							mnuListOrdCedula.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/application_tile_horizontal.png")));
							mnuListOrdCedula.addMouseListener(new MouseAdapter() {
								public void mousePressed(MouseEvent evt) {
									mnuListOrdCedulaMousePressed(evt);
								}
							});
						}
						{
							mnuLisEstAprob = new JMenuItem();
							mnuListEstudiante.add(mnuLisEstAprob);
							mnuLisEstAprob.setText("Aprobados");
							mnuLisEstAprob.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/thumb_up.png")));
							mnuLisEstAprob.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									mnuLisEstAprobActionPerformed(evt);
								}
							});
						}
						{
							mnuListEstAplazados = new JMenuItem();
							mnuListEstudiante.add(mnuListEstAplazados);
							mnuListEstAplazados.setText("Aplazados");
							mnuListEstAplazados.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/thumb_down.png")));
							mnuListEstAplazados.addMouseListener(new MouseAdapter() {
								public void mousePressed(MouseEvent evt) {
									mnuListEstAplazadosMousePressed(evt);
								}
							});
						}
					}
				}
				{
					mnuSalir = new JMenu();
					mnuPantalla.add(mnuSalir);
					mnuSalir.setText("Salir");
					mnuSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door.png")));
					mnuSalir.addMouseListener(new MouseAdapter() {
						public void mousePressed(MouseEvent evt) {
							mnuSalirMousePressed(evt);
						}
					});
				}
			}
			pack();
			this.setSize(672, 426);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void mnuSecInsEstMousePressed(MouseEvent evt) {
		formInsEst inst = new formInsEst(seccion);
		inst.setLocationRelativeTo(null);
		inst.setVisible(true);
	}
	
	private void mnuSecBusEstMousePressed(MouseEvent evt) {
		if(seccion.getVectorestudiante().size()!=0){
			formBusEst inst = new formBusEst(seccion);
			inst.setLocationRelativeTo(null);
			inst.setVisible(true);
		}
		else {
			mensaje.showMessageDialog(mnuSecBusEst, "No hay Estudiantes Inscritos");
		}
	}
	
	private void mnuSecAsigProfMousePressed(MouseEvent evt) {
		formAsigProf inst = new formAsigProf(seccion);
		inst.setLocationRelativeTo(null);
		inst.setVisible(true);
	}
	
	private void mnuRetEstudianteMousePressed(MouseEvent evt) {
		if(seccion.getVectorestudiante().size()!=0){
			formBusEst inst = new formBusEst(seccion);
			inst.getBtCancelar().setVisible(false);
			inst.setTitle("Simular Asignatura/Retirar Estudiante");
			inst.setLocationRelativeTo(null);
			inst.setVisible(true);
			inst.getBtRetirar().setVisible(true);
		}
		else {
			mensaje.showMessageDialog(mnuSecApliEva, "No hay Estudiantes Inscritos");
		}
		
	}
	
	private void mnuSecApliEvaMousePressed(MouseEvent evt) {
		if(seccion.getProfesor()!=null){
			if(seccion.getVectorestudiante().size()!=0){
					formApliEvaluacion inst = new formApliEvaluacion(seccion);
					inst.setLocationRelativeTo(null);
					inst.setVisible(true);
			}
			else {
				mensaje.showMessageDialog(mnuSecApliEva, "No hay Estudiantes Inscritos");
			}
		}
		else {
			mensaje.showMessageDialog(mnuSecApliEva, "No hay Profesor Asignado a la Seccion");
		}
	}
	
	private void mnuPromeNotasMousePressed(MouseEvent evt) {
		if(seccion.getProfesor()!=null){
			if(seccion.getVectorestudiante().size()!=0){
				if(seccion.getVectorestudiante().get(0).getNotafinal()!=-1){
					formPromNotas inst = new formPromNotas(seccion);
					inst.setLocationRelativeTo(null);
					inst.setVisible(true);
				}
				else {
					mensaje.showMessageDialog(mnuPromeNotas, "No se ha Apliacdo la Evaluacion");
				}
			}
			else {
				mensaje.showMessageDialog(mnuPromeNotas, "No hay Estudiantes Inscritos");
			}
		}
		else {
		 mensaje.showMessageDialog(mnuPromeNotas, "No hay Profesor Asignado a la Seccion");
		}
	}
	
	private void mnuListOrdNotFinalMousePressed(MouseEvent evt) {
		if (seccion.getProfesor()!=null){
			if(seccion.getVectorestudiante().size()!=0){
				boolean presentaron=false,presento;
				for(int i=0;i<seccion.getVectorestudiante().size();i++){
					if(seccion.getVectorestudiante().get(i).getNotafinal()!=-1)
						presento=true;
					else
						presento=false;
					presentaron=(presentaron||presento);
				}
				if(presentaron){
					formListNotaFinal inst = new formListNotaFinal(seccion);
					inst.setLocationRelativeTo(null);
					inst.setVisible(true);
				}
				else
					mensaje.showMessageDialog(mnuListOrdNotFinal, "Ningun Estudiante ha Presentado");
			}
			else
				mensaje.showMessageDialog(mnuListOrdNotFinal, "No hay Estudiantes Inscritos");
		}
		else
			mensaje.showMessageDialog(mnuListOrdNotFinal, "No hay Asignado Profesor");
		
	}
	
	private void mnuSalirMousePressed(MouseEvent evt) {
		dispose();
	}
	
	private void mnuLisEstAprobActionPerformed(ActionEvent evt) {
		if (seccion.getProfesor()!=null){
			if(seccion.getVectorestudiante().size()!=0){
				Vector <Estudiante> auxiliarApro = new Vector<Estudiante>();
				seccion.ListadoEstuAprobados(auxiliarApro);
					boolean presentaron=false,presento;
					for(int i=0;i<seccion.getVectorestudiante().size();i++){
						if(seccion.getVectorestudiante().get(i).getNotafinal()!=-1)
							presento=true;
						else
							presento=false;
						presentaron=(presentaron||presento);
					}
					if(presentaron){
						if(auxiliarApro.size()!=0){
							formListEstAprob inst = new formListEstAprob(seccion);
							inst.setLocationRelativeTo(null);
							inst.setVisible(true);
						}
						else
							mensaje.showMessageDialog(mnuLisEstAprob, "No hay Estudiantes Aprobados");
					}
					else
						mensaje.showMessageDialog(mnuLisEstAprob, "Ningun Estudiante ha Presentado");
			}
			else
				mensaje.showMessageDialog(mnuLisEstAprob, "No hay Estudiantes Inscritos");
		}
		else
			mensaje.showMessageDialog(mnuLisEstAprob, "No hay Asignado Profesor");	
}
	
	private void mnuListOrdCedulaMousePressed(MouseEvent evt) {
		if (seccion.getProfesor()!=null){
			if (seccion.getVectorestudiante().size()!=0){
				formListOrdCedula inst = new formListOrdCedula(seccion);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);	
			}
			else
				mensaje.showMessageDialog(mnuListOrdCedula, "No hay Estudiantes Inscritos");
		}
		else
			mensaje.showMessageDialog(mnuListOrdCedula, "No hay Asignado Profesor");
	}
	
	private void mnuListEstAplazadosMousePressed(MouseEvent evt) {
		if (seccion.getProfesor()!=null){
			if(seccion.getVectorestudiante().size()!=0){
				Vector <Estudiante> auxiliarApro = new Vector<Estudiante>();
				seccion.ListaAplazados(auxiliarApro);
					boolean presentaron=false,presento;
					for(int i=0;i<seccion.getVectorestudiante().size();i++){
						if(seccion.getVectorestudiante().get(i).getNotafinal()!=-1)
							presento=true;
						else
							presento=false;
						presentaron=(presentaron||presento);
					}
					if(presentaron){
						if(auxiliarApro.size()!=0){
							formListEstuAplaz inst = new formListEstuAplaz(seccion);
							inst.setLocationRelativeTo(null);
							inst.setVisible(true);
						}
						else
							mensaje.showMessageDialog(mnuListEstAplazados, "No hay Estudiantes Aplazados");
					}
					else
						mensaje.showMessageDialog(mnuListEstAplazados, "Ningun Estudiante ha Presentado");
			}
			else
				mensaje.showMessageDialog(mnuListEstAplazados, "No hay Estudiantes Inscritos");
		}
		else
			mensaje.showMessageDialog(mnuListEstAplazados, "No hay Asignado Profesor");	
}
}

