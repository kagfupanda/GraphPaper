/**
 * 
 */
package my;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;

import javax.swing.JPanel;

/**
 * @author Siddharth
 *
 */
public class GraphPanel extends JPanel {

	/**
	 * final constants
	 */
	private final int WIDTH = 300;
	private final int HEIGHT = 300; 
	private final Dimension GRID = new Dimension(12, 12); //from spec
	/**
	 * 
	 */
	public GraphPanel() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param layout
	 */
	public GraphPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param isDoubleBuffered
	 */
	public GraphPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param layout
	 * @param isDoubleBuffered
	 */
	public GraphPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Dimension getPreferredSize() {
		// TODO Auto-generated method stub
		return new Dimension(WIDTH, HEIGHT);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g); // call the parent to paint the standard stuff like background, etc.
		
		// paint my stuff
		Graphics2D g2d = (Graphics2D) g;
		//g2d.drawLine(0, 0, WIDTH, HEIGHT);
		
		// get the actual size
		Dimension d = getSize();
		//int actualWidth = d.width - 5 * 2;
		//int actualHeight = d.height - 5 * 2;
		for(int i = 0; i <= GRID.width; i++) {
			g2d.drawLine(d.width/GRID.width*i, 0, d.width/GRID.width*i, d.height);
		}
		for(int j = 0; j <= GRID.height; j++) {
			g2d.drawLine(0, d.height/GRID.height*j, d.width, d.height/GRID.height*j);
		}
		
	}
}
