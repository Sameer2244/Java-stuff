package breakout;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle {
	private int width= 90;
	private int height =20;
	public static int paddlex=300;
	
	public void movePaddle(int x) {
		paddlex+= x;
	}
	public Paddle(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(paddlex, 500, width, height);
	}
}
