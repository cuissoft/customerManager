package cuissoft.kundenViewer.gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;

public class ViewMain {
	
private JFrame mainFrame;
	
	public ViewMain() {
		mainFrame = new JFrame("View");
		mainFrame.setPreferredSize(new Dimension(1700,1000));
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(new MigLayout("", "[grow]", "[][][]"));
		
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
	
}
