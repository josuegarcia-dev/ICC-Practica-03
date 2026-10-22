import java.util.Scanner;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Dime cual cadena quieres que le elimine los caracteres duplicados: ");
		String cadena=scan.nextLine();
		cadena=NoSe(cadena);
		System.out.println(cadena);
		scan.close();
	}

public static String NoSe(String sc1) {
	int ndec=sc1.length();
	String resultado="";
	for(int i=0;i<ndec;i++) {
		if(resultado.indexOf(sc1.charAt(i))!=-1) continue;
		resultado+=sc1.charAt(i);	
	}
	return resultado;
}
//Ahora explicare cómo detecte los caracteres que ya aparecieron y cuántos recorridos realiza mi solución.
//Primero tuve que recorrer con un bucle for la cadena que se solicitaba, inicialice un String vacio para concatenar cada 
//letra al resultado, metí un if donde si la letra que analizaba el ciclo for en ese momento ya estaba en la cadena resultado,
//brincaba a la siguente letra sin almacenar en resultado el caracter en ese momento, asi retornando al metodo main la cadena
//ya trabajada. Me oblige a usar una clase a la que bautice NoSe para acostumbrarme al trabajo con clases.
