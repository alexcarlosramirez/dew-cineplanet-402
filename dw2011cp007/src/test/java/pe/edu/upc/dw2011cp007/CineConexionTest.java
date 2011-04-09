package pe.edu.upc.dw2011cp007;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:pe/edu/upc/dw2011cp007/config/application-config.xml"})
	
public class CineConexionTest {
	/**
	 * The object being tested.
	 */
	
	//@Autowired
	/*
	private RewardNetwork rewardNetwork;
    */
	
	@Test
	public void testCineParaUsuario() {
	assertEquals(1,1);
	}	
}
