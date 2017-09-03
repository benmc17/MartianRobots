package uk.co.benmcgiveron.redbadger.martianrobots;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import uk.co.benmcgiveron.redbadger.martianrobots.commands.CommandFactory;
import uk.co.benmcgiveron.redbadger.martianrobots.impl.MarsImpl;
import uk.co.benmcgiveron.redbadger.martianrobots.impl.RobotImpl;

public class RobotCommander {

	public static void main(String[] args) {
		System.exit(execute(args));
	}
	
	private static int execute(String[] args) {
		if(args == null || args.length < 1) {
			System.out.println("Error: please specify an input command file");
			return 1;
		}
		
		String fileName = args[0];
		
		final File inputCommands = new File(fileName);
		
		final RobotCommander robotCommander = new RobotCommander();
		return robotCommander.commandRobot(inputCommands) ? 0 : 1;
	}
	
	/**
	 * orchestrates the operation and prints the output
	 * 
	 * @param inputCommands
	 * @return false if operation fails, true otherwise
	 */
	public boolean commandRobot(File inputCommands) {
		if(!inputCommands.exists() || inputCommands.isDirectory()) {
			System.out.print("Error: input file does not exist");
			return false;
		}
		Mars mars = null;
		
		try (Scanner in = new Scanner(inputCommands)) {
			int marsX = in.nextInt();
			int marsY = in.nextInt();
			
			final Set<Coords> scents = new HashSet<Coords>();
			mars = new MarsImpl(marsX, marsY);

			while(in.hasNext()) {
				int robotX = in.nextInt();
				int robotY = in.nextInt();
				Orientation orientation = Orientation.fromString(in.next());
				
				if(orientation == null) {
					System.out.print("Error: A robot has an invalid orientation, it could be floating in space?");
					return false;
				}
				Robot robot = new RobotImpl(robotX, robotY, orientation, scents);
				
				if(!executeCommands(robot, in.next())) {
					System.out.print("Error: Unable to execute commands, there could be an unrecognised command?");
					return false;
				}
				System.out.printf("%d %d %s", robot.getX(), robot.getY(), robot.getOrientation());

				if(!mars.isOnMars(robot)) {
					System.out.print(" LOST");
				}
				System.out.println();
			}
		} catch(Exception ex) {
			System.out.print("Error: The input file might be incorrectly formatted");
			ex.printStackTrace();
			return false;
		}
		return true;
	}
	
	/**
	 * Executes the input commands.
	 * 
	 * @param robot
	 * @param commandLine
	 * @return false if operation fails, true otherwise
	 */
	private static boolean executeCommands(Robot robot, String commandLine) {
		if(commandLine == null) return false;
		
		final char[] commandChars = commandLine.toCharArray();
		final CommandFactory factory = CommandFactory.getInstance();
		
		for(char commandChar : commandChars) {
			Command command = factory.newCommand(commandChar);
			
			if(command == null) {
				return false;
			}
			if(!command.executeCommand(robot)) {
				System.out.printf("Failed to execute command: %s", commandChar);
				return false;
			}
		}
		return true;
	}
}
