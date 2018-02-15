package pa03;
import java.awt.*;
import java.util.Random;

public class RomanCircle extends CircleShape {
	
	private Random randomizer = new Random();
	private int red = (int)(randomizer.nextInt(255));
	private int green = (int)(red+randomizer.nextInt(255))%256;
	private int blue = (int)(green+randomizer.nextInt(255))%256;
	private Color myColor;
	private Color borderColor;
	private Font tr;
	
	private double vr=1.0;

	/**
	 * create a radius changing circle and set the color to yellow
	 */
	public RomanCircle(){
		super();
		this.myColor = new Color (red,green,blue,100); // transparent blue
		this.borderColor = new Color(green,blue,red);
		this.tr = new Font("TimesRoman", Font.BOLD, 30);
	}

	/**
	 * update the circle as usual, but also change the radius. If it gets too big,
	 * then start it shrinking, if it gets too small then start it growing.
	 */
	public void update(double dt){
    // change the properties of the CircleShape after dt seconds have elapsed.

		this.radius += dt*vr;
	
	    if  (this.radius <10)
	    	this.vr *= -1;
	    else if (this.radius > 50)
	    	this.vr *= -1;
			super.update(dt);
	}

	
    public void draw( Graphics g ) {
		int u = (int)(x-radius);
		int v = (int)(y-radius);
		int w = (int)(2*radius);
		int h = w;
		g.setColor( myColor );
        g.fillOval( u,v,w,h );
        g.setColor( borderColor );
        g.drawOval(u,v,w,h );
        g.setFont(tr);
		g.setColor(Color.BLACK);
		g.drawString("ROMAN",200,100);
    }

}
