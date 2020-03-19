import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Statek {
	private int xPos;
	private int yPos;
	private static int height = 50;		
	private static int width = 60;		
	private boolean shooting;
	
	public Statek()
	{
		xPos = 0;				
		yPos = 0;				
		shooting = false;
	}
	
	public void move(int x, int y) {
		xPos = x;				
		yPos = y;			
	}
	
	public void setShooting(boolean value) {
		shooting = value;
	}
	
	public Boolean getShooting() {
		return Boolean.valueOf(shooting);
	}
	
	public Point getPosition() {
		return new Point(xPos, yPos);
	}
	
	public void draw(Graphics g, int laserlength) {
		g.setColor(Color.white);
		g.fillOval(xPos, yPos, width, height);		
		
		g.setColor(Color.red);
		if (shooting)
			g.drawLine(xPos + width, yPos + height/2, laserlength, yPos + height/2);		
	}
}
