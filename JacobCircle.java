
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class JacobCircle extends CircleShape{

/*
add and use a new instance variable
access one of the original instance variables
override the default Constructor and have it called "super()" and then set the color of the circle to a unique color for your class
override one or more of  the draw method, the update method or the keep on board method.
*/
  private static int vIncrease = 0;

  public JacobCircle(){
    super();
    this.color = color.BLACK;
    vIncrease *=2;
  }

  public void draw(Graphics g) {
    int u = (int)(x-radius);
    int v = (int)(y-radius);
    int w = (int)(2*radius);
    int h = w;
    Random rand = new Random();
    g.setColor(new Color ((int)(rand.nextInt(255)), (int)(rand.nextInt(255)), (int)(rand.nextInt(255))));
    g.fillRect(u,v,w,h);
    g.setColor(this.color);
    g.drawRect(u,v,w,h);
    super.draw(g);
  }

  public void update(double dt){
    // change the properties of the CircleShape after dt seconds have elapsed.
    this.x += dt*vx + vIncrease;  // for now they do not move
    this.y += dt*vy + vIncrease;

    this.keepOnBoard();
  }

}
