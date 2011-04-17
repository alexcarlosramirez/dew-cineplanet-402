package pe.edu.upc.dw2011cp007.cartelera.model;

import java.util.Date;

import pe.edu.upc.dw2011cp007.mantenimiento.model.PeliculaCineModel;


public class HorarioModel {

	private int idHorario;
	private Date diahorario;
	private PeliculaCineModel peliculaCineModel;
	private byte essubtitulado;
	private byte esen3d;
	private String horashorario;

	public int getIdHorario() {
		return idHorario;
	}
	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
	}
	public Date getDiahorario() {
		return diahorario;
	}
	public void setDiahorario(Date diahorario) {
		this.diahorario = diahorario;
	}
	public PeliculaCineModel getPeliculaCineModel() {
		return peliculaCineModel;
	}
	public void setPeliculaCineModel(PeliculaCineModel peliculaCineModel) {
		this.peliculaCineModel = peliculaCineModel;
	}
	public byte getEssubtitulado() {
		return essubtitulado;
	}
	public void setEssubtitulado(byte essubtitulado) {
		this.essubtitulado = essubtitulado;
	}
	public byte getEsen3d() {
		return esen3d;
	}
	public void setEsen3d(byte esen3d) {
		this.esen3d = esen3d;
	}
	public String getHorashorario() {
		return horashorario;
	}
	public void setHorashorario(String horashorario) {
		this.horashorario = horashorario;
	}
}
