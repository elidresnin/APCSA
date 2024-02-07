import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class Counter {

	protected ImageIcon image;
	protected int scale;
	protected int x;
	
	public Counter(int x) {
		ClassLoader cldr = this.getClass().getClassLoader();	// These five lines of code load the background picture.
		String imagePath = "images/objects/Counter.png";	// Change this line if you want to use a different 
		URL imageURL = cldr.getResource(imagePath);				// background image.  The image should be saved in the
		scale = 1;
		
		image = new ImageIcon(imageURL);
		
		Image scaled = image.getImage().getScaledInstance(image.getIconWidth() / scale, 
				image.getIconHeight() / scale, Image.SCALE_SMOOTH);
		
		image = new ImageIcon(scaled);
		
		this.x = x;
	}
	
	public Counter() {
		this(0);
	}
	
	public void draw(Component c, Graphics g) {
		image.paintIcon(c, g, x, 629);
	}
	
	public int getHeight() {
		return image.getIconHeight();
	}
	
	public int getWidth() {
		return image.getIconWidth();
	}
	
	public int getX() {
		return x;
	}
	
	
	public void move(int version) {
		if(version==1) {
			if(-1*getX()<image.getIconWidth()) {
				x-=8;

			}
			else
				reset();
		}
		else if(version==0) {
			if(-1*getX()<image.getIconWidth()) {
				x-=12;

			}
			else
				reset();
		}
	}
	public void reset() {
		x = +image.getIconWidth()-20;
	}
	
	public ImageIcon getImage() {
		return image;
	}
	
}
