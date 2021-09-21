
public class Numero {
	//numero da pessoa
	//cat é a categoria que ela esta {1 - normal; 2 - policia; 3-medico}
	private int num;
	private int cat;

	public Numero(int num,int cat) {
		this.num=num;
		this.cat=cat;
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
	
}
