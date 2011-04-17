package pe.edu.upc.dw2011cp007.compras.service;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.compras.model.CompraModel;
import pe.edu.upc.dw2011cp007.compras.model.DetalleCompraModel;

public interface CompraService {

	boolean registrarCompra(CompraModel compraModel, ArrayList<DetalleCompraModel> listaCompra);
}
