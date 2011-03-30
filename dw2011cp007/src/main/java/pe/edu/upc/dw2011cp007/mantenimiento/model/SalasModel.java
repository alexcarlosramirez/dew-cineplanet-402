package pe.edu.upc.dw2011cp007.mantenimiento.model;

public class SalasModel {

		private int idSala;
		private String nombreSala;

		
		public int getIdSala() {
			return idSala;
		}
		public void setIdSala(int idSala) {
			this.idSala = idSala;
		}
		public String getNombreSala() {
			return nombreSala;
		}
		public void setNombreSala(String nombreSala) {
			this.nombreSala = nombreSala;
		}
		public int getIdCine() {
			return idCine;
		}
		public void setIdCine(int idCine) {
			this.idCine = idCine;
		}

		private int idCine;		
		
		
		@Override
		public String toString() {
			return idSala + " = " + nombreSala + " Pertenece al Cine " + idCine;
		}
	}

