package listaTresQuestaoSete;

public class Main {

	public static void main(String[] args) {
		Elevador elevador = new Elevador();

		elevador.inicializa(8, 4);

		System.out.println("Andar atual: " + elevador.getAndarAtual());
		System.out.println("Pessoas: " + elevador.getPessoasPresentes());

		System.out.println("\nTérreo");

		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();

		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();

		System.out.println("\nSubindo para o 3° Andar");
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();

		System.out.println("Chegou ao 3° Andar. Pessoas: " + elevador.getPessoasPresentes());

		System.out.println("\nNo 3° Andar");
		elevador.sai();
		elevador.sai();

		elevador.entra();

		System.out.println("\nDescendo para o Térreo");
		elevador.desce();
		elevador.desce();
		elevador.desce();

		System.out.println("Chegou ao Térreo. Pessoas: " + elevador.getPessoasPresentes());

		System.out.println("\nTérreo");
		
		elevador.sai();
		elevador.sai();
		elevador.sai();

		elevador.desce();


		System.out.println("\nMEMÓRIA DO ELEVADOR");
		System.out.println(elevador.getMemoria());

	}

}
