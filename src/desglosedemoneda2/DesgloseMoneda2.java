package desglosedemoneda2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DesgloseMoneda2 {

	public static void main(String[] args) {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int importe = 0, numeroBilletes50 = 0, numeroBilletes20 = 0, numeroBilletes10 = 0, numeroBilletes5 = 0,
				numeroMonedas2 = 0, numeroMonedas1 = 0;
		int numeroUnidades = 0;

		try {

			System.out.print("Introducir importe a desglosar en billetes-monedas : ");

			importe = Integer.parseInt(bufferedReader.readLine());

		} catch (Exception excepcion) {

			System.out.println(excepcion.getMessage());
		}

		for (int i = 1; i <= 6; i++) {
			int importeBilleteMoneda = 0;
			switch (i) {

			case 1:
				importeBilleteMoneda = 50;
				break;

			case 2:
				numeroBilletes50 = numeroUnidades;
				System.out.println("Despues de aplicar el desglose de billetes de 50 obtenemos " + numeroBilletes50
						+ " billetes de 50. Queda pendiente de desglosar " + importe);
				importeBilleteMoneda = 20;
				break;

			case 3:
				numeroBilletes20 = numeroUnidades;
				System.out.println("Despues de aplicar el desglose de billetes de 20 obtenemos " + numeroBilletes20
						+ " billetes de 20. Queda pendiente de desglosar " + importe);
				importeBilleteMoneda = 10;
				break;

			case 4:
				numeroBilletes10 = numeroUnidades;
				System.out.println("Despues de aplicar el desglose de billetes de 10 obtenemos " + numeroBilletes10
						+ " billetes de 10. Queda pendiente de desglosar " + importe);
				importeBilleteMoneda = 5;
				break;

			case 5:
				numeroBilletes5 = numeroUnidades;
				System.out.println("Despues de aplicar el desglose de billetes de 5 obtenemos " + numeroBilletes5
						+ " billetes de 5. Queda pendiente de desglosar " + importe);
				importeBilleteMoneda = 2;
				break;

			case 6:
				numeroMonedas2 = numeroUnidades;
				System.out.println("Despues de aplicar el desglose de Monedas de 2  obtenemos " + numeroMonedas2
						+ " billetes de 2. Queda pendiente de desglosar " + importe);
				importeBilleteMoneda = 1;
				break;

			}
			numeroUnidades = 0;
			if (importe >= importeBilleteMoneda) {

				numeroUnidades = importe / importeBilleteMoneda;
				importe %= (numeroUnidades * importeBilleteMoneda);
			}

		}
		numeroMonedas1 = numeroUnidades;
		System.out.println("obtenemos tambien "+numeroMonedas1+" monedas de 1 ");

	}

}
