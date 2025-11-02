package listaTresQuestaoTres;

import java.util.ArrayList;

public class Remocao {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.add(5);
		numeros.add(12);
		numeros.add(7);
		numeros.add(22);
		numeros.add(5);
		numeros.add(8);
		numeros.add(19);
		numeros.add(3);
		numeros.add(12);
		numeros.add(30);
		numeros.add(11);
		numeros.add(4);
		numeros.add(7);
		numeros.add(2);
		numeros.add(15);

		System.out.println("Array original: " + numeros);

		numeros.removeIf(n -> (n % 2 == 0));

		System.out.println("Array após remover os pares: " + numeros);

	}

}
