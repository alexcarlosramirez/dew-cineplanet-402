package pe.edu.upc.dw2011cp007.compras.repository.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.compras.model.DetalleCompraModel;
import pe.edu.upc.dw2011cp007.compras.repository.DetalleCompraRepository;

@Repository
public class JdbcDetalleCompraRepositoryImpl extends JdbcDaoSupport implements DetalleCompraRepository {

	@Autowired
	public JdbcDetalleCompraRepositoryImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean registrarDetalleCompra(DetalleCompraModel detalleCompraModel) {
		String sql = "insert into cp_tb_detallecompra values (?,?,?,?)";
		int res = getJdbcTemplate().update(sql, detalleCompraModel.getCompraModel().getIdCompra(), detalleCompraModel.getProductoModel().getIdProducto(), detalleCompraModel.getProductoModel().getPrecioproducto(), detalleCompraModel.getPreciopagado());
		if (res > 0) {
			return false;
		} else {
			return false;
		}
	}
}
