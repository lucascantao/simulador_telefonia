
public class Ligacao extends Antena {
	//na teoria �: fazer a chamada adicionar no contador de chamada da antena; 
	//se o contador de chamada for acima do contador ele vai pra lista de espera; 
//	static int chamada=0;
	
	public Ligacao(String ID, int lim) {
		super(ID, lim);
	}
	
//	int realizarcall(int n1, int n2) {
//		
//		int	Priority = n1+n2; 
//		chamada ++;
//		if (chamada>ligcount) {
//			ListadeEspera list = new ListadeEspera(Priority);
//			list.add(Priority);
//		}
//		else {
//		chamada --;
//		}
//				
//		return Priority;		
//	}
}
