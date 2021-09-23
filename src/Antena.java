public class Antena {


private int ID_antenna;
private int LIM_Antenna;
public Antena(int iD_antenna, int lIM_Antenna) {
	this.ID_antenna = iD_antenna;
	this.LIM_Antenna = lIM_Antenna;
}
public int getLIM_Antenna() {
	return LIM_Antenna;
}

public void setLIM_Antenna(int lIM_Antenna) {
	LIM_Antenna = lIM_Antenna;
}

public int getID_antenna() {
	return ID_antenna;
}

public void setID_antenna(int iD_antenna) {
	ID_antenna = iD_antenna;
}
}
