
public class Numero {
	private int num;
	private int prioridade;
	//	private String ID_Antena;
	private Antena antena;
	private boolean ocupado;

	//	CONSTRUCTOR

	public Numero(int num,int prior, Antena antena) {
		this.num=num;
		this.prioridade=prior;
		//		this.ID_Antena=ID_Antena;
		this.antena = antena;
		this.ocupado = false;
	}

	//	GETTERS E SETTERS

	//	public String getID_Antena() {
	//		return ID_Antena;
	//	}
	//	public void setID_Antena(String iD_Antena) {
	//		ID_Antena = iD_Antena;
	//	}

	public String getAtenaID() {
		return this.antena.getID_antenna();
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int cat) {
		this.prioridade = cat;
	}

	//	METHODS

	public void initCall(int number) {
		antena.requestCall(num, number);
	}


}
