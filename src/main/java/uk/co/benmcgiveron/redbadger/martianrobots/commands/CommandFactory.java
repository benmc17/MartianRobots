package uk.co.benmcgiveron.redbadger.martianrobots.commands;

import uk.co.benmcgiveron.redbadger.martianrobots.Command;

public class CommandFactory {

	private static CommandFactory INSTANCE = null;
	
	public static CommandFactory getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new CommandFactory();
		}
		return INSTANCE;
	}
	
	public Command newCommand(char commandType) {
		switch(commandType) {
			case 'F':
				return new MoveForward();
			case 'L':
				return new MoveLeft();
			case 'R':
				return new MoveRight();
			default:
				return null;
		}
	}
}
