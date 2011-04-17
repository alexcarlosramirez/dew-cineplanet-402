package pe.edu.upc.dw2011cp007.compras.model;

import java.util.Date;

import pe.edu.upc.dw2011cp007.mantenimiento.model.UsuarioExternoModel;

public class CompraModel {

	private int idCompra;
	private String codigoticket;
	private UsuarioExternoModel usuarioModel;
	private Date fechacompra;

	public int getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	public UsuarioExternoModel getUsuarioModel() {
		return usuarioModel;
	}
	public void setUsuarioModel(UsuarioExternoModel usuarioModel) {
		this.usuarioModel = usuarioModel;
	}
	public Date getFechacompra() {
		return fechacompra;
	}
	public void setFechacompra(Date fechacompra) {
		this.fechacompra = fechacompra;
	}
	public String getCodigoticket() {
		return codigoticket;
	}
	public void setCodigoticket(String codigoticket) {
		this.codigoticket = codigoticket;
	}
}
