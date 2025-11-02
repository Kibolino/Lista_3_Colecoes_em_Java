package listaTresQuestaoDois;

import java.util.ArrayList;

public class Ordenacao {

	public static void main(String[] args) {
		ArrayList<Double> numeros = new ArrayList<>();
		numeros.add(25.5);
		numeros.add(10.2);
		numeros.add(99.9);
		numeros.add(1.75);
		numeros.add(88.0);
		numeros.add(42.1);
		numeros.add(10.1);
		numeros.add(5.5);
		numeros.add(100.0);
		numeros.add(33.3);

		System.out.println("Array original: " + numeros);

		int n = numeros.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {

				if (numeros.get(j) > numeros.get(j + 1)) {

					double temp = numeros.get(j);
					numeros.set(j, numeros.get(j + 1));
					numeros.set(j + 1, temp);
				}
			}
		}
		System.out.println("Array em ordem crescente: " + numeros);

		n = numeros.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {

				if (numeros.get(j) < numeros.get(j + 1)) {
					double temp = numeros.get(j);
					numeros.set(j, numeros.get(j + 1));
					numeros.set(j + 1, temp);
				}
			}
		}
		System.out.println("Array em ordem decrescente: " + numeros);

	}

}
