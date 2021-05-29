package module4;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;
import processing.core.*;

/** Implements a visual marker for ocean earthquakes on an earthquake map
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * @author Your name here
 *
 */
public class OceanQuakeMarker extends EarthquakeMarker {
	
	public OceanQuakeMarker(PointFeature quake) {
		super(quake);
		
		// setting field in earthquake marker
		isOnLand = false;
	}
	

	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		pg.beginDraw();
		pg.rect(x, y, 15, 15);
		if((this.getStringProperty("age")).equals("Past Day")) {
			pg.stroke(0F);;
			pg.line(x, y, x+15F, y+15F);
			pg.line(x+15F, y, x, y+15F);
		}
		pg.endDraw();
		
	}
	


	

}
