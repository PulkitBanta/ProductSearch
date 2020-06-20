package projects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import projects.Dao.Product;
import projects.cont.contr1;

public class JUnitControllerTest {

    @Test
    public void testController() {
    	contr1 controller = new contr1();
        String result = controller.hello();
        assertEquals(result, "Working from Spring Boot");
    }
    
    @Test
	public void contexLoads() throws Exception {
    	contr1 controller = new contr1();
		assertThat(controller).isNotNull();
	}
}
