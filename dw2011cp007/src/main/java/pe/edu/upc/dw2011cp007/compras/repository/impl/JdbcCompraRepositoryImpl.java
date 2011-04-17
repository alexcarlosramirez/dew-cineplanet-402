package pe.edu.upc.dw2011cp007.compras.repository.impl;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.compras.model.CompraModel;
import pe.edu.upc.dw2011cp007.compras.repository.CompraRepository;

@Repository
public class JdbcCompraRepositoryImpl extends JdbcDaoSupport implements CompraRepository {

	@Autowired
	public JdbcCompraRepositoryImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean registrarCompra(CompraModel compraModel) {
		GeneratedKeyHolder holder = new GeneratedKeyHolder();
		PreparedStatementCreatorFactory preparedStatementCreatorFactory = new PreparedStatementCreatorFactory("insert into cp_tb_compra (username, co_ticket, fe_compra) values(?,?,?)", new int[]{Types.VARCHAR, Types.VARCHAR, Types.DATE});
		preparedStatementCreatorFactory.setReturnGeneratedKeys(true);
		preparedStatementCreatorFactory.setGeneratedKeysColumnNames(new String[]{"id_compra"});
		PreparedStatementCreator psc = preparedStatementCreatorFactory.newPreparedStatementCreator(new Object[]{compraModel.getUsuarioModel().getUserGenCodigo(), compraModel.getCodigoticket(), compraModel.getFechacompra()});		
		int result = getJdbcTemplate().update(psc, holder);
		if (result > 0) {
			compraModel.setIdCompra(holder.getKey().intValue());
			return true;
		} else {
			return false;
		}
	}
}
