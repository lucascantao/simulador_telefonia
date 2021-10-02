public class Antena {

	private String ID_antenna;
	private int LIM_Antenna;
	private int Counter;
	private Central central;

	// CONSTRUCTORS

	public Antena(String id, int lim, Central central) {
		this.ID_antenna = id;
		this.LIM_Antenna = lim;
		this.central = central;
	}
	
	public Antena(String iD_antenna, int lIM_Antenna) {
		this.Counter = 0;
		this.ID_antenna = iD_antenna;
		this.LIM_Antenna = lIM_Antenna;
	}

	// GETTERS E SETTERS
	
	public boolean setCounter(int value) {
		if(this.Counter >= this.LIM_Antenna || this.Counter <= 0) {
			return false;
		}
		this.Counter = value;
		return true;
		
	}
	
	public int getCounter() {
		return this.Counter;
	}

	public int getLIM_Antenna() {
		return LIM_Antenna;
	}

	public void setLIM_Antenna(int lIM_Antenna) {
		LIM_Antenna = lIM_Antenna;
	}

	public String getID_antenna() {
		return ID_antenna;
	}

	public void setID_antenna(String iD_antenna) {
		ID_antenna = iD_antenna;
	}

	// METHODS

	public void requestCall(int request, int destiny) {
		if (central.realizarChamada(this, request, destiny)) {
			Counter++;
		}
	}

}
