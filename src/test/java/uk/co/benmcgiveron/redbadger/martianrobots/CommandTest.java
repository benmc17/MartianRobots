package uk.co.benmcgiveron.redbadger.martianrobots;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uk.co.benmcgiveron.redbadger.martianrobots.commands.MoveForward;
import uk.co.benmcgiveron.redbadger.martianrobots.commands.MoveLeft;
import uk.co.benmcgiveron.redbadger.martianrobots.commands.MoveRight;

public class CommandTest {

	private TestRobot testRobot;
	
	@Before
	public void setup() {
		testRobot = new TestRobot();
	}
	
	@Test
	public void nullRobotTest() {
		final Command moveForwardCommand = new MoveForward();
		
		boolean result = moveForwardCommand.executeCommand(null);
		
		assertFalse(result);
	}
	
	@Test
	public void moveForwardTest() {
		final Command moveForwardCommand = new MoveForward();
		
		boolean result = moveForwardCommand.executeCommand(testRobot);
		
		assertTrue(result);
		assertTrue(testRobot.movedForward);
		assertFalse(testRobot.movedBackward);
		assertFalse(testRobot.turnedLeft);
		assertFalse(testRobot.turnedRight);
	}
	
	@Test
	public void moveLeftTest() {
		final Command moveForwardCommand = new MoveLeft();
		
		boolean result = moveForwardCommand.executeCommand(testRobot);
		
		assertTrue(result);
		assertFalse(testRobot.movedForward);
		assertFalse(testRobot.movedBackward);
		assertTrue(testRobot.turnedLeft);
		assertFalse(testRobot.turnedRight);
	}
	
	@Test
	public void moveRightTest() {
		final Command moveForwardCommand = new MoveRight();
		
		boolean result = moveForwardCommand.executeCommand(testRobot);
		
		assertTrue(result);
		assertFalse(testRobot.movedForward);
		assertFalse(testRobot.movedBackward);
		assertFalse(testRobot.turnedLeft);
		assertTrue(testRobot.turnedRight);
	}
	
	private static class TestRobot implements Robot {

		boolean movedForward = false;
		boolean movedBackward = false;
		boolean turnedLeft = false;
		boolean turnedRight = false;
		
		@Override
		public Orientation getOrientation() {
			return null;
		}

		@Override
		public int getX() {
			return 0;
		}

		@Override
		public int getY() {
			return 0;
		}

		@Override
		public boolean moveForward() {
			movedForward = true;
			return true;
		}

		@Override
		public boolean moveBackward() {
			movedBackward = true;
			return true;
		}

		@Override
		public boolean turnLeft() {
			turnedLeft = true;
			return true;
		}

		@Override
		public boolean turnRight() {
			turnedRight = true;
			return true;
		}
	}
}
