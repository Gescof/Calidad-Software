
import java.util.ArrayList;
import java.util.Scanner;

public class Caja {
	static Scanner sc = new Scanner(System.in);
	private ArrayList<Informe> info;
	private Pago pago;
	
	public Caja() {
		info = new ArrayList<Informe>();
	}
	
	public void generarCaja() {
		char fin;
		float importe;
		do {
			System.out.println("Introduzca la fecha (dd/mm/aaaa)");
			info.add(new Informe(sc.next()));
			System.out.println("Introduzca el importe de la compra");
			importe = sc.nextFloat();
			char modo;
			do {
				System.out.println("¿Modo de pago? (T tarjeta; E efectivo) ");
				modo = sc.next().charAt(0);
				if(modo == 'T' || modo == 't')
					pago = new PagoTarjeta();
				else if(modo == 'E' || modo == 'e')
					pago = new PagoEfectivo();
				else System.out.println("Opción incorrecta");
			} while((modo != 'T' && modo != 't') && (modo != 'E' && modo != 'e'));
			pago.setImporte(importe);
			pago.leer();
			char confirm;
			do {
				System.out.println("El importe es: " + pago.getImporte());
				System.out.println("¿Confirma? (S/N)");
				confirm = sc.next().charAt(0);
				if((confirm != 'N' && confirm != 'n') && (confirm != 'S' && confirm != 's'))
					System.out.println("Opción incorrecta");
			} while(confirm != 'S' && confirm != 's');
			System.out.println("------------------------------------");
			System.out.println("Ticket correspondiente a esta compra");
			pago.mostrar();
			System.out.println("------------------------------------");
			do {
				System.out.println("¿Otra compra? (S/N)");
				fin = sc.next().charAt(0);
				if((fin != 'N' && fin != 'n') && (fin != 'S' && fin != 's'))
					System.out.println("Opción incorrecta");
			} while(fin != 'S' && fin != 's');
		} while(fin != 'S' || fin != 's');
		System.out.println("------------------------------------");
		for(int i = 0; i < info.size()-1; i++) {
			Informe aux = info.get(i);
			if(aux.equals(info.indexOf(i+1)))
				aux.mostrarInforme();
			else aux.mostrarInforme();
			System.out.println("Pago número " + (i+1));
			System.out.println("Importe: " + pago.getImporte());
		}
	}
	
}
