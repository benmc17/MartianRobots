package uk.co.benmcgiveron.redbadger.martianrobots.impl;

import uk.co.benmcgiveron.redbadger.martianrobots.Coords;
import uk.co.benmcgiveron.redbadger.martianrobots.Orientation;
import uk.co.benmcgiveron.redbadger.martianrobots.Robot;

/**
 * <code>Robot</code>
 * Handles the movement of a robot on a surface
 * 
 * @author Ben
 * @version 1.0
 * @since 1.0
 */
public class RobotImpl implements Robot {

	private Coords location;
	
	private Orientation orientation;
	
	public RobotImpl(int x, int y, Orientation orientation) {
		this.location = new Coords(x, y);
		this.orientation = orientation;
	}
	
	@Override
	public Orientation getOrientation() {
		return orientation;
	}

	@Override
	public int getX() {
		return location.getX();
	}

	@Override
	public int getY() {
		return location.getY();
	}

	@Override
	public void moveForward() {
		int x = location.getX();
		int y = location.getY();
		
		switch(orientation) {
			case NORTH:
				location.setY(y+1);
				break;
			case SOUTH:
				location.setY(y-1);
				break;
			case EAST:
				location.setX(x+1);
				break;
			case WEST:
				location.setX(x-1);
				break;
		}
	}

	@Override
	public void moveBackward() {
		int x = location.getX();
		int y = location.getY();
		
		switch(orientation) {
			case NORTH:
				location.setY(y-1);
				break;
			case SOUTH:
				location.setY(y+1);
				break;
			case EAST:
				location.setX(x-1);
				break;
			case WEST:
				location.setX(x+1);
				break;
		}
	}

	@Override
	public void turnLeft() {
		switch(orientation) {
			case NORTH:
				orientation = Orientation.WEST;
				break;
			case SOUTH:
				orientation = Orientation.EAST;
				break;
			case EAST:
				orientation = Orientation.NORTH;
				break;
			case WEST:
				orientation = Orientation.SOUTH;
				break;
		}
	}

	@Override
	public void turnRight() {
		switch(orientation) {
			case NORTH:
				orientation = Orientation.EAST;
				break;
			case SOUTH:
				orientation = Orientation.WEST;
				break;
			case EAST:
				orientation = Orientation.SOUTH;
				break;
			case WEST:
				orientation = Orientation.NORTH;
				break;
		}
	}
}
