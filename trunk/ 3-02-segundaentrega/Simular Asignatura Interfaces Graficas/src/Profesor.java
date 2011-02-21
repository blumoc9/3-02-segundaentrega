
public class Profesor extends Persona implements Evaluar{

	private String titulo;

	public Profesor() {
		super();
	}

	public Profesor(long cedula, String nombre, String apellido, String titulo) {
		super(cedula, nombre, apellido);
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void EvaluarEstudiante(Estudiante estudiante) {
		int sumanotas = 0;
		for (int i=0; i<estudiante.getVectornota().size(); i++) {
			sumanotas = +estudiante.getVectornota().elementAt(i); 	
		}
		estudiante.setNotafinal(sumanotas);
		if (sumanotas<10)
			estudiante.setAprobado(false);
		else 
			estudiante.setAprobado(true);
	}
	
	public void EvaluarEstudianteSustitutiva(Estudiante estudiante) {
		int sumanotas = 0;
		for (int i=0; i<estudiante.getVectornota().size(); i++) {
			if(estudiante.getNotafinal()<10)
			sumanotas = +estudiante.getVectornota().elementAt(i); 	
		}
		estudiante.setNotafinal(sumanotas);
		if (sumanotas<10)
			estudiante.setAprobado(false);
		else 
			estudiante.setAprobado(true);
	}
}
