package pe.edu.upc.dw2011cp007.mantenimiento.repository;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ProductoModel;

public interface ProductoRepository {

	ArrayList<ProductoModel> buscarListaProductoPorPelicula(PeliculaModel peliculaModel);
}
