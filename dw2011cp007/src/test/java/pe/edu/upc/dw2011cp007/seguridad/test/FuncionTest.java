package pe.edu.upc.dw2011cp007.seguridad.test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dw2011cp007.seguridad.model.FuncionModel;
import pe.edu.upc.dw2011cp007.seguridad.repository.FuncionRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:pe/edu/upc/dw2011cp007/config/application-config.xml"})

public class FuncionTest {
	@Autowired
	FuncionRepository funcionRepository;
	
	@Test
	public void listarfunciones(){
		List<FuncionModel> listafunciones;
		listafunciones=funcionRepository.obtenerListaFunciones();
		assertNotNull(listafunciones);
		//System.out.println(listafunciones.size()+"");
		Iterator<FuncionModel> it=listafunciones.iterator();
		while (it.hasNext()){
			FuncionModel funcion=(FuncionModel)it.next();
			System.out.println(funcion.getIdFuncion()+" - "+funcion.getNombreFuncion());
		}
	}
}
