import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {

	@Test
	public void testCreateProduct() {
		Product p=new Product("chair",40);
		assertEquals("chair",p.getTitle());
		assertEquals(40,p.getPrice(),0.1);
	}

	@Test
	public void testTwoProductsEqual() {
		Product p1=new Product("shoes",25);
		Product p2=new Product("shoes",3025);
		assertEquals(true,p1.equals(p2));
	}

}
