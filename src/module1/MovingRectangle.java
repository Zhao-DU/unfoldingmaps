package module1;

import processing.core.*;

public class MovingRectangle extends PApplet {
	
	public void setup() {
		size(1000, 1000);
	}
	
	
	//Overrides the draw method in the superclass 
	public void draw() {
//		rect(10, 5, 50, 30);
		
		int x = (int) (Math.random() * getWidth());
		int y = (int) (Math.random() * getHeight());
		
		background(0.8F, 0.0F, 0.0F);
		
		frameRate(10);
		
		rect(x, y, 50, 30);
	}
	
}
