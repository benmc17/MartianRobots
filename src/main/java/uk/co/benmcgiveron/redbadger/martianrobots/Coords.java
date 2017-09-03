package uk.co.benmcgiveron.redbadger.martianrobots;

public class Coords {

	private int x = 0;
	
	private int y = 0;
	
	public Coords(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public boolean equals(Object object) {
		if(!(object instanceof Coords)) return false;
		
		Coords compare = (Coords)object;
		return compare.x == this.x && compare.y == this.y;
	}
	
	@Override
	public int hashCode() {
		return x + y / 2;
	}
}
