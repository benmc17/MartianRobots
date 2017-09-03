package uk.co.benmcgiveron.redbadger.martianrobots;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uk.co.benmcgiveron.redbadger.martianrobots.impl.MarsImpl;

public class MarsTest {

	private Mars testMars;
	
	@Before
	public void setup() {
		this.testMars = new MarsImpl(10, 10);
	}
	
	@Test
	public void moveOffNorth() {
		boolean isOnMars = this.testMars.isOnMars(new TestRobot() {
			@Override
			public int getX() {
				return 6;
			}

			@Override
			public int getY() {
				return 11;
			}
		});
		assertFalse(isOnMars);
	}
	
	@Test
	public void moveOffSouth() {
		boolean isOnMars = this.testMars.isOnMars(new TestRobot() {
			@Override
			public int getX() {
				return 6;
			}

			@Override
			public int getY() {
				return -1;
			}
		});
		assertFalse(isOnMars);
	}
	
	@Test
	public void moveOffEast() {
		boolean isOnMars = this.testMars.isOnMars(new TestRobot() {
			@Override
			public int getX() {
				return 11;
			}

			@Override
			public int getY() {
				return 4;
			}
		});
		assertFalse(isOnMars);
	}
	
	@Test
	public void moveOffWest() {
		boolean isOnMars = this.testMars.isOnMars(new TestRobot() {
			@Override
			public int getX() {
				return -1;
			}

			@Override
			public int getY() {
				return 4;
			}
		});
		assertFalse(isOnMars);
	}
	
	@Test
	public void currentlyOnMars() {
		boolean isOnMars = this.testMars.isOnMars(new TestRobot() {
			@Override
			public int getX() {
				return 1;
			}

			@Override
			public int getY() {
				return 4;
			}
		});
		assertTrue(isOnMars);
	}
	
	@Test
	public void currentlyOnMarsUpper() {
		boolean isOnMars = this.testMars.isOnMars(new TestRobot() {
			@Override
			public int getX() {
				return 9;
			}

			@Override
			public int getY() {
				return 9;
			}
		});
		assertTrue(isOnMars);
	}
	
	@Test
	public void currentlyOnMarsLower() {
		boolean isOnMars = this.testMars.isOnMars(new TestRobot() {
			@Override
			public int getX() {
				return 0;
			}

			@Override
			public int getY() {
				return 0;
			}
		});
		assertTrue(isOnMars);
	}
	
	private abstract class TestRobot implements Robot {
		@Override
		public Orientation getOrientation() {
			return null;
		}

		@Override
		public boolean moveForward() {return true;}

		@Override
		public boolean moveBackward() {return true;}

		@Override
		public boolean turnLeft() {return true;}

		@Override
		public boolean turnRight() {return true;}
	}
}
