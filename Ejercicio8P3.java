import java.util.Scanner;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingresa cadena por invertir: ");
		String cadena=scan.nextLine();
		StringBuilder cadenaSB =new StringBuilder(cadena);
		scan.close();
		cadenaSB=Voltear(cadenaSB);
		
		System.out.println((cadenaSB.toString()).trim());
	}
	
	public static StringBuilder Voltear(StringBuilder cadena) {
		StringBuilder frase=new StringBuilder();
		cadena.insert(0, " ");
		String cdn=cadena.toString();
		System.out.println(cdn);
		StringBuilder espacio=new StringBuilder(" "); 
		for(int i=cdn.length()-1;i>=0;i--) {
			if(cdn.charAt(i)==' ') {
				frase.append(cadena.substring(i+1));
				frase.append(espacio);
				cadena.delete(i, cadena.length());
				
			}
		}
		return frase;
	}


