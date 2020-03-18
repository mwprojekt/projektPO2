import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class OknoGlowne extends JFrame{

	
	PanelGra panelGra;
	PanelDolny panelDolny;
	
	OknoGlowne(){
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);		
		
		//ustawienia layoutu
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		panelGra = new PanelGra();
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1;
        c.weighty = 0.95;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.BOTH;
        this.add(panelGra, c);
		
        panelDolny = new PanelDolny();
        c.gridy = 1;
        c.weighty = 0.05;
        this.add(panelDolny, c);
        pack();
        setLocationRelativeTo(null);
		
        this.setSize(1000,700); //zablokowaæ!
	}
	
	public static void main(String[] args) {
		OknoGlowne okno = new OknoGlowne();
		okno.setVisible(true);
	}

}
