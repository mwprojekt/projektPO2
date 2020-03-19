import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.*;


public class PanelGra extends JPanel{
	
	private Statek s = new Statek();
	private int x, y;
	private int shootX, shootY;	
	
	PanelGra(){
		this.setBackground(Color.black);
		 SpaceshipListener monitor = new SpaceshipListener();
		 
		 addMouseMotionListener(monitor);
	     addMouseListener(monitor);
		
	}

	
	   public void paintComponent(Graphics g)
	   {
		  //rysuje statek
	      super.paintComponent(g);
	      s.draw(g,1000);
	          
	   }
	private class SpaceshipListener implements MouseListener, MouseMotionListener
	   {
	      public void mouseMoved(MouseEvent event)
	      {
	         s.move(event.getX(), event.getY());		
	         repaint();
	      }
	      
	      public void mousePressed(MouseEvent event)
	      {
	         s.setShooting(true);					
	         repaint();
	      }

	      public void mouseReleased(MouseEvent event)
	      {
	         s.setShooting(false);				
	         shootX =0;
	         shootY =0;
	         repaint();
	      }
	      public void mouseDragged(MouseEvent event){}
	      public void mouseClicked(MouseEvent event) {}
	      public void mouseEntered(MouseEvent event) {}
	      public void mouseExited(MouseEvent event) {}
	   }
}
