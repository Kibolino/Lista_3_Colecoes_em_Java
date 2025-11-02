package listaTresQuestaoSeis;
import java.util.ArrayList;

public class Main {

	public static ArrayList<String> filtrarPalavras(ArrayList<String> palavras) 
            throws NoMatchingElementsException {

        ArrayList<String> palavrasFiltradas = new ArrayList<>();

        for (String palavra : palavras) {
            if (palavra.length() > 5) {
                palavrasFiltradas.add(palavra);
            }
        }

        if (palavrasFiltradas.isEmpty()) {
            throw new NoMatchingElementsException("Nenhuma palavra foi encontrada.");
        }

        return palavrasFiltradas;
    }
	
	public static void main(String[] args) {
        ArrayList<String> listaDePalavras = new ArrayList<>();
        listaDePalavras.add("Java");
        listaDePalavras.add("Coleções");
        listaDePalavras.add("Palavra");
        listaDePalavras.add("Café");
        listaDePalavras.add("Mapa");
        listaDePalavras.add("Programa");
        listaDePalavras.add("Filtro");
        listaDePalavras.add("Cola");
        listaDePalavras.add("Exceção");
        listaDePalavras.add("Oi");
        
        System.out.println("Lista original: " + listaDePalavras);

        try {
            ArrayList<String> filtradas = filtrarPalavras(listaDePalavras);
            System.out.println("Palavras filtradas: " + filtradas);
        
        } catch (NoMatchingElementsException e) {
            System.out.println("Erro: " + e.getMessage());
        }


        System.out.println("\nTestando com lista que irá falhar");
        ArrayList<String> listaDePalavras2 = new ArrayList<>();
        listaDePalavras2.add("Oi");
        listaDePalavras2.add("Café");
        listaDePalavras2.add("Mapa");
        listaDePalavras2.add("Cola");

        System.out.println("Lista com falha: " + listaDePalavras2);
        
        try {
            ArrayList<String> filtradas2 = filtrarPalavras(listaDePalavras2);
            System.out.println("Palavras filtradas (> 5 caracteres): " + filtradas2);
        
        } catch (NoMatchingElementsException e) {
            System.out.println("Erro capturado com sucesso: " + e.getMessage());
        }

	}

}
