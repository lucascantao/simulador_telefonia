
public class Numero {
	private int num;
	private int cat;
	private int ID_Antena;
	
	public int getID_Antena() {
		return ID_Antena;
	}
	public void setID_Antena(int iD_Antena) {
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
	
	public Numero(int num,int cat,int ID_Antena) {
		this.num=num;
		this.cat=cat;
		this.ID_Antena=ID_Antena;
	}
	
}
