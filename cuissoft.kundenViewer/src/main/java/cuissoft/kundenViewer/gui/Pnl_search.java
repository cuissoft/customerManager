package cuissoft.kundenViewer.gui;
import javax.swing.*;
import java.awt.Dimension;
import net.miginfocom.swing.MigLayout;
public class Pnl_search extends JPanel {
	
	public Pnl_search() {

		setLayout(new MigLayout("debug", "[grow]", "[][][]"));
		setPreferredSize(new Dimension(400,650));
		
		JLabel lb_buscar = new JLabel("Buscar: ");
		add(lb_buscar,"split");
		JTextField jtf_buscar = new JTextField(20);
		add(jtf_buscar,"wrap");
		//cuadro lista clientes
		JList li_buscar = new JList();
		li_buscar.setPreferredSize(new Dimension(400,600));
		li_buscar.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		JScrollPane scr_buscar = new JScrollPane(li_buscar);
		scr_buscar.setPreferredSize(new Dimension(200,300));
		
		add(li_buscar);

	}

}
