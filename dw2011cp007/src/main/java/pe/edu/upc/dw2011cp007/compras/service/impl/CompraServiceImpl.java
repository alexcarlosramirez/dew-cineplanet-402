package pe.edu.upc.dw2011cp007.compras.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.dw2011cp007.compras.model.CompraModel;
import pe.edu.upc.dw2011cp007.compras.model.DetalleCompraModel;
import pe.edu.upc.dw2011cp007.compras.repository.CompraRepository;
import pe.edu.upc.dw2011cp007.compras.repository.DetalleCompraRepository;
import pe.edu.upc.dw2011cp007.compras.service.CompraService;

@Service
public class CompraServiceImpl implements CompraService {

	private CompraRepository compraRepository;
	private DetalleCompraRepository detalleCompraRepository;

	@Autowired
	public CompraServiceImpl(CompraRepository compraRepository, DetalleCompraRepository detalleCompraRepository) {
		this.compraRepository = compraRepository;
		this.detalleCompraRepository = detalleCompraRepository;
	}

	public boolean registrarCompra(CompraModel compraModel, ArrayList<DetalleCompraModel> listaCompra) {
		boolean res = compraRepository.registrarCompra(compraModel);
		for (DetalleCompraModel detalleCompraModel : listaCompra) {
			res = res && detalleCompraRepository.registrarDetalleCompra(detalleCompraModel);
		}
		return res;
	}

}
