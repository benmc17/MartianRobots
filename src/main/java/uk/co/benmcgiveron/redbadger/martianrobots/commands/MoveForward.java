package uk.co.benmcgiveron.redbadger.martianrobots.commands;

import uk.co.benmcgiveron.redbadger.martianrobots.Command;
import uk.co.benmcgiveron.redbadger.martianrobots.Robot;

public class MoveForward implements Command {

	@Override
	public boolean executeCommand(Robot robot) {
		if(robot == null)  return false;
		robot.moveForward();
		return true;
	}
}
