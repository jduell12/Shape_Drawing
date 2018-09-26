

import java.awt.*;
import java.util.*;

enum DrawType {scribble, oval, rectangle, polygon, line};

class DrawingProperties {
	DrawType drawType;
	boolean filled;
	Color color;
	
	DrawingProperties(DrawType drawType, Color color, boolean filled){
		this.drawType = drawType;
		this.color = color;
		this.filled = filled;
	}
	
	public String toString() {
		return drawType + "color = " + color + " filled = " + filled;
	}
}

public class Drawing {

	DrawingProperties drawingProperties = new DrawingProperties(DrawType.rectangle, Color.BLUE, false);
	ArrayList<Shape> shapeArr = new ArrayList<Shape>();
	Shape inProgress = null;
	
	public String toString() {
		return drawingProperties.toString();
	}
	
	
	
}
