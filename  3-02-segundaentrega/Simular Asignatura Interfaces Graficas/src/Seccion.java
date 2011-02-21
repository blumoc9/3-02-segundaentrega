import java.util.Vector;

public class Seccion {
	private int numero;
	private Vector<Estudiante> vectorestudiante;
	private Profesor profesor;

	public Seccion() {
		super();
		this.vectorestudiante = new Vector<Estudiante>();
		this.numero = 1;
	}

	public Seccion(int numero, Vector<Estudiante> vectorestudiante,
			Profesor profesor) {
		super();
		this.numero = numero;
		this.vectorestudiante = vectorestudiante;
		this.profesor = profesor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Vector<Estudiante> getVectorestudiante() {
		return vectorestudiante;
	}

	public void setVectorestudiante(Vector<Estudiante> vectorestudiante) {
		this.vectorestudiante = vectorestudiante;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public void InscribirEstudiante(Estudiante estudiante) {
		this.vectorestudiante.add(estudiante);
	}

	public Estudiante BuscarEstuporCedula(long cedula) {
		int auxiliar = -1;
		for (int i = 0; i < this.vectorestudiante.size(); i++) {
			if (cedula == this.vectorestudiante.get(i).getCedula()) {
				auxiliar = i;
			}
		}
		if (auxiliar != -1)
			return vectorestudiante.get(auxiliar);
		else
			return null;
	}

	public Vector<Estudiante> ListadoEstuAprobados(Vector<Estudiante> auxiliar) {
		for (int i = 0; i < getVectorestudiante().size(); i++) {
			if (this.vectorestudiante.elementAt(i).getAprobado() == true)
				auxiliar.add(this.vectorestudiante.elementAt(i));
		}
		return auxiliar;
	}

	public void AplicarEvaluaciones() {
		for (int i = 0; i < this.vectorestudiante.size(); i++) {
			this.vectorestudiante.elementAt(i).PresentarEvaluaciones();
			this.profesor.EvaluarEstudiante(this.vectorestudiante.elementAt(i));
		}
	}

	public Vector<Estudiante> ListaAplazados(Vector<Estudiante> auxiliar) {
		for (int i = 0; i < this.vectorestudiante.size(); i++) {
			if ((this.vectorestudiante.elementAt(i).getAprobado() == false)&& (this.vectorestudiante.get(i).getNotafinal()!=-1)) {
				auxiliar.add(this.vectorestudiante.elementAt(i));
			}
		}
		return auxiliar;
	}

	public float PromedioNotas() {
		int sumanotas = 0;
		int contadorvector=0;
		for (int i = 0; i < this.vectorestudiante.size(); i++) {
			if(this.vectorestudiante.get(i).getNotafinal()!=-1){
				sumanotas += this.vectorestudiante.get(i).getNotafinal();
				++contadorvector;
			}
		}
		return sumanotas / contadorvector;
	}

	public void RetirarEstudiante(Estudiante estudiante) {
		this.vectorestudiante.remove(estudiante);
	}

	public Vector<Estudiante> OrdenarEstCedula() {
		Estudiante aux = new Estudiante();
		for (int i = 0; i < this.vectorestudiante.size(); i++) {
			for (int j = 0; j < this.vectorestudiante.size() - 1; j++) {
				if (this.vectorestudiante.get(i).getCedula() > this.vectorestudiante
						.get(j).getCedula()) {
					aux = this.vectorestudiante.get(j);
					this.vectorestudiante.set(j,
							this.vectorestudiante.get(j + 1));
					this.vectorestudiante.set(j + 1, aux);
				}
			}
		}
		return this.vectorestudiante;
	}

	public Vector<Estudiante> OrdenarEstNota() {
		Estudiante aux = new Estudiante();
		for (int i = 0; i < this.vectorestudiante.size(); i++) {
			for (int j = 0; j < this.vectorestudiante.size() - 1; j++) {
				if (this.vectorestudiante.get(i).getNotafinal() > this.vectorestudiante.get(j).getNotafinal()) {
					aux = this.vectorestudiante.get(j);
					this.vectorestudiante.set(j,this.vectorestudiante.get(j + 1));
					this.vectorestudiante.set(j + 1, aux);
				}
			}
		}
		return this.getVectorestudiante();
	}
	
	public void AplicarEvaluacionesSustitutiva() {
		for (int i = 0; i < this.vectorestudiante.size(); i++) {
			if ((this.vectorestudiante.elementAt(i).getAprobado() == false)&& (this.vectorestudiante.get(i).getNotafinal()!=-1)){
				this.vectorestudiante.elementAt(i).PresentarEvaluacionSustitutiva();
				this.profesor.EvaluarEstudianteSustitutiva(this.vectorestudiante.elementAt(i));
			}
		}
	}
	public Vector<Estudiante> ListaNotaSustitutiva() {
		Estudiante aux = new Estudiante();
		for (int i = 0; i < this.vectorestudiante.size(); i++) {
			for (int j = 0; j < this.vectorestudiante.size() - 1; j++) {
				if (this.vectorestudiante.get(i).getNotafinal() > this.vectorestudiante.get(j).getNotafinal()) {
					aux = this.vectorestudiante.get(j);
					this.vectorestudiante.set(j,this.vectorestudiante.get(j + 1));
					this.vectorestudiante.set(j + 1, aux);
				}
			}
		}
		return this.getVectorestudiante();
	}
}
