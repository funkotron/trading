package trading.simulator;

import java.util.Date;

public class ShareTransaction {
	protected Share s;
	protected int volume;
	protected String operation;
	protected Date timestamp;

//explicit constructor only
public ShareTransaction( Share s, int volume, String operation, Date timestamp){
this.s = s;
this.volume = volume;
this.operation = operation;
this.timestamp = new Date();
}

//modifier methods
public String getSharesCode(){
	return s.getSharesName();
}

public int getSharesPrice(){
	return s.getSharesPrice();
}

public String getOperation(){
	return operation;
}
public int getVolume(){
	return volume;
}

public Date getTimestamp(){
	return timestamp;
}
}
