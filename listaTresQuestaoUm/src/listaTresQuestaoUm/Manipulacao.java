package listaTresQuestaoUm;

import java.util.ArrayList;
import java.util.Random;

public class Manipulacao {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			numeros.add(rand.nextInt(100));
		}

		System.out.println("Array original: " + numeros);

		numeros.remove(2);
		System.out.println("Lista após remoção: " + numeros);

		numeros.add(0, 50);
		System.out.println("Lista após adicionar no início: " + numeros);

		boolean contem = numeros.contains(15);
		System.out.println("A lista contém o número 15? " + contem);

	}

}
