package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	//SCREEN SETTINGS
	final int originalTileSize = 16; // 16x16px tile
	final int scale = 3;
	
	final int tileSize = originalTileSize * scale; // 48x48px tile

	final int maxScreenCol = 16;
	final int maxScreenRow = 12;
	final int screenWidth = tileSize * maxScreenCol; //768px
	final int screenHeight = tileSize * maxScreenRow; //576px
	
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.BLACK);
		this.setDoubleBuffered(true);
	}
}
