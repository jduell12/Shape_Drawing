

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class DrawingProgram extends JFrame{
	Drawing drawing = new Drawing ();
	
	class MyMouseHandler extends MouseAdapter {
		public void mousePressed (MouseEvent e) {
			drawing.mousePressed(e.getPoint());
			repaint();
		}
		
		public void mouseReleased (MouseEvent e) {
			drawing.mouseReleased(e.getPoint());
			repaint();
		}
		
		public void mouseDragged (MouseEvent e) {
			drawing.mouseDragged(e.getPoint());
			repaint();
		}
	}
	
	DrawingProgram (){
		super ("My Drawing Program");
		setSize (800, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		MyMouseHandler mmh = new MyMouseHandler();
		addMouseListener(mmh);
		addMouseMotionListener(mmh);
		
		setVisible(true);
	}
	
	public void paint (Graphics g) {
		Dimension dimen = getSize();
		Insets insets = getInsets();
		int top = insets.top;
		int left = insets.left;
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, dimen.width, dimen.height);
		
		drawing.draw(g);
		String str = drawing.toString();
		System.out.println(str);
	}
	

	public static void main(String[] args) {
	

	}

}
