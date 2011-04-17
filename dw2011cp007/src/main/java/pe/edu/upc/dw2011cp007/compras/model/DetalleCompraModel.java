package pe.edu.upc.dw2011cp007.compras.model;

import pe.edu.upc.dw2011cp007.mantenimiento.model.ProductoModel;

public class DetalleCompraModel {


	private CompraModel compraModel;
	private ProductoModel productoModel;
	private int cantidadcomprada;
	private double preciocompra;
	private double preciopagado;

	/**
	 * @return the cantidadcomprada
	 */
	public int getCantidadcomprada() {
		return cantidadcomprada;
	}
	/**
	 * @param cantidadcomprada the cantidadcomprada to set
	 */
	public void setCantidadcomprada(int cantidadcomprada) {
		this.cantidadcomprada = cantidadcomprada;
	}
	/**
	 * @return the compraModel
	 */
	public CompraModel getCompraModel() {
		return compraModel;
	}
	/**
	 * @param compraModel the compraModel to set
	 */
	public void setCompraModel(CompraModel compraModel) {
		this.compraModel = compraModel;
	}
	/**
	 * @return the productoModel
	 */
	public ProductoModel getProductoModel() {
		return productoModel;
	}
	/**
	 * @param productoModel the productoModel to set
	 */
	public void setProductoModel(ProductoModel productoModel) {
		this.productoModel = productoModel;
	}
	/**
	 * @return the preciocompra
	 */
	public double getPreciocompra() {
		return preciocompra;
	}
	/**
	 * @param preciocompra the preciocompra to set
	 */
	public void setPreciocompra(double preciocompra) {
		this.preciocompra = preciocompra;
	}
	/**
	 * @return the preciopagado
	 */
	public double getPreciopagado() {
		return preciopagado;
	}
	/**
	 * @param preciopagado the preciopagado to set
	 */
	public void setPreciopagado(double preciopagado) {
		this.preciopagado = preciopagado;
	}
}
