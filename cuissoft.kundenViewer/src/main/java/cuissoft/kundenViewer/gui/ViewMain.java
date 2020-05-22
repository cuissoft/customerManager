package cuissoft.kundenViewer.gui;
import javax.swing.*;
import java.awt.event.*;

import java.awt.Dimension;

import net.miginfocom.swing.MigLayout;

public class ViewMain {
	
private JFrame mainFrame;
	
	public ViewMain() {
		mainFrame = new JFrame("View");
		mainFrame.setPreferredSize(new Dimension(1700,1000));
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(new MigLayout("", "[grow]", "[][][]"));
		JMenuBar barra = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu help = new JMenu("Help");
		JMenuItem exit = new JMenuItem("Exit");
		
		barra.add(file);
		barra.add(edit);
		barra.add(help);
		mainFrame.setJMenuBar(barra);
		file.add(exit);
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer=JOptionPane.showConfirmDialog(null,"Are you sure to exit?","Exit",JOptionPane.YES_NO_OPTION);
						if(answer==0) {
							System.exit(0);
						}		
			}
			
		});
		
		
	}
	
	public void showWindows() {
		
		
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
	
	
}
