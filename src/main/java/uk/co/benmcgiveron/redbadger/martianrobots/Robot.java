package uk.co.benmcgiveron.redbadger.martianrobots;

/**
 * <code>Robot</code>
 * Handles the movement of a robot on a surface
 * 
 * @author Ben
 * @version 1.0
 * @since 1.0
 */
public interface Robot {

	Orientation getOrientation();
	
	int getX();
	
	int getY();
	
	boolean moveForward();
	
	boolean moveBackward();
	
	boolean turnLeft();
	
	boolean turnRight();
}
