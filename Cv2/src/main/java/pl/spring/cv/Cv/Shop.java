package pl.spring.cv.Cv;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


public class Shop {
	
	
	private ShoppingCard shoppingCard;
	
	@Autowired
	public void setShoppingCard(ShoppingCard shoppingCard) {
		this.shoppingCard = shoppingCard;
	}
	
	public void purchase() {
		shoppingCard.addProductToShoppingCard(new Product(1, "Milk"));
		shoppingCard.addProductToShoppingCard(new Product(2, "Bread"));
	}


}
