package demos;

/**
 * A class to illustrate class design and use. Used in module 2 of the UC San
 * Diego MOOC Object Oriented Programming in Java
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * 
 *
 */
public class SimpleLocation {
	
	//Better to make everything private
	private double latitude;
	private double longitude;
	
	/**
	 * @param lat
	 * @param longit
	 */
	public SimpleLocation(double lat, double longit) {
		this.latitude = lat;
		this.longitude = longit;
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
	
		if(latitude < -180 || latitude > 180){
			System.out.println("Illegal value for latitude");
		} else {
			this.latitude = latitude;
		}
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	//Getter
	public String getLocation() {
		return "(" + String.valueOf(this.latitude) + "," + String.valueOf(longitude)+ ")";
	}
	
	public void setLocation(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	//Default constructor with location of UCSD
	public SimpleLocation() {
		this.latitude = 32.9;
		this.longitude = -117.2;
	}

	
	
	// Returns the distance in km between this SimpleLocation using a private method
	public double distance(SimpleLocation other) {
		return getDist(this.latitude, this.longitude, other.latitude, other.longitude);
	}

	private double getDist(double lat1, double lon1, double lat2, double lon2) {
		int R = 6373; // radius of the earth in kilometres
		double lat1rad = Math.toRadians(lat1);
		double lat2rad = Math.toRadians(lat2);
		double deltaLat = Math.toRadians(lat2 - lat1);
		double deltaLon = Math.toRadians(lon2 - lon1);

		double a = Math.sin(deltaLat / 2) * Math.sin(deltaLat / 2)
				+ Math.cos(lat1rad) * Math.cos(lat2rad) * Math.sin(deltaLon / 2) * Math.sin(deltaLon / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

		double d = R * c;
		return d;
	}
	
	public static void main(String[] args) {
		System.out.println("Inside main of SimpleLocation");
	}

}
