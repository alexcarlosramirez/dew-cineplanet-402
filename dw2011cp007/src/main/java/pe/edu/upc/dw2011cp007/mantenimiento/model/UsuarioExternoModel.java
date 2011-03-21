package pe.edu.upc.dw2011cp007.mantenimiento.model;

public class UsuarioExternoModel extends UsuarioGenericoModel {
	
	private boolean usuarioExternoPremium;
	private String usuarioExternoDireccion;
	
	public UsuarioExternoModel() {
		
	}

	public boolean isUsuarioExternoPremium() {
		return usuarioExternoPremium;
	}

	public void setUsuarioExternoPremium(boolean usuarioExternoPremium) {
		this.usuarioExternoPremium = usuarioExternoPremium;
	}

	public String getUsuarioExternoDireccion() {
		return usuarioExternoDireccion;
	}

	public void setUsuarioExternoDireccion(String usuarioExternoDireccion) {
		this.usuarioExternoDireccion = usuarioExternoDireccion;
	}

		
	
}
