package uk.co.benmcgiveron.redbadger.martianrobots.commands;

import uk.co.benmcgiveron.redbadger.martianrobots.Command;
import uk.co.benmcgiveron.redbadger.martianrobots.Robot;

public class MoveLeft implements Command {

	@Override
	public boolean executeCommand(Robot robot) {
		if(robot == null)  return false;
		robot.turnLeft();
		return true;
	}
}
