package pe.edu.upc.dw2011cp007;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import common.money.MonetaryAmount;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations={
				"classpath:rewards/test-infrastructure-config.xml",
				"classpath:rewards/internal/application-config.xml"})


public class CineConexionTest {

}
