


import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class DrawingProgram extends JFrame{
	Drawing drawing = new Drawing ();
	
	Image offScreenImage = null;
	Dimension screenDimension = null;
	
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
		int right = insets.right;
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, dimen.width, dimen.height);
		
		drawing.draw(g);
		g.setColor(Color.BLACK);
		String str = drawing.toString();
		
		g.setColor(Color.YELLOW);
		g.fillRect(0, top, dimen.width, 20);
		
		
	}
	

	public static void main(String[] args) {
		DrawingProgram dp = new DrawingProgram();
		Scanner keyboard = new Scanner(System.in);
		
		boolean continueFlag = true;
		while(continueFlag) {
			System.out.println("Cmds: r, o, l, s, q, ?, f, d, b, m, g");
			String str = keyboard.next().toLowerCase();
			if (str.length() == 0) continue;
			
			switch (str.charAt(0)) {
			case 'r':
				dp.drawing.setDrawType(DrawType.rectangle);
				break;
			case 'o':
				dp.drawing.setDrawType(DrawType.oval);
				break;
			case 'l':
				dp.drawing.setDrawType(DrawType.line);
				break;
			case 's':
				dp.drawing.setDrawType(DrawType.scribble);
				break;
			case 'q':
				continueFlag = false;
				break;
			case 'f':
				dp.drawing.setFilled(true);
				break;
			case 'd':
				dp.drawing.setFilled(false);
				break;
			case 'b':
				dp.drawing.setColor(Color.BLUE);
				break;
			case 'm':
				dp.drawing.setColor(Color.MAGENTA);
				break;
			case 'g':
				dp.drawing.setColor(Color.GREEN);
				break;
			default: // '?' calls this routine 
				System.out.println("r - drawType = Rectangle");
				System.out.println("o - drawType = Oval");
				System.out.println("l - drawType = Line");
				System.out.println("s - drawType = Scribble");
				System.out.println("q - quit");
				System.out.println("f - filled objects");
				System.out.println("d - draw objects (not filled)");
				System.out.println("b - use blue color");
				System.out.println("m - use magenta color");
				System.out.println("g - use green color");
				break;
			}
		}
		System.out.println("Exiting the Drawing Program");
		dp.dispose();
		keyboard.close();

	}

}

import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class DrawingProgram extends JFrame{
	Drawing drawing = new Drawing ();
	
	Image offScreenImage = null;
	Dimension screenDimension = null;
	
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
		DrawingProgram dp = new DrawingProgram();
		Scanner keyboard = new Scanner(System.in);
		
		boolean continueFlag = true;
		while(continueFlag) {
			System.out.println("Cmds: r, o, l, s, q, ?, f, d, b, m, g");
			String str = keyboard.next().toLowerCase();
			if (str.length() == 0) continue;
			
			switch (str.charAt(0)) {
			case 'r':
				dp.drawing.setDrawType(DrawType.rectangle);
				break;
			case 'o':
				dp.drawing.setDrawType(DrawType.oval);
				break;
			case 'l':
				dp.drawing.setDrawType(DrawType.line);
				break;
			case 's':
				dp.drawing.setDrawType(DrawType.scribble);
				break;
			case 'q':
				continueFlag = false;
				break;
			case 'f':
				dp.drawing.setFilled(true);
				break;
			case 'd':
				dp.drawing.setFilled(false);
				break;
			case 'b':
				dp.drawing.setColor(Color.BLUE);
				break;
			case 'm':
				dp.drawing.setColor(Color.MAGENTA);
				break;
			case 'g':
				dp.drawing.setColor(Color.GREEN);
				break;
			default: 
				System.out.println("r - drawType = Rectangle");
				System.out.println("o - drawType = Oval");
				System.out.println("l - drawType = Line");
				System.out.println("s - drawType = Scribble");
				System.out.println("q - quit");
				System.out.println("f - filled objects");
				System.out.println("d - draw objects (not filled)");
				System.out.println("b - use blue color");
				System.out.println("m - use magenta color");
				System.out.println("g - use green color");
				break;
			}
		}
		System.out.println("Exiting the Drawing Program");
		dp.dispose();
		keyboard.close();

	}

}
