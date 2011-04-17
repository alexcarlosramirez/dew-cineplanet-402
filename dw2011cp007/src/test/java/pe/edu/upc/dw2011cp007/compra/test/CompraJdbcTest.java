package pe.edu.upc.dw2011cp007.compra.test;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dw2011cp007.compras.model.CompraModel;
import pe.edu.upc.dw2011cp007.compras.repository.CompraRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.model.UsuarioExternoModel;

/**
 * Test con conexi&oacute;n a base de datos de los m&eacute;todos de la clase
 * {@link CompraModel}.
 * 
 * @author <ul>
 *         <li>Romeo Maita</li>
 *         <li>Yonni Lopez</li>
 *         <li>Miguel Cosio</li>
 *         <li>Alexander Ramirez</li>
 *         </ul>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:pe/edu/upc/dw2011cp007/config/application-config.xml"})
public class CompraJdbcTest {

	@Autowired
	CompraRepository compraRepository;

	@Test
	public void registrarCompra() {
		UsuarioExternoModel usuarioExternoModel = new UsuarioExternoModel();
		usuarioExternoModel.setUserGenCodigo("user1");

		CompraModel compraModel = new CompraModel();
		compraModel.setUsuarioModel(usuarioExternoModel);
		compraModel.setCodigoticket("user10102");
		compraModel.setFechacompra(new Date());

		compraRepository.registrarCompra(compraModel);

		Assert.assertTrue(compraModel.getIdCompra()>0);
		System.out.println(compraModel.getIdCompra());
	}
}
