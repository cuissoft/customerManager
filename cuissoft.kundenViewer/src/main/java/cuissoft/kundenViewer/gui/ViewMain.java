package cuissoft.kundenViewer.gui;

import javax.swing.*;
import java.awt.Dimension;
import net.miginfocom.swing.MigLayout;

public class ViewMain{
	
	
	private JFrame mainFrame;
	private GuiPanels PanelForMainGui;
	private JTable tblKundeList;
	private JTextField txfSearch;
	private JMenuBar myMainMenuBar;

	public ViewMain() {
		
		
		mainFrame = new JFrame("View");
		mainFrame.setPreferredSize(new Dimension(700,600));
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(new MigLayout("debug", "[grow]", "[][][]"));

		PanelForMainGui = new GuiPanels();
		tblKundeList = new JTable();
		txfSearch = new JTextField();
		myMainMenuBar= new JMenuBar();
		

	}
	
	
	
	public void showWindows() {
		
		mainFrame.setJMenuBar(PanelForMainGui.GetMenuBar(myMainMenuBar));
		
		mainFrame.add(PanelForMainGui.GetPanelKundenTable(tblKundeList, txfSearch));
		
		mainFrame.add(PanelForMainGui.GetPanelInformation());

		mainFrame.pack();
		mainFrame.setVisible(true);
	}
	
	
	
	
	
}


