
public class movement {

	public static void main (String[] args) {
		Drone r = new Drone ();
		
		r.setX(0);
		r.setY(0);

		r.move (10,20);
		
		System.out.println (r.x());
		System.out.println (r.y());
		
		
		
		
	}

}
