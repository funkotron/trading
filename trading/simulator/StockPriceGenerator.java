package trading.simulator;

import java.util.Random;

public class StockPriceGenerator{
private Random base;
private Random salt;
//NumberFormat priceFormatter = NumberFormat.getCurrencyInstance();
protected int price;
public StockPriceGenerator(){
	base = new Random();
//    salt = new Random();
	price = base.nextInt(500)+500; 
}
protected int generatePrice(){
	//company defaults if stock hits negative value
	if(price < 0) return price = 0;
	else{ price += base.nextInt(5) - base.nextInt(5); return price;}
}
}