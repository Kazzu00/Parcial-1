package parcial1;

import java.util.ArrayList;

public class Pieza {
	private PiezaAjedrez pieza;
	public Coordenadas posicion;
	public ArrayList<Coordenadas> capacidadPieza;
	
	public PiezaAjedrez getPieza() {
		return pieza;
	}
	public void setPieza(PiezaAjedrez pieza) {
		this.pieza = pieza;
	}

}
