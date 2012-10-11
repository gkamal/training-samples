package sp.training.sample;

import java.math.BigDecimal;

public interface TransferService {

	public abstract void transfer(String to, String from, BigDecimal amount);

}