package cuissoft.kundenViewer.gui;

import javax.swing.*;
import java.awt.Dimension;
import net.miginfocom.swing.MigLayout;

public class ViewMain{
	
private JFrame mainFrame;

	public ViewMain() {
		
		
		mainFrame = new JFrame("View");
		mainFrame.setPreferredSize(new Dimension(1700,1000));
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(new MigLayout("debug", "[grow]", "[][][]"));
		//Añadiendo la barra y los paneles de busqueda y el panel general
		mainFrame.add(new Barra(),"wrap");
		mainFrame.add(new Pnl_search());
		mainFrame.add(new Pnl_gral());
	}
	
	
	public void showWindows() {
		
		
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
	
}
