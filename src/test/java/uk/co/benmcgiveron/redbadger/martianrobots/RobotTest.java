package uk.co.benmcgiveron.redbadger.martianrobots;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import uk.co.benmcgiveron.redbadger.martianrobots.impl.RobotImpl;

public class RobotTest {

	private Set<Coords> scents;
	
	@Before
	public void setup() {
		scents = new HashSet<Coords>();
	}

	@Test
	public void moveForwardWhereScentTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.NORTH, scents);
		
		scents.add(new Coords(10, 21));
		
		assertFalse(testRobot.moveForward());
		
		int newX = testRobot.getX();
		int newY = testRobot.getY();
		
		assertEquals(10, newX);
		assertEquals(20, newY);
	}
	
	@Test
	public void moveBackwardWhereScentTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.NORTH, scents);
		
		scents.add(new Coords(10, 19));
		scents.add(new Coords(6, 4));
		
		assertFalse(testRobot.moveBackward());
		
		int newX = testRobot.getX();
		int newY = testRobot.getY();
		
		assertEquals(10, newX);
		assertEquals(20, newY);
	}
	
	@Test
	public void moveForwardNorthTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.NORTH, scents);
		
		assertTrue(testRobot.moveForward());
		
		int newX = testRobot.getX();
		int newY = testRobot.getY();
		
		assertEquals(10, newX);
		assertEquals(21, newY);
	}
	
	@Test
	public void moveBackwardsNorthTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.NORTH, scents);
		
		assertTrue(testRobot.moveBackward());
		
		int newX = testRobot.getX();
		int newY = testRobot.getY();
		
		assertEquals(10, newX);
		assertEquals(19, newY);
	}
	
	@Test
	public void moveForwardSouthTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.SOUTH, scents);
		
		assertTrue(testRobot.moveForward());
		
		int newX = testRobot.getX();
		int newY = testRobot.getY();
		
		assertEquals(10, newX);
		assertEquals(19, newY);
	}
	
	@Test
	public void moveBackwardsSouthTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.SOUTH, scents);
		
		assertTrue(testRobot.moveBackward());
		
		int newX = testRobot.getX();
		int newY = testRobot.getY();
		
		assertEquals(10, newX);
		assertEquals(21, newY);
	}
	
	@Test
	public void moveForwardEastTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.EAST, scents);
		
		assertTrue(testRobot.moveForward());
		
		int newX = testRobot.getX();
		int newY = testRobot.getY();
		
		assertEquals(11, newX);
		assertEquals(20, newY);
	}
	
	@Test
	public void moveBackwardsEastTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.EAST, scents);
		
		assertTrue(testRobot.moveBackward());
		
		int newX = testRobot.getX();
		int newY = testRobot.getY();
		
		assertEquals(9, newX);
		assertEquals(20, newY);
	}
	
	@Test
	public void moveForwardWestTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.WEST, scents);
		
		assertTrue(testRobot.moveForward());
		
		int newX = testRobot.getX();
		int newY = testRobot.getY();
		
		assertEquals(9, newX);
		assertEquals(20, newY);
	}
	
	@Test
	public void moveBackwardsWestTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.WEST, scents);
		
		assertTrue(testRobot.moveBackward());
		
		int newX = testRobot.getX();
		int newY = testRobot.getY();
		
		assertEquals(11, newX);
		assertEquals(20, newY);
	}
	
	@Test
	public void turnLeftNorthTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.NORTH, scents);
		
		assertTrue(testRobot.turnLeft());
		
		assertEquals(Orientation.WEST, testRobot.getOrientation());
	}
	
	@Test
	public void turnLeftSouthTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.SOUTH, scents);
		
		assertTrue(testRobot.turnLeft());
		
		assertEquals(Orientation.EAST, testRobot.getOrientation());
	}
	
	@Test
	public void turnLeftEastTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.EAST, scents);
		
		assertTrue(testRobot.turnLeft());
		
		assertEquals(Orientation.NORTH, testRobot.getOrientation());
	}
	
	@Test
	public void turnLeftWestTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.WEST, scents);
		
		assertTrue(testRobot.turnLeft());
		
		assertEquals(Orientation.SOUTH, testRobot.getOrientation());
	}
	
	@Test
	public void turnRightNorthTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.NORTH, scents);
		
		assertTrue(testRobot.turnRight());
		
		assertEquals(Orientation.EAST, testRobot.getOrientation());
	}
	
	@Test
	public void turnRightSouthTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.SOUTH, scents);
		
		assertTrue(testRobot.turnRight());
		
		assertEquals(Orientation.WEST, testRobot.getOrientation());
	}
	
	@Test
	public void turnRightEastTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.EAST, scents);
		
		assertTrue(testRobot.turnRight());
		
		assertEquals(Orientation.SOUTH, testRobot.getOrientation());
	}
	
	@Test
	public void turnRightWestTest() {
		final Robot testRobot = new RobotImpl(10, 20, Orientation.WEST, scents);
		
		assertTrue(testRobot.turnRight());
		
		assertEquals(Orientation.NORTH, testRobot.getOrientation());
	}
}
