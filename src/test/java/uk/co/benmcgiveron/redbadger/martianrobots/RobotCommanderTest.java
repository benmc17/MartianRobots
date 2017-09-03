package uk.co.benmcgiveron.redbadger.martianrobots;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import uk.co.benmcgiveron.redbadger.martianrobots.util.SystemOutReader;

public class RobotCommanderTest {

	private SystemOutReader reader;
	
	private RobotCommander robotCommander;
	
	@Before
	public void setup() {
		reader = new SystemOutReader();
		robotCommander = new RobotCommander();
	}
	
	@After
	public void after() {
		reader.close();
	}
	
	@Test
	public void sampleInputTest() {
		boolean result = robotCommander.commandRobot(new File("src/test/resources/sampleinput.txt"));
		
		String expected = "1 1 E\r\n3 3 N LOST\r\n2 3 S\r\n";
		assertTrue(result);
		assertEquals(expected, reader.getOutput());
	}
	
	@Test
	public void dodgyFileInputTest() {
		boolean result = robotCommander.commandRobot(new File("src/test/resources/dodgyrobotcommands.txt"));
		assertFalse(result);
		
		String expected = "Error: Unable to execute commands, there could be an unrecognised command?";
		assertEquals(expected, reader.getOutput());
	}
	
	@Test
	public void invalidOrientationTest() {
		boolean result = robotCommander.commandRobot(new File("src/test/resources/invalidorientation.txt"));
		assertFalse(result);
		
		String expected = "Error: A robot has an invalid orientation, it could be floating in space?";
		assertEquals(expected, reader.getOutput());
	}
	
	@Test
	public void nonExistantFileInputTest() {
		boolean result = robotCommander.commandRobot(new File("src/test/resources/nonexistantfile.txt"));
		assertFalse(result);
		
		String expected = "Error: input file does not exist";
		assertEquals(expected, reader.getOutput());
	}
}
