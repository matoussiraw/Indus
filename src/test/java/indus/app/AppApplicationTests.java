package indus.app;

import indus.app.models.Production;
import indus.app.repositories.ProductionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppApplicationTests {
	@Autowired
	private ProductionRepository productionRepository;

	@Test
	void contextLoads() {
	}
	public void testCreateProduction(){

		Production prod = new Production();
		ProductionRepository.save(prod);
	}
}
