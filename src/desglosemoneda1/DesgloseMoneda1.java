package desglosemoneda1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DesgloseMoneda1 {

	public static void main(String[] args) {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int importe = 0, numeroBilletes50 = 0, numeroBilletes20 = 0, numeroBilletes10 = 0, numeroBilletes5 = 0,
				numeroMonedas2 = 0, numeroMonedas1;

		try {

			System.out.print("Introdusca importe a desglosar en billetes-monedas : ");
			importe = Integer.parseInt(bufferedReader.readLine());

		} catch (Exception excepcion) {

			System.out.println(excepcion.getMessage()); 
		}
		if (importe >= 50) {
			numeroBilletes50 = importe / 50;
			importe %= (numeroBilletes50 * 50);
		}
		System.out.println("Despues de aplicar el desglose de billetes de 50, obtenemos " + numeroBilletes50
				+ " billetes de 50. que da pendiente de desglosar: " + importe);

		if (importe >= 20) {
			numeroBilletes20 = importe / 20;
			importe %= (numeroBilletes20 * 20);
		}
		System.out.println("Despues de aplicar el desglose de billetes de 20, obtenemos " + numeroBilletes20
				+ " billetes de 20. que da pendiente de desglosar: " + importe);

		if (importe >= 10) {
			numeroBilletes10 = importe / 10;
			importe %= (numeroBilletes10 * 10);
		}
		System.out.println("Despues de aplicar el desglose de billetes de 10, obtenemos " + numeroBilletes10
				+ " billetes de 10. que da pendiente de desglosar: " + importe);

		if (importe >= 5) {
			numeroBilletes5 = importe / 5;
			importe %= (numeroBilletes5 * 5);
		}
		System.out.println("Despues de aplicar el desglose de billetes de 5, obtenemos " + numeroBilletes5
				+ " billetes de 5. que da pendiente de desglosar: " + importe);

		if (importe >= 2) {
			numeroMonedas2 = importe / 2;
			importe %= (numeroMonedas2 * 2);
		}
		System.out.println("Despues de aplicar el desglose de billetes de 20, obtenemos " + numeroMonedas2
				+ " monedas de 2. que da pendiente de desglosar: " + importe);

		numeroMonedas1 = importe;
		System.out.println("Obtendremos tambien: " + numeroMonedas1 + " monedas de 1");

	}

}
