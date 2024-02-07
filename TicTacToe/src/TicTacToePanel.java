// Tic-Tac-Toe Panel
// Written by: Mr. Swope
// Date: May 18th, 2015
// This project extends the Jpanel class. In order to draw items on this panel you need use the Graphics2D's methods.
// Update these comments by writing when, who and how you modified this class.
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class TicTacToePanel extends JPanel implements MouseListener{

	private int[][] board;  // two-dimensional array of characters.  When x or o click on the a square
	// you'll add an x or o to the corresponding location in this array.

	private int turn;		 // will equal x or o to represent who's turn it is.


	// method: TicTacToePanel Constructor
	// description: This 'method' runs when a new instance of this class in instantiated.  It sets default values  
	// that are necessary to run this project.  
	public TicTacToePanel(){
		setPreferredSize(new Dimension(300, 300));
		this.setFocusable(true);			// for mouselistener
		this.addMouseListener(this);

		


		board = new int [3][3];
		turn = -1;
	}

	// method: paintComponent
	// description: This method is called when the Panel is painted.  It contains 
	// code that draws shapes onto the panel.
	// parameters: Graphics g - this object is used to draw shapes onto the JPanel.
	// return: void
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

		g2.setColor(Color.GRAY);
		g2.fillRect(0, 0, 300, 300);
		g2.setColor(Color.BLUE); 

		ImageIcon xImage;
		ImageIcon oImage;
		// this code loads an image so that you can later paint it onto your component.
		// this would load a picture named x.png that should be saved in a folder
		// named images, which should be located in your src folder.
		// these images were downloaded from imageicon.com.  you can download other 
		// images from this website to use instead of these.
		ClassLoader cldr = this.getClass().getClassLoader();
		String imagePath = "images/x.png";
		URL imageURL = cldr.getResource(imagePath);
		xImage = new ImageIcon(imageURL);

		imagePath = "images/o.png";
		imageURL = cldr.getResource(imagePath);
		oImage = new ImageIcon(imageURL);
		// draw the grid for the tic-tac-toe board.  you should make each square about 100x100.
		g2.fillRect(100, 0, 2, 300);
		g2.fillRect(200, 0, 2, 300);
		g2.fillRect(0, 100, 300, 2);
		g2.fillRect(0, 200, 300, 2);

		// this is how you paint your image. the last two parameters are the x and y coordinates 
		// of the top left hand corner of the image.
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == -1){
					xImage.paintIcon(this, g2, i*100, j*100);
				}
				if (board[i][j] == 1){
					oImage.paintIcon(this, g2, i*100, j*100);
				}
			}
		}

		// Display a message if either x or o has won the game.
		if(checkWinner()) {
			if( turn == 1) {
				g2.drawString("X Wins!", 150, 150);
			}
			else {
				g2.drawString("O Wins!", 150, 150);
			}
		}
		

	}

	// Check to see if x or o have won the game.
	public boolean checkWinner(){
		for(int i = 0; i<3; i++) {
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != 0) {
				return true;
			}
			if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != 0) {
				return true;
			}
		}
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0) {
			return true;
		}
		if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != 0) {
			return true;
		}
		return false;
	}

	@Override
	// This method should detect which row and column the user clicked in, add their piece to the board,
	// switch who's turn it is and then repaint the board.  Also, you shouldn't allow anything to happen
	// if x or o has won.
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse clicked x-value = " + e.getX() + " y-value = " + e.getY());
		if(!checkWinner()) {
			board[e.getX()/100][e.getY()/100] = turn;
			turn *= -1;
		}
		this.repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
