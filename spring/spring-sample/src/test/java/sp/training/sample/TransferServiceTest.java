package sp.training.sample;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:application-config.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TransferServiceTest {
	
	@Autowired
	TransferService transferService;

	@Test
	public void test() {
		transferService.transfer("123","345",new BigDecimal("100"));
	}

}
