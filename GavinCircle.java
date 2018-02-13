package pa03;
import java.awt.*;
import java.util.Random;

public class GavinCircle extends CircleShape {

  //variable
  private double a=69*Math.random();

  //constructor
  private double vr=1.0;

  /**
   * create a radius changing circle and set the color to yellow
   */

  public static int genRandomNum(){
      return (int)(256*Math.random());
  }

  public GavinCircle(){
    super();
    this.color = new java.awt.Color(pa03.GavinCircle.genRandomNum(),pa03.GavinCircle.genRandomNum(),pa03.GavinCircle.genRandomNum(),60); // transparent blue
  }

  /**
   * update the circle as usual, but also change the radius. If it gets too big,
   * then start it shrinking, if it gets too small then start it growing.
   */
  public void update(double dt){
    // change the properties of the CircleShape after dt seconds have elapsed.

    this.radius += dt*vr;
    this.color = new java.awt.Color(pa03.GavinCircle.genRandomNum(),pa03.GavinCircle.genRandomNum(),pa03.GavinCircle.genRandomNum(),60);
    if  (this.radius <10) this.vr *= -1;
    else if (this.radius > 50) this.vr *= -1;
    this.keepOnBoard();

  }

  /**
    change the values of x,y,vx,vy to keep the circle on the board
  */
  public void keepOnBoard(){
    if (this.x < this.radius) {
      // it went off the left edge! do something!
      this.vx = -this.vx*a;
      this.x = this.radius;

    }else if (this.x > CircleShape.boardWidth-this.radius) {
      // it went off the right edge! do something!
      this.vx = -this.vx*a;
      this.x = CircleShape.boardWidth-this.radius;
    }

    if (this.y < this.radius){
      // it went above the top edge!
      this.vy = -this.vy*a;
      this.y = this.radius;

    } else if (this.y > CircleShape.boardHeight-this.radius) {
      // it went below the bottom edge!
      this.vy = -this.vy*a;
      this.y = CircleShape.boardHeight-this.radius;
    }
  }



}
