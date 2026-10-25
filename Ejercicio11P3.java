import java.util.Arrays;
public class Ejercicio11P3 {
	public static void main(String[] args) {
		int[] numeros = {8, 3, 10, 5, 4};
		int suma=0;
		for(int i=0;numeros.length>i;i++) {
			System.out.println(numeros[i]);
			suma+=numeros[i];
		}
		Arrays.sort(numeros);
		int mayor=numeros[numeros.length-1];
		double promedio=(double)suma/(double)numeros.length;
		System.out.println("La suma de las cantidades en el array es de "+suma+", el promedio de estos es "+promedio+" y el numero mas alto es "+mayor);
	}
}