package cuissoft.kundenViewer.gui;

import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class GuiComponents {

	
	public JMenuBar getMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		
		// menu FILE
		JMenu menuFile = new JMenu("File");
		
		JMenuItem exit = new JMenuItem(new AbstractAction("Exit"){
			@Override
		      public void actionPerformed(final ActionEvent e) {
				int result = JOptionPane.showConfirmDialog((Component) null, "Are you shure to quit?",
				        "alert", JOptionPane.OK_CANCEL_OPTION);
				if (result == 0) {
					System.exit(0);
				}
		      }
		});
		
		//menu SOURCE
		JMenu menuSource = new JMenu("Source");
		
		JMenuItem config = new JMenuItem(new AbstractAction("Config") {
			 public void actionPerformed(final ActionEvent e) {
				 
				 
			 }
		});		
		menuSource.add(config);

		//  add all menu into the menuBar
		menuBar.add(menuFile);
		menuBar.add(menuSource);
		menuBar.add(exit);

		return menuBar;
	}	
}
