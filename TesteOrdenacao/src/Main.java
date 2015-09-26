import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 */

/**
 * @author Ricardo Rocha
 * @since  02/09/2015
 *  
 */
public class Main {
	
	
	interface Calcular{
		int calculo(int[] numeros);
	}
	
	static class CalcularImpl implements Calcular{

		@Override
		public int calculo(int[] numeros) {
			int result = 0; int min = 0; int inc = 0;
			Arrays.sort(numeros);
			for(int item : numeros){
				if(item > min){
					min = item;
					inc++;
				}
				result+=inc;
			}
			return result;
		}
		
	} 

	static boolean isUnique(String str){
		String[] itensStr = str.split("");
		Set<String> ItensStrOrdenados = new TreeSet<String>(Arrays.asList(itensStr)); 		
		return itensStr.length == ItensStrOrdenados.size();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int itens[] = {9,6,8,6};
		
		Calcular calcular = new CalcularImpl();
		int retorno = calcular.calculo(itens);
		System.out.println(retorno);
		
		String teste = "Abcdg";
		System.out.println(isUnique(teste));
		
		Set items = new TreeSet();
		for(Object item : items ){
			
		}
		
		BigDecimal bd = new BigDecimal(0.01);
		System.out.println(bd.doubleValue());
		
		
		/*
		Set<Pessoa> pessoas = new HashSet<Pessoa>();
		//pessoas.addAll( Arrays.asList("Ricardo","Ana","Paula") );
		pessoas.add( new Pessoa("Ricardo") );
		pessoas.add( new Pessoa("ANa") );
		
		(new ArrayList<Pessoa>()).addAll(pessoas);

		System.out.println(pessoas);
		
		float a = 10.00;
		Double b = 10.00;
		new Comparator<Pessoa>() {

			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		}; */


	}

}
