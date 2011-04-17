package pe.edu.upc.dw2011cp007.mantenimiento.model;

public class ProductoModel {

	private int idProducto;
	private TipoproductoModel tipoproductoModel;
	private String codigoproducto;
	private String nombreproducto;
	private double precioproducto;
	private int stockproducto;
	private String rutaimagen;
	private boolean solopremiun;

	public ProductoModel() {
		
	}

	public ProductoModel(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public TipoproductoModel getTipoproductoModel() {
		return tipoproductoModel;
	}
	public void setTipoproductoModel(TipoproductoModel tipoproductoModel) {
		this.tipoproductoModel = tipoproductoModel;
	}
	public String getCodigoproducto() {
		return codigoproducto;
	}
	public void setCodigoproducto(String codigoproducto) {
		this.codigoproducto = codigoproducto;
	}
	public String getNombreproducto() {
		return nombreproducto;
	}
	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}
	public double getPrecioproducto() {
		return precioproducto;
	}
	public void setPrecioproducto(double precioproducto) {
		this.precioproducto = precioproducto;
	}
	public String getRutaimagen() {
		return rutaimagen;
	}
	public void setRutaimagen(String rutaimagen) {
		this.rutaimagen = rutaimagen;
	}
	public boolean isSolopremiun() {
		return solopremiun;
	}
	public void setSolopremiun(boolean solopremiun) {
		this.solopremiun = solopremiun;
	}
	public int getStockproducto() {
		return stockproducto;
	}
	public void setStockproducto(int stockproducto) {
		this.stockproducto = stockproducto;
	}
}
