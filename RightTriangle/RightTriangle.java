// right triangle class

public class RightTriangle {
	private double base;
  private double height;

  /**
	 * constructor
	 * pre: none
	 * post: RightTriangle object created.
	 */
	public RightTriangle() {
		this.base = 1;
    this.height = 1;
	}
	
  /**
	 * sets the height of triangle
	 * pre: double newHeight
	 * post: this.height updated to new height.
	 */
	public void setHeight(double newHeight){
	 	this.height = newHeight;
	}

  /**
	 * sets the base of triangle
	 * pre: double newBase
	 * post: this.base updated to new base.
	 */
  public void setBase(double newBase){
	 	this.base = newBase;
	}

  /**
	 * returns the base of the triangle
	 * pre: none
	 * post: returns triangle base
	 */
	public double getBase() {
	 	return(this.base);
	}

  /**
	 * returns the height 
	 * pre: none
	 * post: returns triangle height
	 */
  public double getHeight() {
	 	return(this.height);
	}
	
  /**
	 * returns triangle area
	 * pre: none
	 * post: returns triangle area.
	 */
  public double getArea(){
    return(this.base*this.height*0.5);
  }

}