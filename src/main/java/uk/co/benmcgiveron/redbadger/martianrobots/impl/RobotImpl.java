package uk.co.benmcgiveron.redbadger.martianrobots.impl;

import java.util.Set;

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
	
	private Set<Coords> robotScents;
	
	public RobotImpl(int x, int y, Orientation orientation, Set<Coords> robotScents) {
		this.location = new Coords(x, y);
		this.orientation = orientation;
		this.robotScents = robotScents;
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
	public Coords getLocation() {
		return location;
	}

	@Override
	public boolean moveForward() {
		int x = location.getX();
		int y = location.getY();

		switch(orientation) {
			case NORTH:
				y++;
				break;
			case SOUTH:
				y--;
				break;
			case EAST:
				x++;
				break;
			case WEST:
				x--;
				break;
		}
		if(hasScent(x, y)) return false;
		
		location.setY(y);
		location.setX(x);
		return true;
	}

	@Override
	public boolean moveBackward() {
		int x = location.getX();
		int y = location.getY();
		
		switch(orientation) {
			case NORTH:
				y--;
				break;
			case SOUTH:
				y++;
				break;
			case EAST:
				x--;
				break;
			case WEST:
				x++;
				break;
		}
		if(hasScent(x, y)) return false;
		
		location.setY(y);
		location.setX(x);
		return true;
	}

	@Override
	public boolean turnLeft() {
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
		return true;
	}

	@Override
	public boolean turnRight() {
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
		return true;
	}
	
	private boolean hasScent(int x, int y) {
		return robotScents.contains(new Coords(x, y));
	}
}
