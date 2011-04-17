package pe.edu.upc.dw2011cp007.mantenimiento.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.mantenimiento.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ProductoModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.TipoproductoModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.ProductoRepository;

@Repository
public class JdbcProductoRepositoryImpl extends JdbcDaoSupport implements ProductoRepository {

	@Autowired
	public JdbcProductoRepositoryImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public ArrayList<ProductoModel> buscarListaProductoPorPelicula( PeliculaModel peliculaModel) {
		String sql = 
			"select " +
			"p.id_producto, " +
			"tp.id_tipoproducto, " +
			"tp.no_tipoproducto, " +
			"p.co_producto, " +
			"p.no_producto, " +
			"p.ss_producto, " +
			"p.nu_stockproducto, " +
			"p.tx_rutaimagen, " +
			"p.fl_solopremiun " +
			"from " +
			"cp_tb_producto p, " +
			"cp_tb_tipoproducto tp, " +
			"cp_tb_productopelicula pp " +
			"where " +
			"p.id_tipoproducto = tp.id_tipoproducto " +
			"and p.id_producto = pp.id_producto " +
			"and pp.id_pelicula = ?";
		ArrayList<ProductoModel> listaPeliculaModel = (ArrayList<ProductoModel>) getJdbcTemplate().query(sql,new Object[]{peliculaModel.getIdPelicula()} , new ProductoRowMapper());
		return listaPeliculaModel;
	}

	public ArrayList<ProductoModel> buscarListaProducto() {
		String sql = 
			"select " +
			"p.id_producto, " +
			"tp.id_tipoproducto, " +
			"tp.no_tipoproducto, " +
			"p.co_producto, " +
			"p.no_producto, " +
			"p.ss_producto, " +
			"p.nu_stockproducto, " +
			"p.tx_rutaimagen, " +
			"p.fl_solopremiun " +
			"from " +
			"cp_tb_producto p, " +
			"cp_tb_tipoproducto tp " +
			"where " +
			"p.id_tipoproducto = tp.id_tipoproducto";
		ArrayList<ProductoModel> listaPeliculaModel = (ArrayList<ProductoModel>) getJdbcTemplate().query(sql , new ProductoRowMapper());
		return listaPeliculaModel;
	}

	public ProductoModel buscarProducto(ProductoModel producto) {
		String sql = 
			"select " +
			"p.id_producto, " +
			"tp.id_tipoproducto, " +
			"tp.no_tipoproducto, " +
			"p.co_producto, " +
			"p.no_producto, " +
			"p.ss_producto, " +
			"p.nu_stockproducto, " +
			"p.tx_rutaimagen, " +
			"p.fl_solopremiun " +
			"from " +
			"cp_tb_producto p, " +
			"cp_tb_tipoproducto tp " +
			"where " +
			"p.id_tipoproducto = tp.id_tipoproducto " +
			"and p.id_producto = ?";
		ProductoModel productoModel = (ProductoModel) getJdbcTemplate().queryForObject(sql,new Object[]{producto.getIdProducto()} , new ProductoRowMapper());
		return productoModel;
	}
}

class ProductoRowMapper implements ParameterizedRowMapper<ProductoModel> {

	public ProductoModel mapRow(ResultSet rs, int row) throws SQLException {
		TipoproductoModel tipoproductoModel = new TipoproductoModel();
		tipoproductoModel.setIdTipoproducto(rs.getInt("id_tipoproducto"));
		tipoproductoModel.setNombretipoproducto(rs.getString("no_tipoproducto"));

		ProductoModel model = new ProductoModel();
		model.setIdProducto(rs.getInt("id_producto"));
		model.setTipoproductoModel(tipoproductoModel);
		model.setCodigoproducto(rs.getString("co_producto"));
		model.setNombreproducto(rs.getString("no_producto"));
		model.setPrecioproducto(rs.getDouble("ss_producto"));
		model.setStockproducto(rs.getInt("nu_stockproducto"));
		model.setRutaimagen(rs.getString("tx_rutaimagen"));
		model.setSolopremiun(rs.getBoolean("fl_solopremiun"));
		return model;
	}
	
}
