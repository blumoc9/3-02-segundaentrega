import java.util.Vector;
import java.util.Random;

public class Estudiante extends Persona implements Evaluado{
	private Vector<Integer> vectornota=new Vector<Integer>();
	private int notafinal;
	private boolean aprobado;
	
	public Estudiante() {
		super();
		this.notafinal=-1;
		// TODO Auto-generated constructor stub
	}
	
	public Estudiante(long cedula, String nombre, String apellido) {
		super(cedula, nombre, apellido);
		// TODO Auto-generated constructor stub
	}

	public Vector<Integer> getVectornota() {
		return vectornota;
	}

	public void setVectornota(Vector<Integer> vectornota) {
		this.vectornota = vectornota;
	}

	public int getNotafinal() {
		return notafinal;
	}

	public void setNotafinal(int notafinal) {
		this.notafinal = notafinal;
	}

	public boolean getAprobado() {
		return aprobado;
	}

	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}
	
	public void PresentarEvaluaciones() {
		Random nota = new Random();
		for (int i=0; i<3; i++){ 
			this.vectornota.addElement(nota.nextInt(20));
		}
	}
	public void PresentarEvaluacionSustitutiva(){
		Random nota = new Random();
		int i=0;
		//for(int i=0; i<3; i++){
			if((this.vectornota.elementAt(i)<this.vectornota.elementAt(i+1))&& (this.vectornota.elementAt(i)<this.vectornota.elementAt(i+2)))
				this.vectornota.add(i, nota.nextInt(20));
			else
				if ((this.vectornota.elementAt(i+1)<this.vectornota.elementAt(i))&& (this.vectornota.elementAt(i+1)<this.vectornota.elementAt(i+2)))
					this.vectornota.add(i+1, nota.nextInt(20));
				else
					if ((this.vectornota.elementAt(i+2)<this.vectornota.elementAt(i))&& (this.vectornota.elementAt(i+2)<this.vectornota.elementAt(i+1)))
						this.vectornota.add(i+2, nota.nextInt(20));	
		//}
	}
	
}
