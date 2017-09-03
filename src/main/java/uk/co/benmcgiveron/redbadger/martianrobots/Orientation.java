package uk.co.benmcgiveron.redbadger.martianrobots;

/**
 * Basic enum for representing orientation (NORTH, SOUTH, EAST, WEST)
 * 
 * @author Ben
 * @version 1.0
 * @since 1.0
 */
public enum Orientation {
	NORTH("N"),
	SOUTH("S"),
	EAST("E"),
	WEST("W");
	
	private String stringRepresentation;
	
	private Orientation(String stringRepresentation) {
		this.stringRepresentation = stringRepresentation;
	}
	
	@Override
	public String toString() {
		return stringRepresentation;
	}
	
	public static Orientation fromString(String orientation) {
		for(Orientation o : Orientation.values()) {
			if(o.toString().equals(orientation)) return o;
		}
		return null;
	}
}
