package operaArray;


public class Array {
	
	private static int numeroArra[]= new int[10];
	
	public static void main(String[] args) {
		meterValoresArray();
		imprimirArray();
	}
	
	public static void meterValoresArray() {
		
		for(int i=0;i<numeroArra.length;i++) {
			int numero=(int) Math.round(Math.random()*100);
			numeroArra[i]=numero;
			System.out.println("["+i+"]" +numeroArra[i]);
		}
	}
	
	public static void imprimirArray() {
		for(int i=0;i<numeroArra.length;i++) {
			System.out.println("["+i+"]" +numeroArra[i]);
		}
	}
	
	public static void metodo2() {
		
		//convierte el i=0; en un cero
		for (int i=0;i<numeroArra.length;i++) {
			if (i==0) {
				numeroArra[i]=numeroArra[i]*0;
			}
		}
		System.out.println("Array metodo 2");
	}
}
