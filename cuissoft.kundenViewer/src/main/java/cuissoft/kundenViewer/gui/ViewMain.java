package cuissoft.kundenViewer.gui;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.*;
import net.miginfocom.swing.MigLayout;

public class ViewMain implements ActionListener{
	
private JFrame mainFrame;
private JMenuBar barra;
private JMenu file, edit, help;
private JMenuItem exit;
private JButton btn1,btn2;
private JDialog vent2;
private JPanel panel;
public JTextField buscar;

	public ViewMain() {
		
		panel = new JPanel();
		barra = new JMenuBar();
		file = new JMenu("File");
		edit = new JMenu("Edit");
	    help = new JMenu("Help");
	    exit = new JMenuItem("Exit");
	    btn1 = new JButton("Press Here");
	    vent2 = new JDialog();
	    buscar = new JTextField(20);
	    btn2 = new JButton("come back");
	    
		barra.add(file);
		barra.add(edit);
		barra.add(help);
		file.add(exit);
		exit.addActionListener(this);
		btn1.addActionListener(this);
		
		vent2.setBounds(0,0,500,550);
		vent2.setLocationRelativeTo(null);
		vent2.add(btn2);
		
		panel.setLayout(new MigLayout());
		
		mainFrame = new JFrame("View");
		mainFrame.setPreferredSize(new Dimension(1700,1000));
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(new MigLayout("debug", "[grow]", "[][][]"));
		mainFrame.add(barra,"wrap");
		mainFrame.add(buscar);
		mainFrame.add(btn1,"wrap");
		mainFrame.add(panel);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exit) {
			int answer=JOptionPane.showConfirmDialog(null,"Are you sure to exit?","Exit",JOptionPane.YES_NO_OPTION);
			if(answer==0) {
				System.exit(0);
			}
		}
		if(e.getSource()==btn1) {
			vent2.setVisible(true);
		}
	}
	
	
	public void showWindows() {
		
		
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
	
}
