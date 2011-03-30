package pe.edu.upc.dw2011cp007.mantenimiento.model;

public class CombosModel {
	private int idCombo;
	private String nombreCombo;

	public int getIdCombo() {
		return idCombo;
	}
	public void setIdCombo(int idCombo) {
		this.idCombo = idCombo;
	}
	public String getNombreCombo() {
		return nombreCombo;
	}
	public void setNombreCombo(String nombreCombo) {
		this.nombreCombo = nombreCombo;
	}

	@Override
	public String toString() {
		return idCombo + " = " + nombreCombo;
	}
}
