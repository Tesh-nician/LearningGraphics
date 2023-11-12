package TwoDGraphics;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsStarter extends JPanel{
	public static void main (String[] args) {
		JFrame window;
		 window = new JFrame("Java Graphics");
		 window.setContentPane(new GraphicsStarter());
		 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 window.pack();
		 window.setResizable(false);
		 Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		 window.setLocation(
				 (screen.width - window.getWidth())/2,
				 (screen.height - window.getHeight())/2 );
		 window.setVisible(true);		
		
	} //end main
	
	private float pixelSize;
	
	public GraphicsStarter() {
		setPreferredSize(new Dimension(800,600));
	}
	
}
