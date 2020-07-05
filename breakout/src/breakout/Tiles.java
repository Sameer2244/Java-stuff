package breakout;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Tiles {
	public int[][] tiles;
	public int tilesW;
	public int tilesH;
	public Tiles(int col,int row) {
		tiles= new int[row][col];
		for(int i = 0;i<tiles.length;i++) {
			for(int j = 0;j<tiles[0].length;j++){
				tiles[i][j]=1;
			}
		}
		tilesW=620/col;
		tilesH=150/row;
	}
	
	
	public void DrawTiles(Graphics2D g) {
		for(int i = 0;i<tiles.length;i++) {
			for(int j = 0;j<tiles[0].length;j++){
				if(tiles[i][j]>0) {
					g.setColor(Color.RED);
					g.fillRect(j*tilesW+40,i*tilesH+20 , tilesW, tilesH);
					
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.BLACK);
					g.drawRect(j*tilesW+40,i*tilesH+20 , tilesW, tilesH);
				}
			}
		}
	}
	
	public void settilevalue(int value,int i,int j) {
		tiles[i][j]=value;
	}
}
