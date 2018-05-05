public class Drone {
	int x() {
		return this.x;

}
	int y() {
		return this.y;
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
	this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
		}
	
	
	private int x;
	private int y;
	
}