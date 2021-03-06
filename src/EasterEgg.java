/*
 * 	[EasterEgg.java]
 * 
 * 	Author: Philip Huang, Jim Gao, Joseph Zhang
 * 	Purpose: The easter egg xD
 */

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;

public class EasterEgg {

	/*
	 * 	Constant value of the number of windows shown
	 */
	public static final int windowCount = 100;

	/*
	 * 	Thread to pop up window saying "TEAM NULL FTW"
	 */
	public static class TrollThread extends JFrame implements Runnable {
		
		private static final long serialVersionUID = 750593413758163897L;

		public int randomX() {
			return (int) (Math.random() * 1920.0D) + 1;
		}

		public int randomY() {
			return (int) (Math.random() * 1080.0D) + 1;
		}
		
		//constructor
		public TrollThread() {
			setSize(400, 200);
			setDefaultCloseOperation(1);
			setLayout(null);
			setLocation(randomX(), randomY());
			
			//initialize label
			JLabel l = new JLabel("TEAM NULL FTW");
			l.setFont(new Font("Courier New", 1, 40));
			l.setBounds(0, 0, 780, 180);
			add(l);

		}

		public void run() {
			setVisible(true);
		}
	}
	
	// pop up windowCount numbers of window
	public EasterEgg() {
		for (int i = 0; i < windowCount; i++)
			new Thread(new TrollThread()).start();
	}

}
