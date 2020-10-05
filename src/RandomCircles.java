
import acm.program.*; 
import acm.graphics.*; 
import acm.util.*;


/* This Program draws a set of ten circles with different sizes, 
 * positions, and colors. Each circle should have a randomly chosen color, 
 * a randomly chosen radius between 5 and 50 pixels, and a randomly chosen position on the canvas, 
 * subject to the condition that the entire circle must fit inside the canvas without extending past the edge 
 */
 
public class RandomCircles extends ConsoleProgram {
	private static final double CIRCLES =10;
	private static final double MAXradius =50;
	private static final double MINradius =5;
	
	public void run () {
		for (int i = 0; i < CIRCLES; i++) {
			double r = rgen.nextDouble(MINradius, MAXradius);
			double x = rgen.nextDouble(0, getWidth() - 2 * r);
			double y = rgen.nextDouble(0, getHeight()- 2 * r);
			GOval circle = new GOval (x, y, 2 * r, 2 * r);
			circle.setFilled(true);
			circle.setColor(rgen.nextColor());
			add(circle);
		}
	}


	private RandomGenerator rgen = RandomGenerator.getInstance ();
}

