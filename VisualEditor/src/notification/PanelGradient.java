package notification;


import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.JPanel;

/**
 * <b>PanelGradient est la classe qui permet de définir un panel sur un fond en dégradé</b>
 * <p>
 * Cette classe est caractérisée par les informations suivantes :
 * <ul>
 * <li>La couleur du coin haut gauche</li>
 * <li>La couleur du coin bas droit</li>
 * </ul>
 * </p>
 * 
 * @author Julien
 * @version 1.0
 *
 */
public class PanelGradient extends JPanel{

	/**
	 * Identifiant utilisé pour la sérialisation
	 */
	private static final long serialVersionUID = 8334369610498563446L;


	/**
	 * La couleur du coin haut gauche
	 */
	private Color couleur1;
	
	/**
	 * La couleur du coin bas droit
	 */
	private Color couleur2;

	
	/**
	 * <b>Constructeur de PanelGradient</b>
	 * @param couleur1
	 * 	La couleur du coin haut gauche
	 * @param couleur2
	 * 	La couleur du coin bas droit
	 */
	public PanelGradient(Color couleur1, Color couleur2) {
		this.couleur1=couleur1;
		this.couleur2=couleur2;
	}

	@Override
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		GradientPaint gradient = new GradientPaint(new Point(0, 0), couleur1, new Point(getWidth(), getHeight()), couleur2);
		g2d.setPaint(gradient);
		g2d.fillRect(0, 0, getWidth(), getHeight());
	}

}
