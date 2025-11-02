package listaTresQuestaoCinco;
import java.util.ArrayList;

public class Excecoes {

	public static void main(String[] args) {

	        ArrayList<String> listaDeStrings = new ArrayList<>();
	        listaDeStrings.add("10");
	        listaDeStrings.add("20");
	        listaDeStrings.add("abc");
	        listaDeStrings.add("30");
	        listaDeStrings.add("45x");
	        listaDeStrings.add("50");

	        System.out.println("Array original: " + listaDeStrings);

	        ArrayList<Integer> numerosConvertidos = new ArrayList<>();

	        for (String str : listaDeStrings) {
	            
	            try {
	                int numero = Integer.parseInt(str);
	                
	                numerosConvertidos.add(numero);
	                System.out.println(str + " convertido para " + numero);

	            } catch (NumberFormatException e) {
	                System.out.println(str + " não é um número inteiro válido.");
	            }
	        }

	        System.out.println("Números convertidos com sucesso: " + numerosConvertidos);

	}

}
