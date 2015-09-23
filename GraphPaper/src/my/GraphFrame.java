/**
 * 
 */
package my;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

/**
 * @author Siddharth
 *
 */
public class GraphFrame extends JFrame {

	/**
	 * @throws HeadlessException
	 */
	public GraphFrame() throws HeadlessException {
		// TODO Auto-generated constructor stub
		setTitle("Graph Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/**
	 * @param gc
	 */
	public GraphFrame(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public GraphFrame(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @param gc
	 */
	public GraphFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

}
