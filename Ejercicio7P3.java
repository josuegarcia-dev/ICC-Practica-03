import java.util.Scanner;
public static void main(String[] args) {	
	Scanner scan=new Scanner(System.in);
	System.out.println("Ingrese una cadena: ");
	String cadena=scan.nextLine();
	System.out.println("Ingrese una subcadena a remplazar: ");
	String buscado=scan.nextLine();
	System.out.println("Ingrese un remplazo");
	String remp=scan.nextLine();
	String resultado=Remplazar(cadena, buscado, remp);
	System.out.println(resultado);
	scan.close();
}
public static String Remplazar(String cdn, String bus, String rem) {
	if(cdn.contains(bus)!=true) {
		String resp="NO existe esa subcadena";
		return resp;
	}
	StringBuilder resultado=new StringBuilder();
	int indiceInicio=0;
	int indiceBuscado;
	while ((indiceBuscado=cdn.indexOf(bus, indiceInicio))!=-1){
		 resultado.append(cdn.substring(indiceInicio, indiceBuscado));
		 resultado.append(rem);
		 indiceInicio=indiceBuscado+bus.length();
	}
		resultado.append(cdn.substring(indiceInicio));
	return resultado.toString();
}
