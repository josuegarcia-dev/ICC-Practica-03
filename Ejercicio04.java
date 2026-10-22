import java.util.Scanner;
public class Practica03{
	public static void main(String[] args) {
		CharSequence resultado = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese su texto");
		String texto = scan.nextLine();
		int contador=1;
		for (int i = 0; i < texto.length() - 1; i++) {
			if (texto.charAt(i) == texto.charAt(i + 1)) {
                contador++;} else {
                    ((StringBuilder) resultado).append(texto.charAt(i)).append(contador);
                    contador = 1;
                }
		}
		((StringBuilder) resultado).append(texto.charAt(texto.length() - 1)).append(contador);
         System.out.println(resultado.toString());
         scan.close();
	}
}
