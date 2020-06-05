package cuissoft.kundenViewer.gui;

import java.awt.Dimension;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

public class Pnl_gral extends JPanel {
	private JLabel dir,telf,fch_nac,cat,nom,foto;
	private JButton cargarFoto, edit, cancelar, behandlugshistorie;
	
	public Pnl_gral() {
		
		setLayout(new MigLayout("debug", "[][][]50[]", "[][][][][]100[]"));
		setPreferredSize(new Dimension(750,650));
		
		nom = new JLabel("Nombre");
		behandlugshistorie =  new JButton("behandlugshistorie");
		foto = new JLabel();
		dir = new JLabel("Direccion: ");
		telf = new JLabel("Telefono: ");
		fch_nac = new JLabel("Fecha de Nacimiento: ");
		cat = new JLabel("Categoria: ");
		edit = new JButton("Edit");
		cancelar =  new JButton("Cancelar");
		cargarFoto = new JButton("Cargar Foto");
		
		foto.setPreferredSize(new Dimension(200,200));
		
		
		add(nom);
		add(behandlugshistorie);
		add(foto,"wrap, span 1 6");
		add(dir,"wrap");
		add(telf,"wrap");
		add(fch_nac,"wrap");
		add(cat,"wrap");
		add(cargarFoto,"wrap");
		add(edit);
		add(cancelar);
		
	}

}
