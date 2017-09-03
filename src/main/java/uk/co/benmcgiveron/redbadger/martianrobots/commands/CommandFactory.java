package uk.co.benmcgiveron.redbadger.martianrobots.commands;

import uk.co.benmcgiveron.redbadger.martianrobots.Command;

/**
 * Factory class to create commands from the input characters, keeping the command
 * implementation separate from the Robot/Mars business logic.
 * 
 * This also makes it simple add new commands in the future.
 * 
 * @author Ben
 * @version 1.0
 * @since 1.0
 */
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
