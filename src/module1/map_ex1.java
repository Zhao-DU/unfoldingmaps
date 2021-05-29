package module1;

import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.providers.*;
import de.fhpotsdam.unfolding.utils.*;

public class map_ex1 extends PApplet{
	
    UnfoldingMap map;
    
    public void setup() {
        size(800, 600);
        
        map = new UnfoldingMap(this, new Microsoft.AerialProvider());
        
        // Show map around the location in the given zoom level.
        map.zoomAndPanTo(new Location(52.5f, 13.4f), 10);
 
        // Add mouse and keyboard interactions
        MapUtils.createDefaultEventDispatcher(this, map);
    }
 
    public void draw() {
        
    	map.draw();
    	
    	Location location = map.getLocation(mouseX, mouseY);
    	
    	fill(0);
    	
    	/*
    	 * @args:
    	 * String: text to display
    	 * float x: x coordinate of where text is to be displayed 
    	 * float y: y coordinate of where text is to be displayed 
    	 */
    	text(location.getLat() + ", " + location.getLon(), mouseX, mouseY);
    }
 

}
