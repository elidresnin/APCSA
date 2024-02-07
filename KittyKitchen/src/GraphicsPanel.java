// Class: GraphicsPanel
// Written by: Mr. Swope
// Date: 1/27/2020
// Description: This class is the main class for this project.  It extends the Jpanel class and will be drawn on
// 				on the JPanel in the GraphicsMain class.  
//
// Since you will modify this class you should add comments that describe when and how you modified the class.  

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GraphicsPanel extends JPanel implements KeyListener{

	private Timer timer;					// The timer is used to move objects at a consistent time interval.

	private Background background1;			// The background object will display a picture in the background.
	private Background background2;			// There has to be two background objects for scrolling.
	private Counter counter1;
	private Counter counter2;


	private Sprite sprite;					// create a Sprite object
	private Item bowl;
	private Item soup;
	private Item syrup;
	private Item whisk;
	// This declares an Item object. You can make a Item display
	// pretty much any image that you would like by passing it
	// the path for the image.
	private ArrayList<Item> items;
	private int boxCounter;
	private Item[] randItems;
	private int rand;

	public GraphicsPanel(){
		background1 = new Background();	// You can set the background variable equal to an instance of any of  
		background2 = new Background(-background1.getImage().getIconWidth());		
		counter1 = new Counter();	// You can set the background variable equal to an instance of any of  
		counter2 = new Counter(-counter1.getImage().getIconWidth());		
		
		/*
		 * Instansiates all of our 
		 */
		bowl = new Item(1000, 500, "images/objects/Bowl.png", 1); 
		soup = new Item(1000, 480, "images/objects/Soup.png", 1);  
		syrup = new Item(1000, 450, "images/objects/Syrup.png", 1);  
		whisk = new Item(1000, 300, "images/objects/Whisk.png", 1);  
		
		randItems = new Item[4];
		randItems[0] = bowl;
		randItems[1] = soup;
		randItems[2] = syrup;
		randItems[3] = whisk;


		rand = 0;

		// The Item constructor has 4 parameters - the x coordinate, y coordinate
		// the path for the image, and the scale. The scale is used to make the
		// image smaller, so the bigger the scale, the smaller the image will be.
		items = new ArrayList<Item>();

		sprite = new Sprite(50, 432);			
		// The Sprite constuctor has two parameter - - the x coordinate and y coordinate

		setPreferredSize(new Dimension(background1.getImage().getIconWidth(),
				background2.getImage().getIconHeight()));  
		// This line of code sets the dimension of the panel equal to the dimensions
		// of the background image.

		timer = new Timer(24, new ClockListener(this));   // This object will call the ClockListener's
		// action performed method every 15 milliseconds once the 
		// timer is started. You can change how frequently this
		// method is called by changing the first parameter.

		boxCounter = 0;
		timer.start();
		this.setFocusable(true);					     // for keylistener
		this.addKeyListener(this);
	}

	// method: paintComponent
	// description: This method will paint the items onto the graphics panel.  This method is called when the panel is
	//   			first rendered.  It can also be called by this.repaint(). You'll want to draw each of your objects.
	//				This is the only place that you can draw objects.
	// parameters: Graphics g - This object is used to draw your images onto the graphics panel.
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

		background1.draw(this, g);
		background2.draw(this, g);
		counter1.draw(this, g);
		counter2.draw(this, g);

		
		
		sprite.draw(g2, this);
		
		
		g2.setColor(Color.RED);
		Rectangle r = sprite.getBounds();
		g2.draw(r);
		

		for(int i = 0; i < items.size(); i++)
			items.get(i).draw(g2, this);

	}

	// method:clock
	// description: This method is called by the clocklistener every 5 milliseconds.  You should update the coordinates
	//				of one of your characters in this method so that it moves as time changes.  After you update the
	//				coordinates you should repaint the panel. 
	public void clock(){
		
		rand = (int)(Math.random()*4);
		sprite.move(this);
		
		background1.move(1);
		background2.move(1);
		
		counter1.move(0);
		counter2.move(0);

		
		
		boxCounter++;
		if(boxCounter % 200 == 0)
			items.add(randItems[rand]);

		// You can also check to see if two objects intersect like this. In this case if the sprite collides with the
		// item, the item will get smaller. 
//		if(sprite.collision(item) && sprite.getY() < item.getY()) {
//			System.out.println("stop");
//			sprite.stop_Vertical();
//		}

		for(int i = 0; i < items.size(); i++)
			items.get(i).move(this);

		System.out.println(sprite.getX());
		System.out.println(sprite.getY());
		this.repaint();
	}

	// method: keyPressed()
	// description: This method is called when a key is pressed. You can determine which key is pressed using the 
	//				KeyEvent object.  For example if(e.getKeyCode() == KeyEvent.VK_LEFT) would test to see if
	//				the left key was pressed.
	// parameters: KeyEvent e
	@Override
	public void keyPressed(KeyEvent e) {


		if(e.getKeyCode() == KeyEvent.VK_SPACE)
			sprite.jump();
			

	}

	// This function will play the sound "fileName".
	public static void playSound(String fileName) {
		try {
			File url = new File(fileName);
			Clip clip = AudioSystem.getClip();

			AudioInputStream ais = AudioSystem.getAudioInputStream(url);
			clip.open(ais);
			clip.start();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// method: keyTyped()
	// description: This method is called when a key is pressed and released. It basically combines the keyPressed and
	//              keyReleased functions.  You can determine which key is typed using the KeyEvent object.  
	//				For example if(e.getKeyCode() == KeyEvent.VK_LEFT) would test to see if the left key was typed.
	//				You probably don't want to do much in this method, but instead want to implement the keyPresses and keyReleased methods.
	// parameters: KeyEvent e
	@Override
	public void keyTyped(KeyEvent e) {


	}

	// method: keyReleased()
	// description: This method is called when a key is released. You can determine which key is released using the 
	//				KeyEvent object.  For example if(e.getKeyCode() == KeyEvent.VK_LEFT) would test to see if
	//				the left key was pressed.
	// parameters: KeyEvent e
	@Override
	public void keyReleased(KeyEvent e) {

		if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_LEFT)
			sprite.idle();
		else if(e.getKeyCode() ==  KeyEvent.VK_UP || e.getKeyCode() ==  KeyEvent.VK_DOWN)
			sprite.stop_Vertical();
		else if(e.getKeyCode() ==  KeyEvent.VK_SPACE)
			sprite.slowDown();

	}

}
