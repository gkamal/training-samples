package sp.training.spring;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		
		TransferService transferService = new TransferServiceImpl();
		transferService.transfer("123","321",new BigDecimal("10000"));
		
		System.out.println("Wrapping method in a proxy");
		
		transferService = LoggingProxy.wrapWithLoggingProxy(transferService, TransferService.class);
		
		transferService.transfer("456", "654",new BigDecimal("999999"));
		
	}
}
