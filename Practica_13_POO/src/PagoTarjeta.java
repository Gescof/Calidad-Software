
public class PagoTarjeta extends Pago {

	private int numtarjeta;
	
	public PagoTarjeta() {
		numtarjeta = 0;
	}
	
	public PagoTarjeta(int numtarjeta) {
		this.numtarjeta = numtarjeta;
	}
	
	public int getNumTarjeta() {
		return numtarjeta;
	}
	
	public void setNumTarjeta(int numtarjeta) {
		this.numtarjeta = numtarjeta;
	}
	
	public void leer() {
		System.out.println("Introduzca el número de tarjeta");
		numtarjeta = sc.nextInt();
	}
	
	public void mostrar() {
		System.out.println("Pagado con tarjeta número " + numtarjeta);
	}
	
}
