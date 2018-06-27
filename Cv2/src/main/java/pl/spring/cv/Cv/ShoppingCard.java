package pl.spring.cv.Cv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCard {
	
	private List<Product> productList;
	
	@Autowired
	public ShoppingCard() {
		this.productList = new ArrayList<>();
	}
	
	public void addProductToShoppingCard(Product product) {
		productList.add(product);
	}
	

}
