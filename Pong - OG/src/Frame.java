import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame extends JPanel implements KeyListener, ActionListener{
	//Ball Variables
	
	//Left Paddle Variables
	
	//Right Paddle Variables

	
	/* paint is getting called roughly 60x per second 
	 * Call your painting commands here
	 * */
	public void paint(Graphics g) {
		super.paintComponent(g);
		update();
		
		/* draw method calls */

	}
	
	/* update variables here that need to be updated
	 * Try to separate the painting actions from the updating
	 * of variables including collision
	 *  */
	public void update() {
		
		
	}
	
	@Override
	public void keyPressed(KeyEvent key) {
		System.out.println("keyPressed keycode:"+key.getKeyCode());
		if(key.getKeyCode()==83) {
			//'s'

		}
	}

	@Override
	public void keyReleased(KeyEvent key) {
		System.out.println("keyReleased keycode:"+key.getKeyCode());

		if(key.getKeyCode()==83) {
			//'s'
			
		}
		
	}

	@Override
	public void keyTyped(KeyEvent key) {
		
		
	}
	
	/* Do not alter code below */
	public static void main(String[] arg) {
		Frame f = new Frame();
	}	
	
	Timer t;
	/*Setup the Frame
         This is the constructor for the Frame class.
         It helps create the JFrame and Animation Timer. 
	 Do not alter any code here unless you know how!
	*/
	public Frame() {
		JFrame f = new JFrame("Pong");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.addKeyListener(this);
		f.setResizable(false);
		t = new Timer(16, this);
		t.start();
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}
	
}
