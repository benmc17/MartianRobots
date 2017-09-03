package uk.co.benmcgiveron.redbadger.martianrobots.commands;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uk.co.benmcgiveron.redbadger.martianrobots.Command;

public class CommandFactoryTest {

	private CommandFactory factory;
	
	@Before
	public void setup() {
		factory = CommandFactory.getInstance();
	}
	
	@Test
	public void moveForwardTest() {
		Command command = factory.newCommand('F');
		
		assertNotNull(command);
		assertTrue(command instanceof MoveForward);
	}
	
	@Test
	public void moveLeftTest() {
		Command command = factory.newCommand('L');
		
		assertNotNull(command);
		assertTrue(command instanceof MoveLeft);
	}
	
	@Test
	public void moveRightTest() {
		Command command = factory.newCommand('R');
		
		assertNotNull(command);
		assertTrue(command instanceof MoveRight);
	}
	
	@Test
	public void incorrectCommand() {
		Command command = factory.newCommand('T');
		
		assertNull(command);
	}
}
