
public class Numero {
	private int num;
	private int cat;
	private String ID_Antena;
	
//	CONSTRUCTOR
	
	public Numero(int num,int cat, String ID_Antena) {
		this.num=num;
		this.cat=cat;
		this.ID_Antena=ID_Antena;
	}
	
//	GETTERS E SETTERS
	
	public String getID_Antena() {
		return ID_Antena;
	}
	public void setID_Antena(String iD_Antena) {
		ID_Antena = iD_Antena;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCat() {
		return cat;
	}
	public void setCat(int cat) {
		this.cat = cat;
	}
	
	public void initCall(int number) {
		Central.realizarChamada(this.ID_Antena, num, number);
	}
	
	
}
