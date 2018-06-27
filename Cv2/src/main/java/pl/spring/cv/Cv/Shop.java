package pl.spring.cv.Cv;

import org.springframework.beans.factory.annotation.Autowired;

public class Shop {
	
	@Autowired
	private ShoppingCard shoppingCard;
	
	public void purchase() {
		shoppingCard.addProductToShoppingCard(new Product(1, "Milk"));
		shoppingCard.addProductToShoppingCard(new Product(2, "Bread"));
	}

}
