package trading.simulator;

public class Consumer extends Thread { 
	Producer producer; 
	Consumer(Producer p) { 
	producer = p; 
} 
public void run() { 
	try { 
		while ( true ) { 
			String message = producer.getMessage(); 
			System.out.println("Got message: " + message); 
			sleep( 1000 ); 
		} 
	}
	catch( InterruptedException e ) { } 
} 

public static void main(String args[]) { 
	Producer a = new Producer(); 
	a.start();
	new Consumer( a ).start();
} 

} 
