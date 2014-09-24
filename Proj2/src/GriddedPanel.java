import java.awt.BasicStroke; 
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.Graphics2D; 
import java.awt.geom.Line2D; 
import javax.swing.JPanel; 

public class GriddedPanel 

extends JPanel { 

	
	public GriddedPanel(int[][] inputArr)
	{
		
	}
	
public void paintComponent(Graphics g) { 

	// fill with the color you want
	int wide = getWidth(); 
	int tall = getHeight(); 
	g.setColor(Color.white); 
	g.fillRect(0, 0, wide, tall); 

	// go into Graphics2D for all the fine art, more options 
	// optional, here I just get variable Stroke sizes 
	Graphics2D g2 = (Graphics2D) g; 
	double w = (double)wide / 330.0; 
	double h = (double)tall / 330.0; 
	System.out.println(wide);
	g2.setColor(Color.black); 

	g2.setStroke(new BasicStroke(1)); 
	// the verticles 
	for (int i = 1; i < 330; i++) { 
		Line2D line = new Line2D.Double(i * w, 0, i * w, tall); 
			g2.draw(line); 
	} 
	// the horizontals 
	/*
	for (int i = 1; i < 330; i++) { 
		Line2D line2 = new Line2D.Double(0, i * h, wide, i * h); 
		g2.draw(line2); 
	} */

// that will have a little glitch with the integer math 
// the grid will have the bottom row slightly larger 
// to overcome that, you must use double 

	/*
	g2.setColor(Color.cyan); 
	double rowH = getHeight() / 330.0; 
	for (int i = 1; i < 330; i++) { 
			Line2D line = new Line2D.Double(0.0, (double) i * rowH, 
					(double) getWidth(), (double) i * rowH); 
			g2.draw(line); 
	} */

} 
}