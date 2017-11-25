
import java.util.Scanner;

public abstract class Pago {
	static Scanner sc = new Scanner(System.in);
	private float importe;
	
	public Pago() {
		importe = 0;
	}
	
	public Pago(float importe) {
		this.importe = importe;
	}
	
	public float getImporte() {
		return importe;
	}
	
	public void setImporte(float importe) {
		this.importe = importe;
	}
	
	public abstract void leer();
	
	public void mostrar() {
		System.out.println("El importe es: " + importe);
	}
	
}
