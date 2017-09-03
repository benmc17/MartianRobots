package uk.co.benmcgiveron.redbadger.martianrobots;

/**
 * Provides an interface for executing commands on a robot.
 * 
 * Using a separate interface for commands means more complex commands can be added with affecting
 * the underlying structure of the Robot.
 * 
 * @author Ben
 * @version 1.0
 * @since 1.0
 */
public interface Command {

	public Coords executeCommand(Robot robot, Mars planet);
	
}
