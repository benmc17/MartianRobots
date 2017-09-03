package uk.co.benmcgiveron.redbadger.martianrobots.commands;

import uk.co.benmcgiveron.redbadger.martianrobots.Command;
import uk.co.benmcgiveron.redbadger.martianrobots.Robot;

public class MoveRight implements Command {

	@Override
	public boolean executeCommand(Robot robot) {
		if(robot == null)  return false;
		robot.turnRight();
		return true;
	}
}
