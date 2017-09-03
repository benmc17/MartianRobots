package uk.co.benmcgiveron.redbadger.martianrobots.commands;

import uk.co.benmcgiveron.redbadger.martianrobots.Command;
import uk.co.benmcgiveron.redbadger.martianrobots.Coords;
import uk.co.benmcgiveron.redbadger.martianrobots.Mars;
import uk.co.benmcgiveron.redbadger.martianrobots.Robot;

public class MoveForward implements Command {

	@Override
	public Coords executeCommand(Robot robot, Mars planet) {
		if(robot == null)  return null;

		int currentX = robot.getX();
		int currentY = robot.getY();
		
		robot.moveForward();
		boolean isOnMars =  planet.isOnMars(robot);
		
		if(!isOnMars) {
			return new Coords(currentX, currentY);
		} else {
			return robot.getLocation();
		}
	}
}
