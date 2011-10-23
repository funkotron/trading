package trading.simulator;

import java.util.Date;

public class Share extends Thread{
	protected String name;
	protected String sharesCode;
	protected int sharesPrice;
	protected int volume;
	private StockPriceGenerator stockSpg = new StockPriceGenerator();
	protected Date timestamp;

public Share(String name, String sharesCode){
	name = this.name;
	this.sharesCode = sharesCode;
	//set to 1 mill. by default
	volume = 1000000;
	sharesPrice = stockSpg.generatePrice();
	timestamp = new Date();
	Thread lifeOfshare = new Thread(this);
	lifeOfshare.start();
}

public void updateSharesTime(){
	timestamp = new Date();
}

public void updateSharesPrice(){
	sharesPrice = stockSpg.generatePrice();
}

public String getSharesName() {
	// TODO Auto-generated method stub
	return name;
}

public void setSharesCode(String newSharesCode){
	sharesCode = newSharesCode;
}

public int getSharesPrice(){
	return sharesPrice;
}

public String toString(){
	return "[" + sharesCode + "]" +
		" -> " + sharesPrice + "pps @" + timestamp.toString();
	}

@Override
public void run() {
	// TODO Auto-generated method stub
	while(true){
		updateSharesPrice();
		updateSharesTime();
			//tick resolution?
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

}
