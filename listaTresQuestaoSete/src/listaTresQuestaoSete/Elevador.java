package listaTresQuestaoSete;

import java.util.ArrayList;

public class Elevador {

	private int andarAtual;
	private int totalDeAndares;
	private int capacidadeDoElevador;
	private int pessoasPresentes;

	private ArrayList<RegistroVisita> memoria;
	private int tempEntraramNoAndar;
	private int tempSairamNoAndar;

	public void inicializa(int capacidade, int totalDeAndares) {
		this.capacidadeDoElevador = capacidade;
		this.totalDeAndares = totalDeAndares;

		this.andarAtual = 0;
		this.pessoasPresentes = 0;

		this.memoria = new ArrayList<>();
		this.tempEntraramNoAndar = 0;
		this.tempSairamNoAndar = 0;
	}

	public boolean entra() {
		if (pessoasPresentes < capacidadeDoElevador) {
			pessoasPresentes++;
			tempEntraramNoAndar++;
			System.out.println("Uma pessoa entrou. Total: " + pessoasPresentes);
			return true;
		} else {
			System.out.println("Elevador cheio! Ninguém entrou.");
			return false;
		}
	}

	public boolean sai() {
		if (pessoasPresentes > 0) {
			pessoasPresentes--;
			tempSairamNoAndar++;
			System.out.println("Uma pessoa saiu. Total: " + pessoasPresentes);
			return true;
		} else {
			System.out.println("Elevador vazio! Ninguém saiu.");
			return false;
		}
	}

	private void gravarVisitaNoAndar() {
		if (tempEntraramNoAndar > 0 || tempSairamNoAndar > 0) {
			RegistroVisita registro = new RegistroVisita(andarAtual, tempEntraramNoAndar, tempSairamNoAndar);
			memoria.add(registro);

			tempEntraramNoAndar = 0;
			tempSairamNoAndar = 0;
		}
	}

	public boolean sobe() {
		if (andarAtual < totalDeAndares) {
			gravarVisitaNoAndar();
			andarAtual++;
			System.out.println("Elevador subiu para o andar: " + andarAtual);
			return true;
		} else {
			System.out.println("Elevador já está no último andar!");
			return false;
		}
	}

	public boolean desce() {
		if (andarAtual > 0) {
			gravarVisitaNoAndar();
			andarAtual--;
			System.out.println("Elevador desceu para o andar: " + andarAtual);
			return true;
		} else {
			System.out.println("Elevador já está no térreo!");
			return false;
		}
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		if (andarAtual >= 0 && andarAtual <= totalDeAndares) {
			this.andarAtual = andarAtual;
		}
	}

	public int getTotalDeAndares() {
		return totalDeAndares;
	}

	public void setTotalDeAndares(int totalDeAndares) {
		this.totalDeAndares = totalDeAndares;
	}

	public int getCapacidadeDoElevador() {
		return capacidadeDoElevador;
	}

	public void setCapacidadeDoElevador(int capacidadeDoElevador) {
		this.capacidadeDoElevador = capacidadeDoElevador;
	}

	public int getPessoasPresentes() {
		return pessoasPresentes;
	}

	public void setPessoasPresentes(int pessoasPresentes) {
		if (pessoasPresentes >= 0 && pessoasPresentes <= capacidadeDoElevador) {
			this.pessoasPresentes = pessoasPresentes;
		}
	}

	public ArrayList<RegistroVisita> getMemoria() {
		return memoria;
	}
}