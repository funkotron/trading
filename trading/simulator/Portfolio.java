package trading.simulator;

import java.util.Vector;

public class Portfolio {
protected static int investmentFunds;
int portfolioCapital = 0;
Vector<Share> sharesPortfolio;

//implicit constructor
protected Portfolio(){
	sharesPortfolio = new Vector<Share>();
	portfolioCapital = getPorfolioValue();
	
}
private int getPorfolioValue() {
	// TODO Auto-generated method stub
	return 0;
}
//explicit constructor
protected Portfolio(Vector<Share> sharesPortfolio){
	this.sharesPortfolio = sharesPortfolio;
}
}
