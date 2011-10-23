package trading.simulator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
//import java.util.concurrent.*;

import javax.swing.JFrame;

public class Market extends Thread {
	public static ArrayList<Share> stock;
	private static File sourceCodes = new File(
			"/home/juri/workspace/Goodrich_DataStructuresAndAlgorithms/src/trading/simulator/Stock125.txt");
	public Market() {
		// TODO Auto-generated constructor stub
		try {
			initiliazeStock();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	// a new (very!) volatile market :-)
	MarketDisplay myDisplay = new MarketDisplay();
	myDisplay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	myDisplay.setSize(400, 880);
	myDisplay.setVisible(true);
	String alistContents = "";
	while (true){
		ListIterator<Share> iter = stock.listIterator();
		while(iter.hasNext()){
			Share element = iter.next();
			alistContents += element.toString() + "\n";
		}
		//debug
		//System.out.println(alistContents);
		myDisplay.setText(alistContents);
		// now wait for the next price iteration
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	// reset string holder
			alistContents = "";
	}
	}
	
	private void initiliazeStock() throws IOException {
		stock = new ArrayList<Share>();
		BufferedReader in = new BufferedReader(
					new FileReader(sourceCodes));
		String line = in.readLine();
		String [] stockAttribs = new String[2];
		while(line != null){
			stockAttribs = line.split("\t");
			stock.add(new Share(stockAttribs[1],stockAttribs[0]));
			line = in.readLine();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Market());
		t.start();
	}

}
