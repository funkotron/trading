package trading.simulator;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MarketDisplay extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea jtarea;
	
public MarketDisplay(){
	super("trading simulator: Market100");
//	setLayout( new FlowLayout() );
	jtarea = new JTextArea("Current Stock prices:",400,800);
	jtarea.setBackground(Color.BLACK);
	jtarea.setForeground(Color.GREEN);
	Font f = new Font(Font.MONOSPACED,	  Font.TRUETYPE_FONT,14);
	jtarea.setFont(f);
	add(jtarea);
}
public void setText(String contents) {
	// TODO Auto-generated method stub
	jtarea.setText(contents);
}

public static void main(String[]args){
	MarketDisplay display = new MarketDisplay();
	display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	display.setSize(400, 880);
	display.setVisible(true);
	//test setText()

}

}
