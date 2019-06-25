import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void testCreateCart() {
		ShoppingCart s= new ShoppingCart();
		assertEquals(0,s.getItemCount());
	}
	@Test
	public void testEmptyCart() {
		ShoppingCart s= new ShoppingCart();
		Product p = new Product("chair",40);
		s.addItem(p);
		s.empty();
		assertEquals(0,s.getItemCount());
	}
	@Test
	public void testAddProduct() {
		ShoppingCart s= new ShoppingCart();
		Product p = new Product("chair",40);
		double balance=s.getBalance();
		s.addItem(p);
		assertEquals(1,s.getItemCount());
		assertEquals(balance+40,s.getBalance(),0.01);
	}
	@Test
    public void testRemoveProduct()
    {
		
    }

}
