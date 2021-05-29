package demos;

import org.w3c.dom.Comment;

import processing.core.PApplet;
import processing.core.PImage;

/** 
 * A class to illustrate some use of the PApplet class
 * Used in module 3 of the UC San Diego MOOC Object Oriented Programming in Java
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * 
 *
 */
public class MyPApplet extends PApplet{
	PImage img;
	
	public void setup() {
		//Add setup code for MyPApplet
		size(400,400);				//set canvas size
		background(255);			//set canvas color
		stroke(0);				//set pen color
		img = loadImage("palmTrees.jpg", "jpg");
		
	}
	
	
	/*
	 * width and height are actually occuped in this scope by th size of the canvas 
	 */
	
	
	/**
	 */
	public void draw() {
		//Add drawing code for MyPApplet
		
		
		img.resize(0, height);			//resize loaded image to full height of canvas and let width scale accordingly 
		image(img, 0, 0);			//display image 
		
		//second() reads the local PC's system clock's second value 
		int[] color = sunColorSec(second());		//calculate color code for sun
		fill(color[2],color[1],color[0]);	//set sun color
		ellipse(width/4,height/5,width/5,height/5);	//draw sun
		
		// Keyboard interactions 
		if (keyPressed) {
			    if (key == 'b' || key == 'B') {
			      fill(0);
			    }
			  } else {
			    fill(255);
			  }
			  rect(25, 25, 50, 50);
		// Adds a rectangle which changes color 
		rect(width * 0.75F, height * 0.8F, 50, 30);
		
	}
	
	
	/**
	 * Sets the color of the sun based on the second value in the system clock
	 * <p>
	 * @param seconds values of seconds of the system clock 
	 * @return rgb int[] containing RGB values 
	 */
	public int[] sunColorSec(float seconds)
	{
		int[] rgb = new int[3];
		// Scale the brightness of the yellow based on the seconds.  0 seconds 
		// is bright yellow.  30 seconds is black.
		float diffFrom30 = Math.abs(30-seconds);
		
		float ratio = diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		
		//System.out.println("R" + rgb[0] + " G" + rgb[1] + " B" + rgb[2]);
		return rgb;
	}	
	
	
//	public int[] rectColor(int keyCode)
//	{
//		int[] rgb = new int[3];
//		System.out.println("Inside rectColor" + keyCode);
//		
//		return rgb;
//		
//	}	
	
	public static void main (String[] args) {
		//Add main method for running as application
		PApplet.main(new String[] {"--present", "MyPApplet"});
	}
}


