package springbootTest.com.example.boot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import springbootTest.com.example.boot.service.CustomerRepository;
import springbootTest.com.example.boot.service.TradeRepository;

@Component
public class StartupRunner implements CommandLineRunner {
	
	protected final Logger logger = LoggerFactory.getLogger(StartupRunner.class);

	@Autowired
    private CustomerRepository customerRepository;
	@Autowired
    private TradeRepository tradeRepository;
 
    @Override
    public void run(String... strings) throws Exception {
        logger.info("customer rows count: " + customerRepository.count());
        logger.info("tarde rows count: " + tradeRepository.count());
    }

}
