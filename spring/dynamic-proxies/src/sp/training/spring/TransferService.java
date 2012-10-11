package sp.training.spring;

import java.math.BigDecimal;

public interface TransferService {
	public void transfer(String to,String from, BigDecimal amount);
}
