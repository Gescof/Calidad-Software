
public class PagoEfectivo extends Pago {
	private float cantidad, vueltas;
	
	public PagoEfectivo() {
		cantidad = vueltas = 0;
	}
	
	public PagoEfectivo(float cantidad, float vueltas) {
		this.cantidad = cantidad;
		this.vueltas = vueltas;
	}
	
	public float getCantidad() {
		return cantidad;
	}
	
	public float getVueltas() {
		return vueltas;
	}
	
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	
	public void setVueltas(float vueltas) {
		this.vueltas = vueltas;
	}
	
	public void leer() {
		System.out.println("Introduzca el dinero para el pago");
		cantidad = sc.nextFloat();
		while(cantidad < getImporte()) {
			System.out.println("La cantidad introducida es menor que el pago, introduzca otra");
			cantidad = sc.nextFloat();
		}
	}
	
	public void mostrar() {
		System.out.println("Pagado en efectivo, entrega: " + cantidad + " , vuelta: "  + (cantidad - getImporte()));
	}
	
}
