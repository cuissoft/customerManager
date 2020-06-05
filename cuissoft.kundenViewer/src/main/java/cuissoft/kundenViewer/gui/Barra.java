package cuissoft.kundenViewer.gui;
import javax.swing.*;

public class Barra extends JMenuBar{
	
	private JMenu file, edit, help;
	private JMenuItem exit;
	
	public Barra() {
		
		file = new JMenu("File");
		edit = new JMenu("Edit");
	    help = new JMenu("Help");
	    exit = new JMenuItem("Exit");
	    
	    add(file);
	    add(edit);
	    add(help);
	    
	    file.add(exit);
		
	}

}
