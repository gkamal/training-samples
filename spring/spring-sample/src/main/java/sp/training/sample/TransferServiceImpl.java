package sp.training.sample;

import java.math.BigDecimal;

public class TransferServiceImpl implements TransferService {

	public void transfer(String to, String from, BigDecimal amount) {
		System.out.println("transferring");
	}
}
