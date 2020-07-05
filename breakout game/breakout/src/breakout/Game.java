package breakout;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Game extends JPanel implements ActionListener,KeyListener{

	private Timer timer;
	private boolean start=false;
	Paddle paddle;
	private int ballx=330,bally=480;
	private int balldirx=1,balldiry=1;
	int x,chances=0;
	int score=0;
	Tiles tile = new Tiles(6,4);
	public Game() {
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer=new Timer(10,this);
		timer.start();
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 700, 600);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, x, 40);
		paddle= new Paddle(g);
		g.setColor(Color.YELLOW);
		g.fillOval(ballx, bally, 20, 20);
		tile.DrawTiles((Graphics2D) g);
		g.setColor(Color.GREEN);
		g.setFont(new Font("Times New Roman",Font.BOLD,30));
		g.drawString(""+score,20,550);
		if(bally>550) {
			start =false;
			g.setColor(Color.RED);
			g.setFont(new Font("Times New Roman",Font.BOLD,45));
			g.drawString("GAME OVER", 210, 300);
		}
		if(score>23) {
			start =false;
			g.setColor(Color.GREEN);
			g.setFont(new Font("Times New Roman",Font.BOLD,45));
			g.drawString("YOU WIN", 210, 300);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(start) {
		chances=1;
		repaint();
		moveBall();
		detectCollision();
		}
	}
	
	public void moveBall() {
		ballx+=3*balldirx;
		bally+=3*balldiry;
		
		if(ballx>680)balldirx=-1;else if(ballx<0) balldirx=1;
		
		if(bally>550)balldiry=-1;else if(bally<0) balldiry=1;
	}
	
	public void detectCollision() {
		Rectangle ballrect= new Rectangle(ballx, bally, 20, 20);
		Rectangle paddleRect = new Rectangle(paddle.paddlex,500,90,20);
		if(ballrect.intersects(paddleRect)) {
			if(balldiry==-1) balldiry=1;else balldiry=-1;
		}
		
		for(int i = 0;i<tile.tiles.length;i++) {
			for(int j = 0;j<tile.tiles[0].length;j++){
				if(tile.tiles[i][j]>0) {
					int tilex=j*tile.tilesW;
					int tiley=i*tile.tilesH;
					int tileW = tile.tilesW;
					int tileH = tile.tilesH;
					Rectangle tileRect = new Rectangle(tilex,tiley,tileW,tileH);
					Rectangle ballRect = new Rectangle(ballx,bally,20,20);
					if(tileRect.intersects(ballRect)) {
						tile.settilevalue(0, i, j);
						score++;
						
						if(ballx+20>tilex||ballx<tilex+20)
							if(balldirx==-1) balldirx=1;else balldirx=-1;
						if(bally+20>tiley||ballx<tiley+20)
							if(balldiry==-1) balldiry=1;else balldiry=-1;
					}
				}
			}
		}
		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_SPACE&&chances<1)
			start=true;
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			if(paddle.paddlex<599) {
			paddle.movePaddle(15);
			}
			else
				paddle.paddlex=599;
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			
			if(paddle.paddlex>10) {
				paddle.movePaddle(-15);
			}
				else
					paddle.paddlex=10;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
