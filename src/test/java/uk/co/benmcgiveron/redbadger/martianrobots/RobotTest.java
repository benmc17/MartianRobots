package uk.co.benmcgiveron.redbadger.martianrobots;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.benmcgiveron.redbadger.martianrobots.impl.RobotImpl;

public class RobotTest {

	@Test
	public void moveForwardNorthTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.NORTH);
		
		testRobot.moveForward();
		
		int newX = testRobot.getX();
		int newY = testRobot.getY();
		
		assertEquals(10, newX);
		assertEquals(21, newY);
	}
	
	@Test
	public void moveBackwardsNorthTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.NORTH);
		
		testRobot.moveBackward();
		
		int newX = testRobot.getX();
		int newY = testRobot.getY();
		
		assertEquals(10, newX);
		assertEquals(19, newY);
	}
	
	@Test
	public void moveForwardSouthTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.SOUTH);
		
		testRobot.moveForward();
		
		int newX = testRobot.getX();
		int newY = testRobot.getY();
		
		assertEquals(10, newX);
		assertEquals(19, newY);
	}
	
	@Test
	public void moveBackwardsSouthTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.SOUTH);
		
		testRobot.moveBackward();
		
		int newX = testRobot.getX();
		int newY = testRobot.getY();
		
		assertEquals(10, newX);
		assertEquals(21, newY);
	}
	
	@Test
	public void moveForwardEastTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.EAST);
		
		testRobot.moveForward();
		
		int newX = testRobot.getX();
		int newY = testRobot.getY();
		
		assertEquals(11, newX);
		assertEquals(20, newY);
	}
	
	@Test
	public void moveBackwardsEastTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.EAST);
		
		testRobot.moveBackward();
		
		int newX = testRobot.getX();
		int newY = testRobot.getY();
		
		assertEquals(9, newX);
		assertEquals(20, newY);
	}
	
	@Test
	public void moveForwardWestTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.WEST);
		
		testRobot.moveForward();
		
		int newX = testRobot.getX();
		int newY = testRobot.getY();
		
		assertEquals(9, newX);
		assertEquals(20, newY);
	}
	
	@Test
	public void moveBackwardsWestTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.WEST);
		
		testRobot.moveBackward();
		
		int newX = testRobot.getX();
		int newY = testRobot.getY();
		
		assertEquals(11, newX);
		assertEquals(20, newY);
	}
	
	@Test
	public void turnLeftNorthTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.NORTH);
		
		testRobot.turnLeft();
		
		assertEquals(Orientation.WEST, testRobot.getOrientation());
	}
	
	@Test
	public void turnLeftSouthTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.SOUTH);
		
		testRobot.turnLeft();
		
		assertEquals(Orientation.EAST, testRobot.getOrientation());
	}
	
	@Test
	public void turnLeftEastTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.EAST);
		
		testRobot.turnLeft();
		
		assertEquals(Orientation.NORTH, testRobot.getOrientation());
	}
	
	@Test
	public void turnLeftWestTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.WEST);
		
		testRobot.turnLeft();
		
		assertEquals(Orientation.SOUTH, testRobot.getOrientation());
	}
	
	@Test
	public void turnRightNorthTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.NORTH);
		
		testRobot.turnRight();
		
		assertEquals(Orientation.EAST, testRobot.getOrientation());
	}
	
	@Test
	public void turnRightSouthTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.SOUTH);
		
		testRobot.turnRight();
		
		assertEquals(Orientation.WEST, testRobot.getOrientation());
	}
	
	@Test
	public void turnRightEastTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.EAST);
		
		testRobot.turnRight();
		
		assertEquals(Orientation.SOUTH, testRobot.getOrientation());
	}
	
	@Test
	public void turnRightWestTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.WEST);
		
		testRobot.turnRight();
		
		assertEquals(Orientation.NORTH, testRobot.getOrientation());
	}
}
