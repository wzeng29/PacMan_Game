/*Weiyi Zeng
 * 251263642
 * Assignment 4
 * Due Nov.20th
 */
public class Pel {
	
    private Location location;
    private int color;

    public Pel(Location p, int color) {
    	/*
    	 *  A constructor which initializes the new Pel with the specified coordinates and color.
    	 *  Location p is the key attribute for a Pel object.
    	 */
        this.location = p;
        this.color = color;
    }

    public Location getLocation() {
    	//Returns the Location of this Pel
        return location;
    }

    public int getColor() {
    	// Returns the color of this Pel object.s
        return color;
    }
    
}