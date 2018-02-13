package pa03;
import java.awt.*;
import java.util.Random;

public class SpencerCircle extends CircleShape {

  private Random random = new Random();
  private int red = (int)(random.nextInt(255));
  private int green = (int)(random.nextInt(255));
  private int blue = (int)(random.nextInt(255));
  private Color color = new Color(red,green,blue,100);

  public SpencerCircle() {
    super();
    this.color = color;
  }

  public void draw(Graphics g) {
    int u = (int)(x-radius);
    int v = (int)(y-radius);
    int w = (int)(2*radius);
    int h = w;
    g.setColor(this.color);
    g.fillOval(u,v,w,h);
    g.setColor(this.color);
    g.drawOval(u,v,w,h);
    super.draw(g);
  }
}
