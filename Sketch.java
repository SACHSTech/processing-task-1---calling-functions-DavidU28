 /**
  * create a simple drawing using processing.
  * @author: D.Ursu
  */

import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
    
  }

  /** 
   * Called once at the beginning of execution.  Add initial setup
   * values here i.e background, stroke, fill, etc.
   */
  public void setup() {
    background(50, 150, 200);
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // Grass
    fill(100, 250 , 50);
    stroke(0);
    rect(0, 500, 1000, 1000);

    // Sun
    fill(255, 255, 0);
    stroke(0);
    ellipse(20, 30, 200, 200);

    // House
    fill(96, 130, 182);
    stroke(0);
    rect(150, 300, 300, 200);

    triangle(150, 300, 450, 300, 300, 200);
    fill(255, 50, 50);
    rect(275, 400, 75, 100);

    fill(0, 0, 0);
    ellipse(330, 460, 8, 8);

    fill(255);
    rect(190, 330, 48, 48);
    fill(0);
    line(214, 330, 214, 378);
    line(190, 354, 238, 354);
  
  }
  
}
