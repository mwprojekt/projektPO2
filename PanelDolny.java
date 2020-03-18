import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelDolny extends JPanel{

	JButton buttonStart;
	JLabel labelCzas, labelZycia, labelBest;
	
	PanelDolny(){
		this.setBackground(Color.GRAY);
		
		buttonStart = new JButton("start");
		buttonStart.setPreferredSize(new Dimension(150, 100));
		this.add(buttonStart);
		
		labelCzas = new JLabel("czas: ");
		this.add(labelCzas);
		labelZycia = new JLabel("zycia: ");
		this.add(labelZycia);
		labelBest = new JLabel("najlepszy wynik: ");
		this.add(labelBest);
	}
	
}
