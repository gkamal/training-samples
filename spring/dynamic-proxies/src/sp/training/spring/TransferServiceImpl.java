package sp.training.spring;

import java.math.BigDecimal;

public class TransferServiceImpl implements TransferService {

	@Override
	public void transfer(String to, String from, BigDecimal amount) {
		System.out.println("Tranfer " + amount + " from " + from + " to " + to);
	}

}
