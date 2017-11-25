
public class Informe {
	private String fecha;
	
	public Informe() {
		fecha = "dd/mm/aaaa";
	}
	
	public Informe(String fecha) {
		this.fecha = fecha;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public void mostrarInforme() {
		System.out.println("Informe correspondiente al día " + fecha);
	}
	
	public boolean equals(Informe i) {
		return (fecha.equals(i.fecha));
	}
	
}
