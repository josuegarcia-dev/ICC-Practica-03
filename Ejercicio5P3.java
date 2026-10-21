import java.util.Scanner;
import java.lang.Character;
public class Ejercicio5P3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un posible palindromo");
        String cadena = scan.nextLine();
        boolean esPalindromo = true;
        int izquierda = 0;
        int derecha = cadena.length() - 1;
        while (izquierda < derecha) {
            char cIzq = Character.toLowerCase(cadena.charAt(izquierda));
            switch (cIzq) {
                case 'á': cIzq = 'a'; break;
                case 'é': cIzq = 'e'; break;
                case 'í': cIzq = 'i'; break;
                case 'ó': cIzq = 'o'; break;
                case 'ú': cIzq = 'u'; break;
                case 'ü': cIzq = 'u'; break;
            }
            if (!Character.isLetterOrDigit(cIzq)) {
                izquierda++;
                continue;
            }
            char cDer = Character.toLowerCase(cadena.charAt(derecha));
            switch (cDer) {
            	case 'á': cDer = 'a'; break;
            	case 'é': cDer = 'e'; break;
            	case 'í': cDer = 'i'; break;
            	case 'ó': cDer = 'o'; break;
            	case 'ú': cDer = 'u'; break;
            	case 'ü': cDer = 'u'; break;
            }
            if (!Character.isLetterOrDigit(cDer)) {
                derecha--;
                continue;
            }
            if (cIzq != cDer) {
                esPalindromo = false;
                break;
            }
            izquierda++;
            derecha--;
        }
        System.out.println(esPalindromo);
        scan.close();
    }
}
