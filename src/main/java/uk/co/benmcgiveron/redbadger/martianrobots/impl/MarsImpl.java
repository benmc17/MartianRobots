package uk.co.benmcgiveron.redbadger.martianrobots.impl;

import uk.co.benmcgiveron.redbadger.martianrobots.Coords;
import uk.co.benmcgiveron.redbadger.martianrobots.Mars;
import uk.co.benmcgiveron.redbadger.martianrobots.Robot;

/**
 * <code>Mars</code>
 * Handles the state of the planet Mars
 * 
 * @author Ben
 * @version 1.0
 * @since 1.0
 */
public class MarsImpl implements Mars {

	private Coords bounds;
	
	public MarsImpl(int x, int y) {
		bounds = new Coords(x, y);
	}

	@Override
	public boolean isOnMars(Robot robot) {
		final int x = robot.getX();
		final int y = robot.getY();
		
		if(x < 0 || y < 0) {
			return false;
		} else if(x > bounds.getX() || y > bounds.getY()) {
			return false;
		}
		return true;
	}
}
