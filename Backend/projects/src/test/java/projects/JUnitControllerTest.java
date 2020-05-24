package projects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import projects.cont.contr1;

public class JUnitControllerTest {
	
	@Autowired
	private contr1 controller = new contr1();

    @Test
    public void testController() {
        String result = controller.hello();
        assertEquals(result, "Working from Spring Boot");
    }
    
    @Test
	public void contexLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}
