package breakout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Main {
	public static void main(String[] args) {
		intialize();
	}
	
	public static void intialize() {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height= screenSize.height;
		int width=screenSize.width;
		JFrame frame=new JFrame();
		Game gameobj = new Game();
		frame.setTitle("Game");
		frame.setBounds(width/2-350,height/2-300,700,600);
		frame.setResizable(false);
		frame.add(gameobj);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
