package cuissoft.kundenViewer.gui;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class GuiPanels extends JPanel{

	private GuiComponents myComponent = new GuiComponents();
	private JTable tblKunde;
	private JTextField txfSearch;
	private JMenuBar myMainMenuBar;
	
	public JMenuBar GetMenuBar(JMenuBar myMainMenuBar) {
		
		this.myMainMenuBar = myMainMenuBar;
		myMainMenuBar = myComponent.getMenuBar();
		
		
		return myMainMenuBar;
		
	}
	
		
	public JPanel GetPanelKundenTable(JTable tblKundeList, JTextField txfSearch) {
		
		JPanel myPanel= new JPanel();
		myPanel.setLayout(new MigLayout("debug", "[grow]", "[]"));
				
		this.tblKunde = tblKundeList;
		this.txfSearch = txfSearch;
		
		txfSearch.setPreferredSize(new Dimension(300, 24));
		
		JLabel lblSearch = new JLabel("Suche");
		myPanel.add(lblSearch, "split");
		myPanel.add(txfSearch, "wrap");
		myPanel.add(new JScrollPane(tblKunde), "grow");
		
		return myPanel;
		
	}
	
	
	public JPanel GetPanelInformation() {
		
		JPanel myPanel= new JPanel();
		myPanel.setLayout(new MigLayout("debug", "[grow]", "[]"));
		
		JLabel lblAdresse = new JLabel("Adresse:");
		
		JLabel lblTelefon = new JLabel("Telefon:");
		
		
		JLabel lblGeburstag = new JLabel("Gebursta:");
		
		
		JLabel lblCategorie = new JLabel("Categorie:");
		
		
				
		txfSearch.setPreferredSize(new Dimension(300, 24));
			
		
		myPanel.add(lblAdresse, "wrap");
		myPanel.add(lblTelefon, "wrap");
		myPanel.add(lblGeburstag, "wrap");
		myPanel.add(lblCategorie, "wrap");
		
		
		return myPanel;
		
	}
	
}
