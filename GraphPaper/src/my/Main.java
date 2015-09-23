/**
 * 
 */
package my;

/**
 * @author Siddharth
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				GraphFrame gf = new GraphFrame();
				
				// add some content to the frame
				//GraphPanel gp = new GraphPanel();
				GraphPanel gp = new GraphPanelThatListensToKey();
				// add it to frame's content pane
				gf.getContentPane().add(gp);
				
				//pack the contents
				gf.pack();
				// display the frame
				gf.setVisible(true);
			}
		});

	}

}
