/**
 * 
 */
package my;

import java.awt.LayoutManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Siddharth
 *
 */
public class GraphPanelThatListensToKey extends GraphPanel implements KeyListener{

	/**
	 * 
	 */
	public GraphPanelThatListensToKey() {
		// TODO Auto-generated constructor stub
		super(); // call parent's ctor
		addKeyListener(this);
		setFocusable(true);
		
	}

	/**
	 * @param layout
	 */
	public GraphPanelThatListensToKey(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param isDoubleBuffered
	 */
	public GraphPanelThatListensToKey(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param layout
	 * @param isDoubleBuffered
	 */
	public GraphPanelThatListensToKey(LayoutManager layout,
			boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char key = e.getKeyChar();
		System.out.println(key);
		/**
		if (key == 'Q') {
			System.out.println("up and left");
		} else if (key == 'W') {
			System.out.println("up");
		} else if (key == 'E') {
			System.out.println("up and right");
		} else if (key == 'A') {
			System.out.println("left");
		} else {
			System.out.println("Unrecognized key: " + key);
		}
		 */
		//use switch statement instead of long if then else if...
		switch(key) {
		case 'D':
			System.out.println("right");
			break;
		case 'Q': 
			System.out.println("up and left");
			break; // end of the block
		case 'W':
			System.out.println("up");
			break;
		case 'E':
			System.out.println("up and right");
			break;
		case 'A':
			System.out.println("left");
			break;
		case 'S':
			System.out.println("sit");
			break;
		default: // for everything else
			System.out.println("Unrecognized key: " + key);
			break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char key = e.getKeyChar(); // 
		//System.out.println(key);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		char key = e.getKeyChar();
		//System.out.println(key);
	}

}
