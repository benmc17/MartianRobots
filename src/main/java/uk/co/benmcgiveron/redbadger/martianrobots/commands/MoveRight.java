package uk.co.benmcgiveron.redbadger.martianrobots.commands;

import uk.co.benmcgiveron.redbadger.martianrobots.Command;
import uk.co.benmcgiveron.redbadger.martianrobots.Coords;
import uk.co.benmcgiveron.redbadger.martianrobots.Mars;
import uk.co.benmcgiveron.redbadger.martianrobots.Robot;

public class MoveRight implements Command {

	@Override
	public Coords executeCommand(Robot robot, Mars planet) {
		if(robot == null)  return null;
		robot.turnRight();
		return robot.getLocation();
	}
}
